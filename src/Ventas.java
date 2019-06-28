import java.util.Objects;

public class Ventas {
    //Private Attributes
    private static int code = 0;
    private int id;
    private String producto;
    private float kgVendidos;
    private int cantCajas;
    private float precioXKg;
    private String fecha;
    private float total;

    //Constructors

    public Ventas(String producto, float kgVendidos, int cantCajas, float precioXKg, String fecha) {
        setId();
        setProducto(producto);
        setKgVendidos(kgVendidos);
        setCantCajas(cantCajas);
        setPrecioXKg(precioXKg);
        setFecha(fecha);
    }

    //Getters & Setters

    public int getId() {
        return id;
    }

    private void setId() {
        id=code;
        code++;
    }

    public String getProducto() {
        return producto;
    }

    private void setProducto(String producto) {
        this.producto = producto;
    }

    public float getKgVendidos() {
        return kgVendidos;
    }

    private void setKgVendidos(float kgVendidos) {
        this.kgVendidos = kgVendidos;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    private  void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
    }

    public float getPrecioXKg() {
        return precioXKg;
    }

    private void setPrecioXKg(float precioXKg) {
        this.precioXKg =  precioXKg;
    }

    public String getFecha() {
        return fecha;
    }

    private void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    private void setTotal(float total) {
        this.total = total;
    }

    //Methods
    public String toString() {
        String messageFormat=("Producto: %s\nKilos Vendidos: %.2f\nCantidad de Cajas: %d\nPrecio x Kg: %.2f\nFecha: %s\nTotal: %.2f\n");
        return String.format(messageFormat,getProducto(),getKgVendidos(),getCantCajas(),getPrecioXKg(),getFecha(),calcularTotal());
    }

    public float calcularTotal() {
        total= kgVendidos * precioXKg;
        return total;
    }
    //Equals && HashCode
//EQUALS CUALQUIER PARA TESTEAR EL BUSCAR Y ELIMINAR GENERICO DE LA LISTA
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ventas)) return false;
        Ventas ventas = (Ventas) o;
        return producto.equals(ventas.producto);
    }

    public int hashCode() {
        return Objects.hash(producto);
    }
}