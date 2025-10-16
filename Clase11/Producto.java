public class Producto {
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Producto() {
        this.codigo = "0000";
        this.descripcion = "Sin descripción";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }

    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        this.codigo = (codigo != null && !codigo.isEmpty()) ? codigo : "0000";
        this.descripcion = (descripcion != null && !descripcion.isEmpty()) ? descripcion : "Desconocido";
        this.cantidad = Math.max(cantidad, 1);
        this.precioUnitario = Math.max(precioUnitario, 0);
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty())
            this.codigo = codigo;
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.isEmpty())
            this.descripcion = descripcion;
    }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad >= 1)
            this.cantidad = cantidad;
    }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0)
            this.precioUnitario = precioUnitario;
    }

    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 50) {
            precioUnitario -= precioUnitario * (porcentaje / 100);
        }
    }

    public void incrementarCantidad(int valor) {
        if (valor > 0)
            cantidad += valor;
    }

    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", subtotal=" + calcularSubtotal() +
                '}';
    }
}