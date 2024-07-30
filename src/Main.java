import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        String txt = "libros.txt";

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Cargar libros desde el archivo");
            System.out.println("2. Buscar un libro");
            System.out.println("3. Eliminar un libro");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    biblioteca.cargarLibros(txt);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del autor a buscar:");
                    String autorBuscar = scanner.nextLine();
                    Libro libroEncontrado = biblioteca.buscarLibro(autorBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado: " + libroEncontrado);
                    } else {
                        System.out.println("El autor no existe en la biblioteca.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del autor del libro a eliminar:");
                    String autorEliminar = scanner.nextLine();
                    biblioteca.eliminarLibro(autorEliminar);
                    break;
                case 4:
                    biblioteca.mostrarLibros();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
