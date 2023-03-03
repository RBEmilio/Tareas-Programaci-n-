public class Electrodomestico extends ProductoHogar{
    private Eficiencia eficienciaElectrica;
    enum Eficiencia{
        A, B, C, D, F
    }
    public Electrodomestico(String nombre, String descripcion, double precio, Material tipoDeMaterial, Eficiencia eficienciaElectrica) {
        super(nombre, descripcion, precio, tipoDeMaterial);
        this.eficienciaElectrica = eficienciaElectrica;
    }
    
    @Override
    public String toString(){
  return super.toString() +", " + this.eficienciaElectrica;
}
}
