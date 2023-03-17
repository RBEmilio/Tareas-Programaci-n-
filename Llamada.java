import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/*ACTIVIDAD:

En una compañía de telecomunicaciones se desean registrar los datos de todas las llamadas de sus
clientes. Implementar la clase Llamada, que guardará los siguientes datos: número de teléfono del
cliente, número del interlocutor, atributo booleano que indique si la llamada es saliente, fecha y hora
del inicio de la llamada y del fin, atributo enumerado que indique la zona del interlocutor (suponer
cinco zonas con tarifas distintas) y tabla de constantes con las tarifas de las zonas en céntimos de
euro/minuto. En la clase se establecerá un orden natural compuesto basado en el número del teléfono
del cliente como primer criterio y en la fecha y hora de inicio como segundo criterio. Asimismo, se
implementará un método que devuelva la duración en minutos de la llamada y otro que calcule su
coste, si es saliente. Por último, implementar el método toString(), que muestre los dos números de
teléfono, la fecha y hora del inicio, la duración y el coste.*/

public class Llamada {
    String telefonoCliente;
    String telefonoInterlocutor;
    boolean saliente;
    LocalDate fechaInicio;
    LocalDate fechaFin;
    LocalTime horaInicio;
    LocalTime horaFin;
    double [] tabla = {6.34, 4.89, 6.43, 10.96, 5.01};
    Zonas zona;
    
    enum Zonas {
      Zona1, Zona2, Zona3, Zona4, Zona5
    }

    public Llamada(String telefonoCliente, String telefonoInterlocutor, boolean saliente, LocalDate fechaInicio, LocalDate fechaFin, LocalTime horaInicio, LocalTime horaFin, Zonas zona) {
        this.telefonoCliente = telefonoCliente;
        this.telefonoInterlocutor = telefonoInterlocutor;
        this.saliente = saliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.zona = zona;
    }
    
    long duracion(){
        return horaInicio.until(horaFin, ChronoUnit.MINUTES);
    }

     
    public double tarifa(){
        
        double total = 0;
        
        
        if (!saliente){
            total = 0;
        }else{
            switch(zona){
                case Zona1:
                total = tabla[0]*duracion();
                break;
                case Zona2:
                total = tabla[1]*duracion();
                break;
                case Zona3:
                total = tabla[2]*duracion();
                break;
                case Zona4:
                total = tabla[3]*duracion();
                break;
                case Zona5:
                total = tabla[4]*duracion();
                break;
            }
            
           
        }

        return total;
    }

    @Override
    public String toString() {
        return "Llamada{" + "telefonoCliente=" + telefonoCliente + ", telefonoInterlocutor=" + telefonoInterlocutor + ", saliente=" + saliente + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", tabla=" + tabla + ", zona=" + zona + "duracion" + duracion() + "A pagar" + tarifa
    }
    
    
    
    
    
    
        public String getTelefonoCliente() {
        return this.telefonoCliente;
    }

    public String gettelefonoInterlocutor() {
        return this.telefonoInterlocutor;
    }

    public boolean getSaliente(){
        return this.saliente;
    }

    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    public LocalDate getFechaFin() {
        return this.fechaFin;
    }
    public LocalTime getHoraInicio(){
        return this.horaInicio;
    }
    public LocalTime getHoraFin(){
        return this.horaFin;
    }

    public void setTelefonoCliente(String telefono) {
        this.telefonoCliente = telefono;
    }

    public void setTelefonoInterlocutor(String interlocutor) {
        this.telefonoInterlocutor = interlocutor;
    }

    public void setSaliente(boolean saliente) {
        this.saliente = saliente;
    }

    public void setFechaInicio(LocalDate inicio) {
        this.fechaInicio= inicio;
    }

    public void setFechaFin(LocalDate fin) {
        this.fechaFin = fin;
    }

    public double[] getTabla() {
        return tabla;
    }

    public void setTabla(double[] tabla) {
        this.tabla = tabla;
    }

    public Zonas getZona() {
        return zona;
    }

    public void setZona(Zonas zona) {
        this.zona = zona;
    }
}
  
