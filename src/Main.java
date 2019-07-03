import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Ingredientes FIJO

        //Recetas FIJO

        //Productos FIJO



        //Fabrica


        System.out.println("Bienvenido a Export Digital");

        Ingrediente ingrediente1=new Ingrediente("Sal",2,2,"Sal tipo marina",0,"-","SalYs");
        Ingrediente ingrediente2=new Ingrediente("Pimienta",1,1,"Origen colombia",0,"-","Green&Light");
        Ingrediente ingrediente3=new Ingrediente("Ajo",2,3,"Origen Buenos aires , Tigre",0,"-","Green&Ligh");
        Ingrediente ingrediente4=new Ingrediente("Oregano",1,4,"Condimentos SA , Tandil",0,"-","Condimentos Sa");
        Ingrediente ingrediente5=new Ingrediente("Aji picante",1,1,"Origen mexico",0,"-","Pica SA");
        List<Ingrediente> miIngredientes=new ArrayList<>();
        miIngredientes.add(ingrediente1);
        miIngredientes.add(ingrediente2);
        List<Ingrediente> miIngredientes2=new ArrayList<>();
        miIngredientes2.add(ingrediente3);
        miIngredientes2.add(ingrediente4);
        miIngredientes2.add(ingrediente1);
        List<Ingrediente> miIngredientes3=new ArrayList<>();
        miIngredientes3.add(ingrediente1);
        miIngredientes3.add(ingrediente5);
        miIngredientes3.add(ingrediente3);

        Receta recetaPollo=new Receta("Receta Pollo",60f,miIngredientes);
        Receta recetaPescado=new Receta("Receta Pescado",30f,miIngredientes2);
        Receta recetaMariscos=new Receta("Medallon PO",20f,miIngredientes3);

        MedallonPO medallonPO=new MedallonPO("Medallon Pollo clasico",4.35f,recetaPollo,100,52.3f,13,-22,180,35,25,5,100f,"D6",1,32,3,125f,220f,20,36);
        MedallonesPE medallonPE=new MedallonesPE("Medallon Pescado clasico",4.35f,recetaPescado,100,44.3f,24f,-25,180,25,20,3,100f,"D6",1,33,3,"Merluza",240f,36);
        Anillas rabas=new Anillas("Anillas rebozadas",5.35f,recetaMariscos,100,120f,15,-20,180,20,35,2,15f,"V2",140f,8,15,"V2");

        List<Producto> misProductos=new ArrayList<>();
        misProductos.add(medallonPO);
        misProductos.add(medallonPE);
        misProductos.add(rabas);
        List<Ventas> lista=new ArrayList<>();
        List<Ingrediente> listaingredientes = new ArrayList<>();
        List <Produccion> listaProduccion= new ArrayList<>();
        HistorialVentas historial = new HistorialVentas(lista);
        Inventario inventario=new Inventario(listaProduccion,listaingredientes);
        Fabrica miFabrica=new Fabrica("Mardi Sa","Ortiz de zarate 3544",historial,inventario,misProductos);

        miFabrica.IniciarProg();











        /*





        // Test ventas, produtos y historial

        Ingrediente ingrediente=new Ingrediente("Sal",2,2,"Sal marina",0,"12112","Elmasita");
        List<Ingrediente> miIngredientes=new ArrayList<>();
        miIngredientes.add(ingrediente);
        Receta recetaPollo=new Receta("Medallon PO",60f,miIngredientes);
        MedallonPO medallonPO=new MedallonPO("Medallon Pollo clasico",4.35f,recetaPollo,100,52.3f,13,-22,180,35,25,5,100f,"D6",1,32,3,125f,220f,20,36);
        Ventas venta=new Ventas(medallonPO,100,"14023123");
        Ventas vent1=new Ventas(medallonPO,1000,"14/02/1997");
        Ventas venta2=new Ventas(medallonPO,100,"14/02/1994");
        Produccion produccion=new Produccion(medallonPO,"10/02/1994",1000);
        List<Producto> misProductos=new ArrayList<>();
        List<Ventas> lista=new ArrayList<>();
        List<Ingrediente> listaingredientes = new ArrayList<>();
        listaingredientes.add(ingrediente);
        List <Produccion> listaProduccion= new ArrayList<>();
        HistorialVentas historial = new HistorialVentas(lista);
        Inventario inventario=new Inventario(listaProduccion,listaingredientes);
        System.out.println(medallonPO.getReceta().getIngredientes().get(0));
        inventario.mostrar(inventario.getListaIngredientes());
        Fabrica miFabrica=new Fabrica("Mardi Sa","Ortiz de zarate 3544",historial,inventario,misProductos);
        miFabrica.inicializarIngredientes();
        miFabrica.mostrar(miFabrica.getMiStock().getListaIngredientes());
       // miFabrica.getMiStock().inicializarIngredientes();//Seteo en 0 las cantidades de mis bolsas
       /* System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        miFabrica.mostrar(miFabrica.getMiStock().getListaIngredientes());
        miFabrica.comprarIngredientes(200);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
     /*

      /*miFabrica.mostrar(miFabrica.getMiStock().getListaIngredientes());*/
       /*
        miFabrica.agregar(medallonPO, miFabrica.getMisProductos());
        miFabrica.mostrar(miFabrica.getMisProductos().get(0).getReceta().getIngredientes());
        miFabrica.comprarIngredientes(200);
        miFabrica.mostrar(miFabrica.getMisProductos().get(0).getReceta().getIngredientes());
        miFabrica.mostrar(miFabrica.getMiStock().getListaIngredientes());
        // okSystem.out.println(produccion.toString());
        //     ok System.out.println(medallonPO.toString());
        //     System.out.println(miFabrica.getMisProductos().get(0).getReceta().toString());
        //ok miFabrica.mostrar(miFabrica.getMisProductos().get(0).getReceta().getIngredientes());


        // miFabrica.agregar(produccion,inventario.getListaProduccion());
        //inventario.mostrar(inventario.getListaProduccion());
        //  miFabrica.agregar(venta,historial.getVentas());//EL AGREGADO , LAS MUESTRAS Y EL ELIMINADO FUNCIONAN , ASI COMO EL BUSQUEDA GENERAL
        // miFabrica.agregar(vent1,historial.getVentas());
        // miFabrica.agregar(venta2,historial.getVentas());
        //  historial.mostrar(historial.getVentas());
        // historial.eliminar(venta,historial.getVentas());
        //  historial.mostrar(historial.getVentas());
        miFabrica.producir(0);
        // miFabrica.producir(miFabrica.getMiStock(),miFabrica.getMisProductos(),0);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        miFabrica.getMiStock().calcularTotalStockProductos(misProductos, miFabrica.getMiStock());
        //   miFabrica.mostrar(miFabrica.getMiStock().getListaProduccion());
        //miFabrica.mostrar(historial.getVentas());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        */
        //ok  List<Produccion>miListaDis=miFabrica.getMiStock().bajarDisponibles(miFabrica.getMiStock().getListaProduccion());
        //ok  Inventario inventario1=new Inventario(miListaDis,listaingredientes);
        //ok  inventario1.mostrar(inventario1.getListaProduccion());
       /* miFabrica.mostrar(miFabrica.getMiStock().getListaProduccion());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        miFabrica.vender(miFabrica.getMisProduccionesVendidas(),miFabrica.getMiStock(),miFabrica.getMiHistorial(),misProductos,0);
        miFabrica.mostrar(miFabrica.getMisProduccionesVendidas());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        miFabrica.mostrar(miFabrica.getMiStock().getListaProduccion());
        miFabrica.getMiStock().calcularTotalStockProductos(misProductos,miFabrica.getMiStock());
       // miFabrica.mostrar(misProductos);
        //NOTA FALTAN LAS BUSQUEDAS TANTO EN INVENTARIO COMO EN HISTORIAL Y TESTEAR
*/
    }

}
