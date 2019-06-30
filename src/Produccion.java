public class Produccion {
    //Private attributes
    private static int code=1000;
    private int lote;
    private Producto productoElaborado;
    private String fecha;
    private int cantCajasProducidas;
    private float cantKgProducidos;
    private boolean disponible;

    //Constructor

    public Produccion(Producto productoElaborado, String fecha, int cantCajasProducidas) {
        setProductoElaborado(productoElaborado);
        setFecha(fecha);
        setCantCajasProducidas(cantCajasProducidas);
        setLote();
        setDisponible();
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

    private void setCantCajasProducidas(int cantCajasProducidas) {
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

    private void setDisponible() {
        disponible=true;
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
}