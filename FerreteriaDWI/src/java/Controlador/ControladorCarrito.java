package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import Entidad.Item;
import Entidad.Producto;
import Entidad.Venta;
import Modelo.DAOFactory;
import Modelo.ProductoDAO;
import Modelo.VentaDAO;
import java.util.Calendar;
import java.util.List;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author Anibal
 */
@WebServlet(name = "ControladorCarrito", urlPatterns = {"/ControladorCarrito"})
public class ControladorCarrito extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorProducto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");


            }
    }

        
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
            String tipo = request.getParameter("opcion");

            if(tipo.equals("agrega"))
            {
                agregar(request, response);
            }
            else if(tipo.equals("elimina"))
                {
                    eliminar(request, response);
                }
            else if(tipo.equals("ActualizarCantidad")){
                Actualizar(request,response);
            }
            else if(tipo.equals("venta")){
                venta(request,response);
            }
            else if(tipo.equals("reporte")){
                reporte(request,response);
            }

    }
        
    protected void agregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        int pos=0;
        int cantidad=1;
        
        HttpSession sesionUsuario = request.getSession();
        ArrayList<Item> carrito = new ArrayList<Item>();
        
        if(sesionUsuario.getAttribute("shoppingCart")!=null)
            carrito = (ArrayList) sesionUsuario.getAttribute("shoppingCart");
        //Obtiene el total acumulado
        double total=0;
        if(sesionUsuario.getAttribute("total")!=null)
            total = (Double) sesionUsuario.getAttribute("total");
        
        
        int codigo = Integer.parseInt(request.getParameter("id"));
        DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        ProductoDAO daoProducto = factory.getProducto();
        
        Producto dtoProducto = daoProducto.list(codigo);
        if(carrito.size()>0){
            for (int i = 0; i < carrito.size(); i++) {
                if(codigo== carrito.get(i).getId()){
                    pos=i;
                }
            }
            if(codigo== carrito.get(pos).getId()){
                 cantidad= carrito.get(pos).getCantidad()+cantidad;
                 double subtotal=carrito.get(pos).getPrecio()*cantidad;
                 carrito.get(pos).setCantidad(cantidad);
                 carrito.get(pos).setSubtotal(subtotal);
            }else{
                //Crea un Nuevo Item y lo agrega al Array List
                Item nuevoItem = new Item(
                dtoProducto.getCodigo(), 
                dtoProducto.getDescripcion(), 
                dtoProducto.getPrecio());
                dtoProducto.getCantidad();
                dtoProducto.getSubtotal();
                carrito.add(nuevoItem); 
            }
        }else{
            //Crea un Nuevo Item y lo agrega al Array List
        Item nuevoItem = new Item(
                dtoProducto.getCodigo(), 
                dtoProducto.getDescripcion(), 
                dtoProducto.getPrecio());
                dtoProducto.getCantidad();
                dtoProducto.getSubtotal();
        carrito.add(nuevoItem); 
        }    
        
        //Actualiza el Carrito de Compras, escribe en variable Sesion
        sesionUsuario.setAttribute("shoppingCart", carrito);
        //Actualiza el total 
        total = total + dtoProducto.getPrecio();
        sesionUsuario.setAttribute("total", total);
        //llamada a la página Catalogo de productos
        //request.getRequestDispatcher("ServletProducto?tipo=catalogo").forward(request,response);
        RequestDispatcher rd = request.getRequestDispatcher("productos.jsp");
        rd.forward(request,response);
      //  response.sendRedirect("catalogoProductos.jsp");
    }

    protected void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession sesionUsuario = request.getSession();
        ArrayList carrito = (ArrayList) sesionUsuario.getAttribute("shoppingCart");
        //Obtiene el total acumulado
        double total = (Double) sesionUsuario.getAttribute("total");
        //recibe el nro del elemento eliminado
        int nro = Integer.parseInt(request.getParameter("nro"));
        
        //actualiza el total acumulado
        Item itemEliminado = (Item) carrito.get(nro);
        total = total - itemEliminado.getPrecio();
        sesionUsuario.setAttribute("total", total);
        //elimina el Item dentro del Carrito de Compras
        carrito.remove(nro);
        //actualiza el carrito de compras, variable de sesion
        sesionUsuario.setAttribute("shoppingCart", carrito);
        
        response.sendRedirect("carritoCompras.jsp");

    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    protected void Actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession sesionUsuario = request.getSession();
        
        ArrayList<Item> carrito = new ArrayList<Item>();
        carrito = (ArrayList) sesionUsuario.getAttribute("shoppingCart");
        //verifica si variable de sesion existe
        double total = (Double) sesionUsuario.getAttribute("total");
       
        
        int nro = Integer.parseInt(request.getParameter("nro"));
        int cant= Integer.parseInt(request.getParameter("Cantidad"));
        for (int i = 0; i < carrito.size(); i++) { 
            if(carrito.get(i).getId()==nro){
                carrito.get(i).setCantidad(cant);
                 total=carrito.get(i).getPrecio()*cant;
                carrito.get(i).setSubtotal(total);
            }
        }
        sesionUsuario.setAttribute("total", total);
        //actualiza el carrito de compras, variable de sesion
        sesionUsuario.setAttribute("shoppingCart", carrito);
        response.sendRedirect("carritoCompras.jsp");
    }
    
    protected void venta (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession sesionUsuario = request.getSession();
        
        ArrayList<Item> carrito = new ArrayList<Item>();
        carrito = (ArrayList) sesionUsuario.getAttribute("shoppingCart");
        //verifica si variable de sesion existe
        double total = (Double) sesionUsuario.getAttribute("total");
        
        VentaDAO vdao = new VentaDAO();
        Venta v = new Venta();
        
        
        
        Calendar calendar = Calendar.getInstance();
        int a = calendar.get(1);
        int m = (calendar.get(2)+1);
        int d = (calendar.get(3)-16);
        String nom = request.getParameter("txtNomCliente");
        String fecha = ""+d+"-"+m+"-"+a;
        double tot = Double.parseDouble(request.getParameter("txtTotal"));
        String dni = request.getParameter("txtDocumentoCliente");
        int cantidad = Integer.parseInt(request.getParameter("txtCantidad"));
        v.setFecha(fecha);
        v.setTotal(tot);
        v.setNomCliente(nom);
        v.setDocumentCliente(dni);
        v.setCantidad(cantidad);
        vdao.agregar(v);
        
        if(sesionUsuario.getAttribute("nom")!=null)
            nom = (String) sesionUsuario.getAttribute("nom");
        if(sesionUsuario.getAttribute("dni")!=null)
            dni = (String) sesionUsuario.getAttribute("dni");
        
        sesionUsuario.setAttribute("nom", nom);
        sesionUsuario.setAttribute("dni", dni);
        
        RequestDispatcher rd = request.getRequestDispatcher("comprobante.jsp");
        rd.forward(request,response);
        response.sendRedirect("comprobante.jsp");
    }
    
    public String reporte(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        request.getRequestDispatcher("/listarProducto.jsp").forward(request, response);
        
        return "";
        
        
    }
    
}
