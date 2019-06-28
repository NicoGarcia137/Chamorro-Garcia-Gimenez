import java.util.Objects;

public abstract class Producto {
    //Private attributes
    private int id;
    private static int generateId=0;
    private String nombre;
    private float kgXcaja;
    private Receta receta;
    private int cantCajaxPallet;

    //Constructors
    public Producto(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet) {
        setId();
        setNombre(nombre);
        setKgXcaja(kgXcaja);
        setReceta(receta);
        setCantCajaxPallet(cantCajaxPallet);
    }
    //getters y setters
    public int getId() {
        return id;
    }

    private void setId() {
        id=generateId;
        generateId++;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getKgXcaja() {
        return kgXcaja;
    }

    private void setKgXcaja(float kgXcaja) {
        this.kgXcaja = kgXcaja;
    }

    public Receta getReceta() {
        return receta;
    }

    private void setReceta(Receta receta) {
        this.receta = receta;
    }

    public int getCantCajaxPallet() {
        return cantCajaxPallet;
    }

    private void setCantCajaxPallet(int cantCajaxPallet) {
        this.cantCajaxPallet = cantCajaxPallet;
    }

    //to String
    public String toString() {
        String base=("\nProducto\nID: %d\n Nombre: %s\n KgxCaja: %.2f\n CantCajaxPallet: %d\nReceta Nombre: %s\n");

        return String.format(base,getId(),getNombre(),getKgXcaja(),getCantCajaxPallet(),getReceta().getNombre());
    }

    //Equals y Hashcode

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return nombre.equals(producto.nombre);
    }

    public int hashCode() {
        return Objects.hash(nombre);
    }
}
