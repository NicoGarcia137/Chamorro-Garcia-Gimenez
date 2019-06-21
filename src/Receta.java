import java.util.ArrayList;
import java.util.Objects;

public class Receta {
    private int id;
    private static int generateId=1;
    private String Nombre;
    private float LitrosAgua;
    private ArrayList<Ingrediente> ingredientes;

    //Constructor

    public Receta(String nombre, float litrosAgua) {
       setId();
        setNombre(nombre);
        setLitrosAgua(litrosAgua);
    }

    public int getId() {
        return id;
    }

    private  void setId() {
        this.id = generateId;
        generateId++;
    }

    @Override
    public String toString() {
        String base=" ID:%d \n Nombre:%s \n Litros de Agua:%.2f";
        return String.format(base,getId(),getNombre(),getLitrosAgua());
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getLitrosAgua() {
        return LitrosAgua;
    }

    public void setLitrosAgua(float litrosAgua) {
        LitrosAgua = litrosAgua;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receta receta = (Receta) o;
        return Objects.equals(Nombre, receta.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre);
    }
}
