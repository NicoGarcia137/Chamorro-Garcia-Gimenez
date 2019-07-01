import java.util.Objects;

public class Produccion {
    //Private attributes
    private static int code=1000;
    private int lote;
    private Producto productoElaborado;
    private String fecha;
    private int cantCajasProducidas;
    private float cantKgProducidos;
    private boolean disponible=true;

    //Constructor

    public Produccion(Producto productoElaborado, String fecha, int cantCajasProducidas) {
        setProductoElaborado(productoElaborado);
        setFecha(fecha);
        setCantCajasProducidas(cantCajasProducidas);
        setLote();
        setCantKgProducidos();
    }

    //Getters & Setters

    public int getLote() {
        return lote;
    }

    private void setLote() {
        lote=code;
        code++;
    }

    public Producto getProductoElaborado() {
        return productoElaborado;
    }

    private void setProductoElaborado(Producto productoElaborado) {
        this.productoElaborado = productoElaborado;
    }

    public String getFecha() {
        return fecha;
    }

    private void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantCajasProducidas() {
        return cantCajasProducidas;
    }

    protected void setCantCajasProducidas(int cantCajasProducidas) {
        this.cantCajasProducidas = cantCajasProducidas;
    }

    public float getCantKgProducidos() {
        return cantKgProducidos;
    }

    private void setCantKgProducidos() {
        cantKgProducidos=calcularKgProducidos();
    }

    public boolean isDisponible() {
        return disponible;
    }

    protected void setDisponible() {
        disponible=false;
    }

    //Methods
    //To String
    public String toString() {
        String messageFormat=("\nLote: %d\nFecha Elaboracion : %s\nProducto Elaborado: %s\nCantidad de cajas producidas: %d\nCantidad de kilos producidos: %.2f\nDisponible: %s\n");
        return String.format(messageFormat,getLote(),getFecha(),getProductoElaborado().getNombre(),getCantCajasProducidas(),getCantKgProducidos(),isDisponible());
    }

    public float calcularKgProducidos()
    {
        float total=getCantCajasProducidas()*getProductoElaborado().getKgXcaja();
        return total;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produccion)) return false;
        Produccion that = (Produccion) o;
        return lote == that.lote;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lote);
    }
}