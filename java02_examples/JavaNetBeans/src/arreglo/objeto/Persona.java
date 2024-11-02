package arreglo.objeto;

/**
 *
 * @author ADMIN
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters
    public String getNombre(){
        return this.nombre;
    }    
    public int getEdad(){
        return this.edad;
    }
    
}
