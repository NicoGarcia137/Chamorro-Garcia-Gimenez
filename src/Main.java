import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Test ventas, produtos y historial

        Ventas venta=new Ventas("Medallon",3.2f,3,39.33f,"14/02/1994");
        Ventas vent1=new Ventas("Patitas",3.2f,7,39.33f,"14/02/1997");
        Ventas venta2=new Ventas("Bastones",3.2f,3,39.33f,"14/02/1994");
        Receta recetaPollo=new Receta("Medallon PO",60f);
        MedallonPO medallonPO=new MedallonPO("Medallon Pollo clasico",4.35f,recetaPollo,100,13,-22,180,35,25,5,100f,"D6",32,3,125f,220f,20,36);
        Produccion produccion=new Produccion(medallonPO,"10/02/1994",1000);
        List<Ventas> lista=new ArrayList<>();
        List<Ingrediente> listaingredientes = new ArrayList<>();
        List <Produccion> listaProduccion= new ArrayList<>();
        HistorialVentas historial = new HistorialVentas(lista);
       // okSystem.out.println(produccion.toString());
  //     ok System.out.println(medallonPO.toString());
        Inventario inventario=new Inventario(listaProduccion,listaingredientes);
        inventario.agregar(produccion,inventario.getListaProduccion());
        inventario.mostrar(inventario.getListaProduccion());
        /*historial.agregar(venta,historial.getVentas());//EL AGREGADO , LAS MUESTRAS Y EL ELIMINADO FUNCIONAN , ASI COMO EL BUSQUEDA GENERAL
        historial.agregar(vent1,historial.getVentas());
        historial.agregar(venta2,historial.getVentas());
        historial.mostrar(historial.getVentas());
        historial.eliminar(venta,historial.getVentas());
        historial.mostrar(historial.getVentas());*/

        //NOTA FALTAN LAS BUSQUEDAS TANTO EN INVENTARIO COMO EN HISTORIAL Y TESTEAR

    }
}
