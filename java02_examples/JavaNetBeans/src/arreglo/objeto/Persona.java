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
    
    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;        
    }
    
    // Getters
    public String getNombre(){
        return this.nombre;
    }    
    public int getEdad(){
        return this.edad;
    }
    
    // Sobre escribe el método toString() para mostrar los datos en un Arreglo    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ". Edad: " + this.edad;
    }
    
}
