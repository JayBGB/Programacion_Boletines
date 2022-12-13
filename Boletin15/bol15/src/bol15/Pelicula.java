package bol15;

/**
 *
 * @author JayBGB
 */
public class Pelicula extends Multimedia{
    
    //ATTRIBUTES
    
    private String actorPrincipal, actrizPrincipal;
    
    //CONSTRUCTORS
    
    public Pelicula (){}

    public Pelicula(String titulo, String autor, String formato, float duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }
    
    //SETTERS & GETTERS

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return super.toString()+"Pelicula{" + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + '}';
    }
    
    

}
