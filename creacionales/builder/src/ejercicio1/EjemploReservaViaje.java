// Ejemplo de uso del patrón Builder
public class EjemploReservaViaje {
    public static void main(String[] args) {
        // Crear una reserva de viaje con solo la fecha de salida y destino
        ReservaDeViaje reserva1 = ReservaDeViaje.builder()
                .fechaSalida(LocalDateTime.of(2024, 03, 01, 10, 15))
                .duracion(7)
                .build();


        // Crear una reserva de viaje con detalles personalizados
        ReservaDeViaje reserva2 = ReservaDeViaje.builder()
                .fechaSalida(LocalDateTime.of(2024, 05, 15, 21, 07))
                .duracion(10)
                .tipoAlojamiento("Hotel de lujo")
                .transporte(TipoTransporte.VUELO_DIRECTO")
                        .actividades(List.of("Visita a museos", "excursiones"))
                        .dietaEspecial("Vegetariana")
                        .build();


        // Realizar operaciones con las instancias de reserva de viaje creadas
        System.out.println("Reserva 1: " + reserva1.getFechaSalida());
        System.out.println("Reserva 2: " + reserva2.getFechaSalida() + ", Duración: " + reserva2.getDuracion() + " días");
    }
}
