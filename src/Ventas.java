import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ventas extends Lista{
    //Private Attributes
    private static int code = 0;
    private int id;
    private Producto miProducto;
    private float kgVendidos;
    private int cantCajas;
    private float precioXKg;
    private String fecha;
    private float total;
    private String producto;
    private List<Integer> lotes=new ArrayList<>();

    //Constructors

    public Ventas(Producto miProducto,int cantCajas,String fecha) {
        setId();
        setMiProducto(miProducto);
        setCantCajas(cantCajas);
        setFecha(fecha);
        setPrecioXKg();
        setProducto();
        setKgVendidos();
        setTotal();

    }

    //Getters & Setters


    public List<Integer> getLotes() {
        return lotes;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        id=code;
        code++;
    }

    private void setPrecioXKg() {
        precioXKg=miProducto.getPrecioxKg();
    }

    public String getProducto() {
        return producto;
    }

    private void setProducto() {
        producto=miProducto.getNombre();
    }

    public float getKgVendidos() {
        return kgVendidos;
    }

    protected void setKgVendidos() {
        kgVendidos=calcularKg();
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

    public String getFecha() {
        return fecha;
    }

    private void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    private void setTotal() {
        total=calcularTotal();
    }

    public Producto getMiProducto() {
        return miProducto;
    }

    private void setMiProducto(Producto miProducto) {
        this.miProducto = miProducto;
    }

    //Methods
    public String toString() {
        String messageFormat=("Producto: %s\nKilos Vendidos: %.2f\nCantidad de Cajas: %d\nPrecio x Kg: %.2f\nFecha: %s\nTotal: %.2f\n");
        return String.format(messageFormat,getProducto(),getKgVendidos(),getCantCajas(),getPrecioXKg(),getFecha(),getTotal())+("\nLote de origen:\n");

    }

    private float calcularTotal() {
        float total;
        total= kgVendidos * precioXKg;
        return total;
    }
    private float calcularKg()
    {
        float kgVendidos;
        kgVendidos=cantCajas*miProducto.getKgXcaja();
        return kgVendidos;
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