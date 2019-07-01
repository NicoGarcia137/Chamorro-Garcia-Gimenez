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
    public int cambiarDisponibilidad(int cantidad,Producto dato)
    {
        int cant=cantidad;
        if(listaProduccion!=null)
        {
            for (int i=0;i<listaProduccion.size()&&cant!=0;i++) {
                if (listaProduccion.get(i).getProductoElaborado().equals(dato)==true)
                {
                  if(listaProduccion.get(i).getCantCajasProducidas()<=cant)
                  {
                    listaProduccion.get(i).setDisponible();
                      cant=cant-listaProduccion.get(i).getCantCajasProducidas();
                    listaProduccion.get(i).setCantCajasProducidas(0);

                  }
                  else {
                      listaProduccion.get(i).setCantCajasProducidas(listaProduccion.get(i).getCantCajasProducidas()-cant);
                      cant=cant-listaProduccion.get(i).getCantCajasProducidas();

                  }
                }
            }
        }
        return cant;
    }
    public int calcularTotalProducto(Producto miProducto,Inventario miStock)
    {
        int total=0;
        if(miStock.getListaProduccion()!=null&&miProducto!=null){
            for(int i=0;i<miStock.getListaProduccion().size();i++)
            {
                if(miStock.getListaProduccion().get(i).getProductoElaborado().equals(miProducto))
                {
                    total=total+miStock.getListaProduccion().get(i).getCantCajasProducidas();
                }
            }
        }
        return total;
    }
    public void calcularTotalStockProductos(List<Producto> misProductos,Inventario miStock)
    {
        int acum=0;
        if(miStock.getListaProduccion()!=null&&misProductos!=null)
        {
            for(int i=0;i<misProductos.size();i++)
            {
                    acum=calcularTotalProducto(misProductos.get(i),miStock);
                    System.out.println(misProductos.get(i).getNombre()+": "+acum+"\n");
                    acum=0;
            }
        }
    }
}
