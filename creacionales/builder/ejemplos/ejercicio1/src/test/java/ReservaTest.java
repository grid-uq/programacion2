import modelo.ReservaDeViaje;
import modelo.TipoTransporte;

import java.time.LocalDateTime;

public class ReservaTest {

    public void crearReservaTest(){

        ReservaDeViaje reserva = ReservaDeViaje.builder()
                .fechaSalida(LocalDateTime.of(2024, 2, 5, 20, 0))
                .duracion(5)
                .transporte(TipoTransporte.VEHICULO_ALQUILADO)
                .build();



    }

}
