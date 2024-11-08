
/**
 *
 * @author kvall
 */
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----| Menu Biblioteca |----");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por titulo o autor");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Mostrar libros disponibles");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese titulo del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicacion: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Consumir nueva línea
                    System.out.print("Ingrese genero del libro: ");
                    String genero = scanner.nextLine();

                    Libro libro = new Libro(titulo, autor, ano, genero);
                    biblioteca.agregarLibro(libro);
                    break;

                case 2:
                    System.out.print("Ingrese el titulo o autor del libro que busca: ");
                    String criterio = scanner.nextLine();
                    biblioteca.buscarLibro(criterio);
                    break;

                case 3:
                    System.out.print("Ingrese el titulo del libro que desea prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(tituloPrestar);
                    break;

                case 4:
                    System.out.print("Ingrese el titulo del libro que desea devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    break;

                case 5:
                    System.out.println("Libros disponibles:");
                    biblioteca.mostrarLibrosDisponibles();
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("No existe esa opcion...");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}


