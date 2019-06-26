import java.util.Objects;

public abstract class Producto {
    //atrbutos
    private int id;
    private static int generateId=1;
    private String Nombre;
    private float kgXcaja;
    private Receta receta;
    private int cantCajaxPallet;

    //constructor
    public Producto(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet) {
        setId(id);
        setNombre(nombre);
        setKgXcaja(kgXcaja);
        setReceta(receta);
        setCantCajaxPallet(cantCajaxPallet);
    }
    //getters y setters
    public int getId() {
        return id;
    }

    private  void setId() {
        this.setId(generateId);
        generateId++;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getKgXcaja() {
        return kgXcaja;
    }

    public void setKgXcaja(float kgXcaja) {
        this.kgXcaja = kgXcaja;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public int getCantCajaxPallet() {
        return cantCajaxPallet;
    }

    public void setCantCajaxPallet(int cantCajaxPallet) {
        this.cantCajaxPallet = cantCajaxPallet;
    }

    //to String
    @Override
    public String toString() {
        String base="Producto { ID:%d\n Nombre:%s\n KgxCaja:%.2f\n CantCajaxPallet:%d}\n";

        return String.format(base,getId(),getNombre(),getKgXcaja(),getCantCajaxPallet(),getReceta().toString());
    }

    //Equals y Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return getId() == producto.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    public void setId(int id) {
        this.id = id;
    }
}
