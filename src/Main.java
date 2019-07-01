import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Test ventas, produtos y historial

        Receta recetaPollo=new Receta("Medallon PO",60f);
        MedallonPO medallonPO=new MedallonPO("Medallon Pollo clasico",4.35f,recetaPollo,100,52.3f,13,-22,180,35,25,5,100f,"D6",1,32,3,125f,220f,20,36);
        Ventas venta=new Ventas(medallonPO,100,"14023123");
        Ventas vent1=new Ventas(medallonPO,1000,"14/02/1997");
        Ventas venta2=new Ventas(medallonPO,100,"14/02/1994");
        Produccion produccion=new Produccion(medallonPO,"10/02/1994",1000);
        List<Producto> misProductos=new ArrayList<>();
        List<Ventas> lista=new ArrayList<>();
        List<Ingrediente> listaingredientes = new ArrayList<>();
        List <Produccion> listaProduccion= new ArrayList<>();
        HistorialVentas historial = new HistorialVentas(lista);
        Inventario inventario=new Inventario(listaProduccion,listaingredientes);
        Fabrica miFabrica=new Fabrica("Mardi Sa","Ortiz de zarate 3544",historial,inventario,misProductos);
       // okSystem.out.println(produccion.toString());
  //     ok System.out.println(medallonPO.toString());
        miFabrica.agregar(medallonPO,misProductos);
        miFabrica.agregar(produccion,inventario.getListaProduccion());
        //inventario.mostrar(inventario.getListaProduccion());
      //  miFabrica.agregar(venta,historial.getVentas());//EL AGREGADO , LAS MUESTRAS Y EL ELIMINADO FUNCIONAN , ASI COMO EL BUSQUEDA GENERAL
       // miFabrica.agregar(vent1,historial.getVentas());
       // miFabrica.agregar(venta2,historial.getVentas());
      //  historial.mostrar(historial.getVentas());
       // historial.eliminar(venta,historial.getVentas());
      //  historial.mostrar(historial.getVentas());
        miFabrica.producir(miFabrica.getMiStock(),miFabrica.getMisProductos(),0);
       // miFabrica.producir(miFabrica.getMiStock(),miFabrica.getMisProductos(),0);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
     //   miFabrica.mostrar(miFabrica.getMiStock().getListaProduccion());
        //miFabrica.mostrar(historial.getVentas());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
       //ok  List<Produccion>miListaDis=miFabrica.getMiStock().bajarDisponibles(miFabrica.getMiStock().getListaProduccion());
      //ok  Inventario inventario1=new Inventario(miListaDis,listaingredientes);
      //ok  inventario1.mostrar(inventario1.getListaProduccion());
        miFabrica.mostrar(miFabrica.getMiStock().getListaProduccion());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        miFabrica.vender(miFabrica.getMisProduccionesVendidas(),miFabrica.getMiStock(),miFabrica.getMiHistorial(),misProductos,0);
        miFabrica.mostrar(miFabrica.getMisProduccionesVendidas());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        miFabrica.mostrar(miFabrica.getMiStock().getListaProduccion());
       // miFabrica.mostrar(misProductos);
        //NOTA FALTAN LAS BUSQUEDAS TANTO EN INVENTARIO COMO EN HISTORIAL Y TESTEAR

    }
}
