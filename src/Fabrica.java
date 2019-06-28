import java.util.Objects;

public class Fabrica {
    //Private attributes
    private static int code=0;
    private int id;
    private String nombre;
    private String direccion;
    private HistorialVentas miHistorial;
    private Inventario miStock;
    //Constructors

    public Fabrica(String nombre, String direccion, HistorialVentas miHistorial, Inventario miStock) {
        setId();
        setNombre(nombre);
        setDireccion(direccion);
        setMiHistorial(miHistorial);
        setMiStock(miStock);
    }

    //Getters & Setters

    public int getId() {
        return id;
    }

    private void setId() {
        id=code;
        code++;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HistorialVentas getMiHistorial() {
        return miHistorial;
    }

    private void setMiHistorial(HistorialVentas miHistorial) {
        this.miHistorial = miHistorial;
    }

    public Inventario getMiStock() {
        return miStock;
    }

    private void setMiStock(Inventario miStock) {
        this.miStock = miStock;
    }

    //Methods//FALTAN DESARROLLAR LOS METODOS PRINCIPALES
    public void vender(Inventario inventario,HistorialVentas historialVentas)
    {

    }
    public void producir(Inventario inventario)
    {

    }
    //To String

    public String toString() {
        String messageFormat=("\nFABRICA\nNombre: %s\nDireccion: %s\n");
        return String.format(messageFormat,getNombre(),getDireccion());
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fabrica)) return false;
        Fabrica fabrica = (Fabrica) o;
        return nombre.equals(fabrica.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
