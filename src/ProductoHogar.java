public class ProductoHogar extends Producto {
    private Material tipoDeMaterial;

    enum Material{
        madera, metal, plastico
    }
            
    public ProductoHogar(String nombre, String descripcion, double precio, Material tipoDeMaterial){
        super(nombre, descripcion, precio);
        this.tipoDeMaterial = tipoDeMaterial;
    }
     @Override
    public String toString(){
        return super.toString() +", " + this.tipoDeMaterial;
    }
       
    
}
