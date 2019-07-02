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
                    SubMenuMisProductos();
                    break;
                case 3:
                    ///submenu de ventas
                    SubMenuVentas();
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

        while (valorMenu != 4) {
            System.out.println("--------------------PRODUCCION--------------------\n");
            System.out.println("1.Iniciar produccion\n");
            System.out.println("2.Ver productos\n");
            System.out.println("3.Ver mis producciones\n");
            System.out.println("\n");
            System.out.println("4.Salir");
            System.out.println("\n\n----------------------------------------------------------------------------");

            while (!scanner.hasNextInt()) {
                System.out.println("--------------------PRODUCCION--------------------\n");
                System.out.println("1.Iniciar produccion\n");
                System.out.println("2.Ver productos\n");
                System.out.println("3.Ver mis producciones\n");
                System.out.println("\n");
                System.out.println("4.Salir");
                System.out.println("\n\n----------------------------------------------------------------------------");
                scanner.next();
            }
            valorMenu = scanner.nextInt();
            switch (valorMenu) {

                case 1:///PRODUCIR
                     {
                         System.out.println("\nSus producciones actuales son:\n");
                         miFabricaTrabajo.getMiStock().calcularTotalStockProductos(miFabricaTrabajo.getMisProductos(),miFabricaTrabajo.getMiStock());
                         System.out.println("\n\n\n");
                         System.out.println("Ingrese el ID del producto a producir\n");
                         int id=scanner.nextInt();
                         miFabricaTrabajo.producir(id-1);
                     }
                    break;
                case 2:/// VER PRODUCTOS
                    miFabricaTrabajo.getMiStock().calcularTotalStockProductos(miFabricaTrabajo.getMisProductos(), miFabricaTrabajo.getMiStock());
                    break;
                case 3:///VER PRODUCCIONES
                    miFabricaTrabajo.mostrar(miFabricaTrabajo.getMiStock().getListaProduccion());
                    break;
                case 4:
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
            System.out.println("1.Realizar una venta\n");
            System.out.println("2.Buscar una venta por Lote\n");
            System.out.println("3.Buscar una venta por Fecha\n");
            System.out.println("4.Buscar una venta por Producto\n");
            System.out.println("5.Eliminar una venta por Lote\n");
            System.out.println("\n\n");
            System.out.println("6.Salir");
            System.out.println("\n\n----------------------------------------------------------------------------");

            while (!scanner.hasNextInt()) {
                System.out.println("--------------------VENTAS-------------------\n");
                System.out.println("1.Realizar una venta\n");
                System.out.println("2.Buscar una venta por Lote\n");
                System.out.println("3.Buscar una venta por Fecha\n");
                System.out.println("4.Buscar una venta por Producto\n");
                System.out.println("5.Eliminar una venta por Lote\n");
                System.out.println("\n\n");
                System.out.println("6.Salir");
                System.out.println("\n\n----------------------------------------------------------------------------\n");
                scanner.next();
            }
            valorMenu = scanner.nextInt();
            switch (valorMenu) {

                case 1:///VENDER Y AGREGAR A HISTORIAL A VENTAS ESO
                    int valorProducto=0;
                    int flagin = 0;
                    try {
                        while (flagin == 0) {
                            System.out.println("Ingrese el ID del producto a vender");
                            valorProducto = scanner.nextInt();
                            if (valorProducto <= miFabricaTrabajo.getMisProductos().size()) {
                                flagin = 1;
                            }
                        }
                        miFabricaTrabajo.vender(valorProducto-1);
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
                        fechaUsr = scanner.nextLine();
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
                    try {
                        int NrLoteElim = 0;
                        System.out.println("Ingrese Nr Lote de Venta a Eliminar:");
                        NrLoteElim = scanner.nextInt();
                        miFabricaTrabajo.getMiHistorial().eliminarxLote(NrLoteElim);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
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



