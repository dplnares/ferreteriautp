package Entidad;

public class Venta {
    private int codigo;
    private String fecha;
    private double total;
    private String nomCliente;
    private String documentCliente;
    private int cantidad;

    public Venta() {
    }

    public Venta(String fecha, double total, String nomCliente, String documentoCliente, int cantidad) {
        this.fecha = fecha;
        this.total = total;
        this.nomCliente = nomCliente;
        this.documentCliente = documentoCliente;
        this.cantidad = cantidad;
    }

    public Venta(int codigo, String fecha, double total, String nomCliente, String documentoCliente, int cantidad) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.total = total;
        this.nomCliente = nomCliente;
        this.documentCliente = documentoCliente;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
    
    public String getDocumentCliente() {
        return documentCliente;
    }

    public void setDocumentCliente(String documentCliente) {
        this.documentCliente = documentCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
