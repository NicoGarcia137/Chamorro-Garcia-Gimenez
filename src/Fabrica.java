import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Fabrica extends Lista {
    //Private attributes
    private static int code=0;
    private int id;
    private String nombre;
    private String direccion;
    private HistorialVentas miHistorial;
    private Inventario miStock;
    private List<Producto> misProductos;
    //Constructors

    public Fabrica(String nombre, String direccion, HistorialVentas miHistorial, Inventario miStock,List<Producto> misProductos) {
        setId();
        setNombre(nombre);
        setDireccion(direccion);
        setMiHistorial(miHistorial);
        setMiStock(miStock);
        setMisProductos(misProductos);
    }

    public Fabrica(String nombre, String direccion, HistorialVentas miHistorial, Inventario miStock) {
        setId();
        setNombre(nombre);
        setDireccion(direccion);
        setMiHistorial(miHistorial);
        setMiStock(miStock);
        setMisProductos();
    }
    //Getters & Setters


    public List<Producto> getMisProductos() {
        return misProductos;
    }

    public void setMisProductos(List<Producto> misProductos) {
        this.misProductos = misProductos;
    }

    public void setMisProductos() {
        misProductos=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    private void setId() {
        id=code;
        code++;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HistorialVentas getMiHistorial() {
        return miHistorial;
    }

    private void setMiHistorial(HistorialVentas miHistorial) {
        this.miHistorial = miHistorial;
    }

    public Inventario getMiStock() {
        return miStock;
    }

    private void setMiStock(Inventario miStock) {
        this.miStock = miStock;
    }

    //Methods//FALTAN DESARROLLAR EL METODO VENDER
    public void vender(Inventario inventario,HistorialVentas historialVentas,List<Producto> misProductos,int pos)
    {
        Producto miProducto=misProductos.get(pos);
        Scanner teclado=new Scanner(System.in);
        String fecha;
        int cantidad;
        int opcion;
        System.out.println("\nIngrese cantidad a vender:\n");
        fecha=teclado.nextLine();
        System.out.println("\nIngrese la fecha de su venta:\n");
        cantidad=teclado.nextInt();
        Ventas ventaAux=new Ventas(miProducto,cantidad,fecha);
        System.out.println("\nDesea confirmar su venta?:\n");
        System.out.println("\n0-->Confirmar venta\n");
        System.out.println("\n1-->Cancelar venta\n");
        opcion=teclado.nextInt();
        if (opcion==0) {
            historialVentas.agregar(ventaAux, historialVentas.getVentas());
            System.out.println("\nSu venta se ha realizado con exito!!\n");
           // inventario.getListaProduccion().get(0).getCantCajasProducidas()= cantidad;
        }
        else {
            System.out.println("\nSu venta ha sido cancelada!\n");
        }
    }
    public void producir(Inventario inventario,List<Producto> misProductos,int pos)
    {
        Scanner teclado = new Scanner(System.in);
        String fecha;
        int cantidad;
        Producto productoAux=misProductos.get(pos);
        System.out.println("\nIngrese la fecha de elaboracion de su Producto :\n");
        fecha=teclado.nextLine();
        System.out.println("\nIngrese la cantidad de cajas que se producieron\n");
        cantidad=teclado.nextInt();
        Produccion produccion= new Produccion(productoAux,fecha,cantidad);
        inventario.agregar(produccion,inventario.getListaProduccion());

    }
    //To String

    public String toString() {
        String messageFormat=("\nFABRICA\nNombre: %s\nDireccion: %s\n");
        return String.format(messageFormat,getNombre(),getDireccion());
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fabrica)) return false;
        Fabrica fabrica = (Fabrica) o;
        return nombre.equals(fabrica.nombre);
    }

    public int hashCode() {
        return Objects.hash(nombre);
    }
}
