public class Tienda {
        private Producto[] productos;

    public Tienda() {
        this.productos = new Producto[0];
    }

    public void agregarProducto(Producto producto) {
        Producto[] nuevosProductos = new Producto[this.productos.length + 1];
        for (int i = 0; i < this.productos.length; i++) {
            nuevosProductos[i] = this.productos[i];
        }
        nuevosProductos[this.productos.length] = producto;
        this.productos = nuevosProductos;
    }
    
    public void mostrarProducto(){
        for(int i = 0; i < this.productos.length; i++){
            System.out.println(this.productos[i]);
        }
    
    }

}
