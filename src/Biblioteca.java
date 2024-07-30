import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Libro> libros;

    public Biblioteca() {
        libros = new HashMap<>();
    }


    public void cargarLibros(String txt) throws IOException, FileNotFoundException{
        BufferedReader contenedor = new BufferedReader(new FileReader(txt));
        String infoLibro;
        while ((infoLibro = contenedor.readLine()) != null) {
            String[] partesInfo = infoLibro.split(",");
            if (partesInfo.length == 2) {
                String autor = partesInfo[0].trim();
                String titulo = partesInfo[1].trim();
                libros.put(autor, new Libro(autor, titulo));
            }
        }
    }
    public void eliminarLibro(String autor) {
        if (libros.containsKey(autor)) {
            libros.remove(autor);
            System.out.println("Libro del autor " + autor + " eliminado.");
        } else {
            System.out.println("El autor " + autor + " no existe en la biblioteca.");
        }
    }

    public Libro buscarLibro(String autor) {
        return libros.get(autor);
    }

    public void mostrarLibros() {
        if (!libros.isEmpty()){
            for (Libro libro : libros.values()) {
                System.out.println(libro);
            }
        } else {
            System.out.println("No existen libros registrados");
        }
    }
}
