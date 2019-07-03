import java.util.ArrayList;
import java.util.List;

public class HistorialVentas extends  Lista{
    //Private Attributes
    private static int code = 0;
    private int id;
    private ArrayList<Ventas> ventas;
    private Inventario inventario;

    //Constructors
    public HistorialVentas(ArrayList<Ventas> ventas) {
        setVentas(ventas);
        setId();
    }

    //Sobrecarga
    public HistorialVentas(List<Ventas> listado) {
        setVentas();
        setId();
    }
    //Getters & Setters

    public int getId() {
        return id;
    }

    private  void setId() {
        id = code;
        code++;
    }

    public ArrayList<Ventas> getVentas() {
        return ventas;
    }

    private void setVentas(ArrayList<Ventas> ventas) {
        this.ventas = ventas;
    }

    private void setVentas() {
        ventas = new ArrayList<>();
    }

    //Methods
    public void buscarXLote(int lote)
    {
        int encontrado=0;
        for(int i=0;i<ventas.size()&&encontrado==0;i++)
        {
            if(lote==ventas.get(i).getId()) {
                System.out.println(ventas.get(i).toString());
                mostrar(ventas.get(i).getLotes());
                encontrado = 1;
            }
        }
        if(encontrado==0)
        {
            System.out.println("\nLote no encontrado\n");
        }
    }
    public void buscarXProducto(Producto productoABuscar) {
        int encontrado=0;
        for(int i=0;i<ventas.size();i++)
        {
            if(ventas.get(i).getMiProducto().equals(productoABuscar))
            {
                System.out.println(ventas.get(i).toString());
                mostrar(ventas.get(i).getLotes());
                encontrado=1;
            }
        }
        if(encontrado==0)
        {
            System.out.println("\nProducto no encontrado\n");
        }
    }

    public void eliminarxLote (int loteAEliminar  )
    {
        int encontrado=0;
        int pos=-1;
        for(int i=0;i<ventas.size()&&encontrado==0;i++)
        {
            if(ventas.get(i).getId()==loteAEliminar) {
                pos = i;
                encontrado = 1;
                System.out.println(encontrado);
            }
        }
        if(encontrado==1)
        {
            ventas.remove(pos);
        }
    }
    public void buscarxFecha(String FechaABuscar) {
      int encontrado=0;
      int finEncontrado=0;
      for(int i=0;i<ventas.size()&&finEncontrado==0;i++)
      {
          if (ventas.get(i).getFecha().equals(FechaABuscar))
          {
              System.out.println(ventas.get(i).toString());
              mostrar(ventas.get(i).getLotes());
              encontrado=1;
          }
          else
          {
              if(encontrado==1)
              {
                  finEncontrado=1;
              }
          }
      }
      if(encontrado==0)
      {
          System.out.println("Fecha no encontrada\n");
      }
    }


}
