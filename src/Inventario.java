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
                  if(listaProduccion.get(i).getCantCajasProducidas()<cant)
                  {
                    cant=cant-listaProduccion.get(i).getCantCajasProducidas();
                    listaProduccion.get(i).setDisponible();
                  }
                  else {
                      listaProduccion.get(i).setCantCajasProducidas(listaProduccion.get(i).getCantCajasProducidas()-cant);
                    cant=0;
                  }
                }
            }
        }
        return cant;
    }
    public void actualizarInventario(List<Produccion> miProduccionModificada)
    {
        int flag=0;
        for(int i=0;i<listaProduccion.size();i++)
        {
            for(int j=0;j<miProduccionModificada.size()&&flag==0;j++)
            {//Comparo los productos de mi lista original de productos en el inventario , con el de la lista de productos disponibles que sufrieron alguna modificacion, entrara en la condicion si se encuentra el mismo lote o que el lote sea menor o igual del original al del modificado
                if(listaProduccion.get(i).equals(miProduccionModificada.get(j))==true||listaProduccion.get(i).getLote()<=miProduccionModificada.get(j).getLote())
                {
                    if(miProduccionModificada.get(j).isDisponible()==false) {//En caso de sufrir alguna modificacion en la lista disponible modifico el estado del original, en caso de ya tener algun falso en el original no sufre cambio alguno ya que se setea denuevo en false
                        listaProduccion.get(i).setDisponible();
                    }
                    flag=1;
                }
            }
        }
    }
    public List<Produccion>  bajarDisponibles(List<Produccion> produccions)
    {
        //Creo una lista auxiliar de producciones para agregar todas aquellas producciones disponibles
        List<Produccion> produccionDisponible=new ArrayList<>();
        for(int i=0;i<produccions.size();i++)//
        {
            //Recorro y comparo el estado de mi produccion original si esta disponible lo guarda en la lista auxiliar
          if(produccions.get(i).isDisponible()==true)
            {
                produccionDisponible.add(produccions.get(i));
                System.out.println(produccionDisponible.get(i).toString());
            }
        }
        return produccionDisponible;//Retorno la lista con las producciones disponibles
    }
}
