import java.util.ArrayList;
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
    
}
