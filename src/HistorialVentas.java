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
    public Ventas buscarXLote(int lote) {
        Ventas ventaEncontrada=null;
        boolean encontrado = false;
        for (int i = 0; i < ventas.size() && encontrado == false; i++) {
            if (lote == ventas.get(i).getId()) {
                encontrado = true;
                ventaEncontrada=ventas.get(i);
            }
        }
        return ventaEncontrada;
    }

    public void buscarXFecha(String fecha) {
        ArrayList<Ventas> ventasAux = new ArrayList<>();
        int posicion=0;
            int i=0;
            while (i < ventas.size() ) {
                posicion=ventas.indexOf(fecha);
                System.out.println(posicion);
                if (posicion>-1) {
                    ventasAux.add(ventas.get(i));
                    System.out.println(ventasAux.get(i));
                    i=posicion;
                }
                i++;
            }
    }
        //Listar del generico

    public ArrayList<Ventas> buscarXProducto(String producto) {
        ArrayList<Ventas> ventasAux = new ArrayList<Ventas>();
        boolean encontrado = false;
        int posicion = ventas.indexOf(producto);
        if (posicion > -1) {
            int i = posicion;
            while (i < ventas.size() && encontrado == false) {
                if (ventas.get(i).getProducto() == producto) {
                    ventasAux.add(ventas.get(i));
                } else
                    encontrado = true;
                i++;
            }
        }
        return ventasAux;
    }

}
