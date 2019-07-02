import java.util.Scanner;

public class SistemMenus {


    public void MenuPrincipal() {   ///Menu Principal del Sistema

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
                    break;
                case 2:
                    ///submenu de produccion
                    break;
                case 3:
                    ///submenu de ventas
                    break;
                case 4:
                    /// Sub menu Catalogo de productos de la fabrica
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

    private void SubMenuMisProductos ()
    {
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
                    break;
                case 4:/// VER PRODUCTOS
                    break;
                case 5:///VER PRODUCCIONES
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
    private void SubMenuVentas()
    {
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

                case 1:///VENDER Y AGREGAR A HISTORIAL A VENTAS ESO
                    break;
                case 2:///BUSCAR POR LOTE
                    break;
                case 3:/// BUSCAR POR FECHA
                    break;
                case 4:/// BUSCAR POR PRODUCTO
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

    public void subMenuMisProductos() {   ///Menu Principal del Sistema

        Scanner scanner = new Scanner(System.in);
        int valorMenu = -1;

        while (valorMenu != 5) {
            System.out.println("--------------------CATALOGOS--------------------\n");
            System.out.println("1.Ver catalogo de Productos\n");
            System.out.println("2.Ver Receta de un producto\n");
            System.out.println("\n\n");
            System.out.println("3.Salir");
            System.out.println("\n\n");
            System.out.println("5.Salir");
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
                    /// mostrar todos los productos
                    break;
                case 2:
                    /// dar opciones de producto , que el usuario elija y mostrar receta producto
                    break;

                case 3:
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



}
