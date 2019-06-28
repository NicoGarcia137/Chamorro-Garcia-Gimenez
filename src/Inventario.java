import java.util.ArrayList;
import java.util.List;

public class Inventario extends Lista {
    //Private attributes
    private static int code=1;
    private int id;
    private ArrayList<Produccion> listaProduccion;
    private ArrayList<Ingrediente> listaIngredientes;
    //Constructors

    public Inventario(List<Produccion> listaProduccion, List<Ingrediente> listaIngredientes) {
        setId();
        setListaProduccion();
        setListaIngredientes();
    }
    public Inventario(ArrayList<Produccion> listaProduccion,ArrayList<Ingrediente> listaIngredientes)
    {
        setId();
        setListaProduccion(listaProduccion);
        setListaIngredientes(listaIngredientes);
    }
    //Getters & Setters

    public int getId() {
        return id;
    }

    private void setId() {
        id=code;
        code++;
    }


    public ArrayList<Produccion> getListaProduccion() {
        return listaProduccion;
    }

    private void setListaProduccion(ArrayList<Produccion> listaProduccion) {
        this.listaProduccion = listaProduccion;
    }
    private void setListaProduccion()
    {
        listaProduccion=new ArrayList<>();
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    private void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
    private void setListaIngredientes()
    {
        listaIngredientes=new ArrayList<>();
    }

    //Methods
    //To String
    public String toString() {
        String messageFormat=("\nCodigo: %d\n");
        return String.format(messageFormat,getId());
    }
}
