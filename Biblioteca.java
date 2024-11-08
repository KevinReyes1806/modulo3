
/**
 *
 * @author kvall
 */
    import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) 
    {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void buscarLibro(String criterio) 
    {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(criterio) || libro.getAutor().equalsIgnoreCase(criterio)) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros que coincidan: " + criterio);
        }
    }

    public void prestarLibro(String titulo) 
    {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) 
            {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro con titulo '" + titulo + "' fue encontrado.");
    }

    public void devolverLibro(String titulo) 
    {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) 
            {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro con titulo '" + titulo + "'fue encontrado.");
    }

    public void mostrarLibrosDisponibles() 
    {
        boolean hayDisponibles = false;
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                System.out.println(libro);
                hayDisponibles = true;
            }
        }
        if (!hayDisponibles) 
        {
            System.out.println("No hay libros disponibles.");
        }
    }
}
