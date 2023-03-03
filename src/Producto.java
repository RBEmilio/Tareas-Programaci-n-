/*En este ejercicio, deberás simular el funcionamiento de una tienda de Ikea. 
La tienda cuenta con diferentes tipos de productos, cada uno con sus propias características. A continuación se describen los diferentes tipos de productos:
Muebles: son objetos que se utilizan para amueblar una casa. Cada mueble tiene un nombre, una descripción, un precio y un tipo de material (madera, metal, plástico, etc.).
Artículos de decoración: son objetos que se utilizan para decorar una casa. Cada artículo de decoración tiene un nombre, una descripción y un precio.
Electrodomésticos: son objetos que se utilizan para realizar tareas domésticas. Cada electrodoméstico tiene un nombre, una descripción, un precio y una eficiencia energética (A, B, C, D, E, F).
Deberás crear una clase abstracta llamada "Producto" que contenga los siguientes atributos: nombre, descripción y precio. 
Luego, deberás crear una clase abstracta llamada "ProductoHogar" que herede de "Producto" y que contenga un atributo adicional llamado "tipoDeMaterial".
Luego, deberás crear tres clases concretas que hereden de "ProductoHogar": "Mueble", "ArticuloDeDecoracion" y "Electrodomestico". 
La clase "Mueble" deberá tener un atributo adicional llamado "tipoDeMueble", la clase "Electrodomestico" deberá tener un atributo adicional llamado "eficienciaEnergetica", y la clase "ArticuloDeDecoracion" no tendrá atributos adicionales.
Finalmente, deberás crear una clase llamada "Tienda" que tenga un atributo llamado "productos" que sea un array de objetos de la clase "Producto". 
La clase "Tienda" deberá tener un método llamado "agregarProducto" que permita agregar un producto al arreglo de productos. La clase "Tienda" deberá tener otro método llamado "mostrarProductos",
que muestre en pantalla todos los productos que hay en la tienda, junto con sus características.
Crear en un tipo test la estantería KALLAX y el flexo FORSÅ */

public abstract class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    
    
    public Producto(String nombre, String descripcion, double precio){
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.precio = precio;
    }
    
    
    
    @Override
    public String toString(){
     return this.nombre + ", " +this.descripcion +", " + this.precio;   
    }
    
 }
