
package entregable1proyectofinal;


public class Productos {
    private String Nombre_Producto;
    private int precio;
    
        public Productos(String Nombre_Producto, int precio) {
    this.Nombre_Producto = Nombre_Producto;
    this.precio = precio;
    
    
        }
    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
   



    
    
    
    
    
}
