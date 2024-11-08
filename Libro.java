
/**
 *
 * @author kvall
 */
public class Libro 
{
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private boolean disponible;

    public Libro(String titulo, String autor, int anoPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.disponible = true; 
    }

       public String getTitulo()
       {
        return titulo;
    }

    public String getAutor() 
    {
        return autor;
    }

    public boolean isDisponible() 
    {
        return disponible;
    }

    public void prestar() 
    {
        if (disponible) 
        {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }
    public void devolver() 
    {
        if (!disponible) 
        {
            disponible = true;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }
    @Override
    public String toString() 
    {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año: " + anoPublicacion +
                ", Genero: " + genero + ", Disponible: " + (disponible ? "Si" : "No");
    }
}

