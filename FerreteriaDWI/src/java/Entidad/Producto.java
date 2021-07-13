
package Entidad;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stockAct;
    private int codMarca;
    private int cantidad=1;
    private double subtotal;

    public Producto() {
    }

    public Producto(String descripcion, double precio, int stockAct) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.stockAct = stockAct;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public Producto(int codigo, String descripcion, double precio, int stockAct, int codMarca) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stockAct = stockAct;
        this.codMarca = codMarca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockAct() {
        return stockAct;
    }

    public void setStockAct(int stockAct) {
        this.stockAct = stockAct;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }
    
}
