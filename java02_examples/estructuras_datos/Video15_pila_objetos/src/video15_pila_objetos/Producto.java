package video15_pila_objetos;

public class Producto {
    
    private int codigo,stock;
    private String nombre;
    
    public Producto(int codigo, String nombre, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarProducto(){
        System.out.println(
            "\nCódigo: " + this.codigo + 
            "\nNombre: " + this.nombre + 
            "\nCódigo: " + this.stock
        );
    }
}
