import java.time.LocalDateTime;
import java.util.List;

public class ReservaDeViaje {

    private LocalDateTime fechaSalida;
    private int duracion;
    private String tipoAlojamiento;
    private TipoTransporte transporte;
    private List<String> actividades;
    private String dietaEspecial;

    public ReservaDeViaje(LocalDateTime fechaSalida, int duracion, String tipoAlojamiento, TipoTransporte transporte, List<String> actividades, String dietaEspecial) {
        this.fechaSalida = fechaSalida;
        this.duracion = duracion;
        this.tipoAlojamiento = tipoAlojamiento;
        this.transporte = transporte;
        this.actividades = actividades;
        this.dietaEspecial = dietaEspecial;
    }

    //Getters y setters

    public static ReservaDeViajeBuilder builder(){
        return new ReservaDeViajeBuilder();
    }

    public static class ReservaDeViajeBuilder{

        private LocalDateTime fechaSalida;
        private int duracion;
        private String tipoAlojamiento;
        private TipoTransporte transporte;
        private List<String> actividades;
        private String dietaEspecial;

        private ReservaDeViajeBuilder(){}

        public ReservaDeViajeBuilder fechaSalida(LocalDateTime fechaSalida) {
            this.fechaSalida = fechaSalida;
            return this;
        }

        public ReservaDeViajeBuilder duracion(int duracion) {
            this.duracion = duracion;
            return this;
        }

        public ReservaDeViajeBuilder tipoAlojamiento(String tipoAlojamiento) {
            this.tipoAlojamiento = tipoAlojamiento;
            return this;
        }

        public ReservaDeViajeBuilder transporte(TipoTransporte transporte) {
            this.transporte = transporte;
            return this;
        }

        public ReservaDeViajeBuilder actividades(List<String> actividades) {
            this.actividades = actividades;
            return this;
        }

        public ReservaDeViajeBuilder dietaEspecial(String dietaEspecial) {
            this.dietaEspecial = dietaEspecial;
            return this;
        }

        public ReservaDeViaje build(){
            return new ReservaDeViaje(fechaSalida, duracion, tipoAlojamiento, transporte, actividades, dietaEspecial);
        }

    }

}
