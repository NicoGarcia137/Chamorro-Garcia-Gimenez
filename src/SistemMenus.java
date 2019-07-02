import java.util.Scanner;

public class SistemMenus extends Lista {

    //Constructor
    private Fabrica miFabricaTrabajo;

    public SistemMenus(Fabrica fabricaATrabajar) {
        setMiFabricaTrabajo(fabricaATrabajar);
    }


    public Fabrica getMiFabricaTrabajo() {
        return miFabricaTrabajo;
    }


    private void setMiFabricaTrabajo(Fabrica miFabricaTrabajo) {
        this.miFabricaTrabajo = miFabricaTrabajo;
    }

    public void MenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int valorMenuPrincipal = -1;

        while (valorMenuPrincipal != 5) {
            System.out.println("--------------------FABRICA--------------------\n");
            System.out.println("1.Información Empresa\n");
            System.out.println("2.Produccion\n");
            System.out.println("3.Ventas\n");
            System.out.println("4. Mis Productos\n");
            System.out.println("\n\n");
            System.out.println("5.Salir");
            System.out.println("\n\n----------------------------------------------------------------------------");

            while (!scanner.hasNextInt()) {
                System.out.println("--------------------FABRICA--------------------\n");
                System.out.println("1.Información Empresa\n");
                System.out.println("2.Produccion\n");
                System.out.println("3.Ventas\n");
                System.out.println("4. Mis Productos\n");
                System.out.println("\n\n");
                System.out.println("5.Salir");
                System.out.println("\n\n----------------------------------------------------------------------------\n");
                scanner.next();
            }
            valorMenuPrincipal = scanner.nextInt();
            switch (valorMenuPrincipal) {

                case 1:
                    ///Llamado de fabrica a mostrar detalles
                    System.out.println(getMiFabricaTrabajo().toString());
                    break;
                case 2:
                    ///submenu de produccion
                    break;
                case 3:
                    ///submenu de ventas
                    break;
                case 4:
                    subMenuCatalogo();
                    break;
                case 5:
                    System.out.println("\n----------------------------------------------------------------------------\n");
                    System.out.println("Fin del Programa");
                    System.out.println("\n----------------------------------------------------------------------------\n");
                    break;
                default:
                    System.out.println("Opción Incorrecta ");
                    break;

            }
        }
    }

    private void SubMenuMisProductos() {
        Scanner scanner = new Scanner(System.in);
        int valorMenu = -1;

        while (valorMenu != 6) {
            System.out.println("--------------------PRODUCCION--------------------\n");
            System.out.println("1.\n");
            System.out.println("2.\n");
            System.out.println("3.\n");
            System.out.println("4.\n");
            System.out.println("5.\n");

            System.out.println("\n\n");
            System.out.println("6.Salir");
            System.out.println("\n\n----------------------------------------------------------------------------");

            while (!scanner.hasNextInt()) {
                System.out.println("--------------------PRODUCCION--------------------\n");
                System.out.println("1.\n");
                System.out.println("2.\n");
                System.out.println("3.\n");
                System.out.println("4.\n");
                System.out.println("\n\n");
                System.out.println("6.Salir");
                System.out.println("\n\n----------------------------------------------------------------------------\n");
                scanner.next();
            }
            valorMenu = scanner.nextInt();
            switch (valorMenu) {

                case 1:///COMPRAR INGREDIENTES
                    break;
                case 2:///PRODUCIR
                    break;
                case 3:/// VER INGREDIENTES
                    miFabricaTrabajo.mostrar(miFabricaTrabajo.getMiStock().getListaIngredientes());
                    break;
                case 4:/// VER PRODUCTOS
                    miFabricaTrabajo.getMiStock().calcularTotalStockProductos(miFabricaTrabajo.getMisProductos(), miFabricaTrabajo.getMiStock());
                    break;
                case 5:///VER PRODUCCIONES
                    miFabricaTrabajo.mostrar(miFabricaTrabajo.getMiStock().getListaProduccion());
                    break;
                case 6:
                    System.out.println("\n----------------------------------------------------------------------------\n");
                    System.out.println("Saliendo de SubMenuProducciones ");
                    System.out.println("\n----------------------------------------------------------------------------\n");
                    break;
                default:
                    System.out.println("Opción Incorrecta ");
                    break;

            }
        }

    }

    private void SubMenuVentas() {
        Scanner scanner = new Scanner(System.in);
        int valorMenu = -1;

        while (valorMenu != 6) {
            System.out.println("--------------------VENTAS--------------------\n");
            System.out.println("1.\n");
            System.out.println("2.\n");
            System.out.println("3.\n");
            System.out.println("4.\n");
            System.out.println("5.\n");

            System.out.println("\n\n");
            System.out.println("6.Salir");
            System.out.println("\n\n----------------------------------------------------------------------------");

            while (!scanner.hasNextInt()) {
                System.out.println("--------------------VENTAS-------------------\n");
                System.out.println("1.\n");
                System.out.println("2.\n");
                System.out.println("3.\n");
                System.out.println("4.\n");
                System.out.println("\n\n");
                System.out.println("6.Salir");
                System.out.println("\n\n----------------------------------------------------------------------------\n");
                scanner.next();
            }
            valorMenu = scanner.nextInt();
            switch (valorMenu) {

                case 1:///VENDER Y AGREGAR A HISTORIAL A VENTAS ESO
                    int valorProducto = -1;
                    int flagin = 0;
                    try {
                        while (flagin == 0) {
                            System.out.println("Ingrese el ID del producto a vender");
                            valorProducto = scanner.nextInt();
                            if (valorProducto < miFabricaTrabajo.getMisProductos().size()) {
                                flagin = 1;
                            }
                        }
                        miFabricaTrabajo.vender(miFabricaTrabajo.getMisProduccionesVendidas(), miFabricaTrabajo.getMiStock(), miFabricaTrabajo.getMiHistorial(), miFabricaTrabajo.getMisProductos(), valorProducto);
                    } catch (Exception e) {

                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:///BUSCAR POR LOTE
                    try {
                        int NrLote = 0;
                        System.out.println("Ingrese Nr Lote de Venta:");
                        NrLote = scanner.nextInt();
                        miFabricaTrabajo.getMiHistorial().buscarXLote(NrLote);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());

                    }

                    break;
                case 3:/// BUSCAR POR FECHA

                    String fechaUsr = "";
                    try {
                        System.out.println("Ingrese Fecha de la venta: ");
                        fechaUsr = scanner.next();
                        miFabricaTrabajo.getMiHistorial().buscarxFecha(fechaUsr);
                    } catch (Exception f) {
                        System.out.println(f.getMessage());

                    }
                    break;

                case 4:/// BUSCAR POR PRODUCTO
                    try {
                        int valorProduct = -1;
                        int flagi = 0;
                        try {
                            while (flagi == 0) {
                                System.out.println("Ingrese el ID del producto");
                                valorProduct = scanner.nextInt();
                                if (valorProduct < miFabricaTrabajo.getMisProductos().size()) {
                                    flagi = 1;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());

                        }
                        miFabricaTrabajo.getMiHistorial().buscarXProducto(miFabricaTrabajo.getMisProductos().get(valorProduct - 1));

                    } catch (Exception j) {
                        System.out.println(j.getMessage());
                    }
                    break;
                case 5:///ELIMINAR POR LOTE
                    break;
                case 6:
                    System.out.println("\n----------------------------------------------------------------------------\n");
                    System.out.println("Saliendo de SubMenuVentas ");
                    System.out.println("\n----------------------------------------------------------------------------\n");
                    break;
                default:
                    System.out.println("Opción Incorrecta ");
                    break;

            }
        }

    }


    private void subMenuCatalogo() {
        Scanner scanner = new Scanner(System.in);
        int valorMenu = -1;

        while (valorMenu != 3) {
            System.out.println("--------------------CATALOGOS--------------------\n");
            System.out.println("1.Ver catalogo de Productos\n");
            System.out.println("2.Ver Receta de un producto\n");
            System.out.println("\n\n");
            System.out.println("3.Salir");
            System.out.println("\n\n----------------------------------------------------------------------------");

            while (!scanner.hasNextInt()) {
                System.out.println("--------------------CATALOGOS--------------------\n");
                System.out.println("1.Ver catalogo de Productos\n");
                System.out.println("2.Ver Receta de un producto\n");
                System.out.println("\n\n");
                System.out.println("3.Salir");
                System.out.println("\n\n----------------------------------------------------------------------------\n");
                scanner.next();
            }
            valorMenu = scanner.nextInt();
            switch (valorMenu) {

                case 1:
                    System.out.println("Listado Productos");
                    miFabricaTrabajo.mostrar(miFabricaTrabajo.getMisProductos());
                    break;
                case 2:
                    int valorIdProductoReceta = -1;
                    try {
                        System.out.println("Ingrese el numero de Producto para averiguar su Receta :");
                        valorIdProductoReceta = scanner.nextInt();
                        System.out.println(getMiFabricaTrabajo().getMisProductos().get(valorIdProductoReceta - 1).getReceta());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }


                    break;

                case 3:
                    System.out.println("\n----------------------------------------------------------------------------\n");
                    System.out.println("Fin del SubMenuMisProducciones");
                    System.out.println("\n----------------------------------------------------------------------------\n");
                    break;
                default:
                    System.out.println("Opción Incorrecta ");
                    break;

            }
        }
    }
}



