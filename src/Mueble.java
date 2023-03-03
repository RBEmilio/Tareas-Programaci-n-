public class Mueble extends ProductoHogar {
    private String tipoDeMueble;
    
    
    public Mueble(String nombre, String descripcion, double precio, Material tipoDeMaterial, String tipoDeMueble) {
        super(nombre, descripcion, precio, tipoDeMaterial);
        this.tipoDeMueble = tipoDeMueble;
    }
    
    @Override
    public String toString(){
        return super.toString() +", " + this.tipoDeMueble;
    }
}
