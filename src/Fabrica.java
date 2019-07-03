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
    private List<Produccion> misProduccionesVendidas;
    private List<Producto> misProductos;
    //Constructors

    public Fabrica(String nombre, String direccion, HistorialVentas miHistorial, Inventario miStock,List<Producto> misProductos) {
        setId();
        setNombre(nombre);
        setDireccion(direccion);
        setMiHistorial(miHistorial);
        setMiStock(miStock);
        setMisProductos(misProductos);
        setMisProduccionesVendidas();
    }

    //Getters & Setters


    private void setMisProduccionesVendidas() {
        misProduccionesVendidas = new ArrayList<>();
    }

    public List<Produccion> getMisProduccionesVendidas() {
        return misProduccionesVendidas;
    }

    public List<Producto> getMisProductos() {
        return misProductos;
    }

    private void setMisProductos(List<Producto> misProductos) {
        this.misProductos = misProductos;
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

    //Methods/
    public void vender(int pos) {
            Producto miProducto = misProductos.get(pos);
            Scanner teclado = new Scanner(System.in);
            String fecha;
            int cantidad;
            int opcion = -1;
            System.out.println("\nIngrese cantidad a vender:\n");
            cantidad = teclado.nextInt();
            System.out.println("\nIngrese la fecha de su venta:\n");
            fecha = teclado.next();
            Ventas ventaAux = new Ventas(miProducto, cantidad, fecha);
            while (opcion != 1 && opcion != 2) {
                System.out.println("\nDesea confirmar su venta?:\n");
                System.out.println("\n1-->Confirmar venta\n");
                System.out.println("\n2-->Cancelar venta\n");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1: {
                        if(cantidad<=miStock.calcularTotalProducto(miProducto)) {
                            while (cantidad != 0) {
                                cantidad = miStock.cambiarDisponibilidad(cantidad, miProducto);
                            }
                            for (int i = 0; i < miStock.getListaProduccion().size(); i++) {
                                if (miStock.getListaProduccion().get(i).getProductoElaborado().equals(miProducto) == true && miStock.getListaProduccion().get(i).isDisponible() == false) {
                                    ventaAux.agregar(miStock.getListaProduccion().get(i).getLote(), ventaAux.getLotes());
                                    misProduccionesVendidas.add(miStock.getListaProduccion().get(i));
                                    miStock.getListaProduccion().remove(i);
                                }
                            }
                            miHistorial.agregar(ventaAux,miHistorial.getVentas());
                            System.out.println("\nSu venta se ha realizado con exito!!\n");
                        }
                        else
                            System.out.println("\nCantidad de productos insuficientes!\n");
                        break;
                    }
                    case 2: {
                        System.out.println("\nSu venta ha sido cancelada!\n");
                        break;
                    }
                    default: {
                        System.out.println("\nLa opcion ingresada es incorrecta\n");
                        System.out.println("\nDesea confirmar su venta?:\n");
                        System.out.println("\n0-->Confirmar venta\n");
                        System.out.println("\n1-->Cancelar venta\n");
                        opcion = teclado.nextInt();
                    }
                }
            }
        }
    public void producir(int pos)
    {
        Scanner teclado = new Scanner(System.in);
        String fecha;
        int cantidad;
        Producto productoAux=misProductos.get(pos);
        System.out.println("\nIngrese la fecha de elaboracion de su Producto :\n");
        fecha=teclado.nextLine();
        System.out.println("\nIngrese la cantidad de cajas que se producieron\n");
        cantidad=teclado.nextInt();
        Produccion produccion = new Produccion(productoAux, fecha, cantidad);
        miStock.agregar(produccion, miStock.getListaProduccion());
    }

/*
    public void inicializarIngredientes()//NOTA VOLVER A SETEAR EN 0
    {
        if (miStock!=null)
        {
            for(int i=0;i<miStock.getListaIngredientes().size();i++)
            {
                misProductos.get(0).getReceta().getIngredientes().get(i);
                miStock.getListaIngredientes().get(i).setCantBolsas(0);

            }
            miStock.setListaIngredientes(getMiStock().getListaIngredientes());
        }
    }*/
    /*
    public void comprarIngredientes(int id)
    {
        int flag=0;
        int cantidad;
        Scanner teclado= new Scanner(System.in);
        for(int i=0;i<miStock.getListaIngredientes().size()&&flag==0;i++)
        {
            if(miStock.getListaIngredientes().get(i).getCodigo()==id)
            {
                System.out.println("\nIngrese la cantidad de bolsas que va a ingresar\n");
                cantidad=teclado.nextInt();
                miStock.sumarCantidadIngredientes(cantidad,i);
                System.out.println("\nSe realizo con exito su ingreso!\n");
                flag=1;
            }
        }

    }*/

    public void IniciarProg () /// Inicia los menus
    {
       SistemMenus  MenuGeneral = new SistemMenus(this);

       try {
           MenuGeneral.MenuPrincipal();
       }
       catch(Exception e){
           System.out.println("------------------ERROR MENU PRINCIPAL--------------");
           System.out.println(e.getMessage());

       }
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
