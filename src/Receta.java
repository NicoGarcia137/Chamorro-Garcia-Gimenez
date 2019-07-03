import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Receta {
    //Private attributes
    private int id;
    private static int generateId=1;
    private String Nombre;
    private float LitrosAgua;
    private List<Ingrediente> ingredientes;

    //Constructors

    public Receta(String nombre, float litrosAgua) {
       setId();
        setNombre(nombre);
        setLitrosAgua(litrosAgua);
        setIngredientes();
    }
    public Receta(String nombre, float litrosAgua,List<Ingrediente>ingredientes) {
        setId();
        setNombre(nombre);
        setLitrosAgua(litrosAgua);
        setIngredientes(ingredientes);
    }

    //Getters && Setters
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    private void setIngredientes() {
        ingredientes=new ArrayList<>();
    }

    private void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes=ingredientes;
    }

    public int getId() {
        return id;
    }

    private  void setId() {
        this.id = generateId;
        generateId++;
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

    private void setLitrosAgua(float litrosAgua) {
        LitrosAgua = litrosAgua;
    }

    //Methods
    //To String
    public String toString() {
        String base= "\nID:%d \n Nombre:%s \n Litros de Agua:%.2f\n";
        return String.format(base,getId(),getNombre(),getLitrosAgua());
    }
    //Equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receta receta = (Receta) o;
        return Objects.equals(Nombre, receta.Nombre);
    }

    public int hashCode() {
        return Objects.hash(Nombre);
    }
}
