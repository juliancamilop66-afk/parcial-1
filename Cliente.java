import java.io.Serializable;
import java.time.LocalTime;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String identificacion;
    private String tipoTransaccion;
    private LocalTime horaLlegada;
    
    public Cliente(String nombre, String identificacion, String tipoTransaccion, LocalTime horaLlegada) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoTransaccion = tipoTransaccion;
        this.horaLlegada = horaLlegada;
    }
    
    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public String getTipoTransaccion() { return tipoTransaccion; }
    public LocalTime getHoraLlegada() { return horaLlegada; }
    
    @Override
    public String toString() {
        return nombre + " (" + identificacion + ") - " + tipoTransaccion + " - " + horaLlegada;
    }
}