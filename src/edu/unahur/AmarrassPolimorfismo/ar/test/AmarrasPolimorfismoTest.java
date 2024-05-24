package edu.unahur.AmarrassPolimorfismo.ar.test;

import edu.unahur.AmarrasPolimorfismo.ar.Fondeadero;
import edu.unahur.AmarrasPolimorfismo.ar.Yate;
import edu.unahur.AmarrasPolimorfismo.ar.YateMotor;

import edu.unahur.AmarrasPolimorfismo.ar.YateVela;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AmarrasPolimorfismoTest {

    @Test
    public void crearFondeaderoConAmarras() {
        Fondeadero fondeadero = new Fondeadero(70);
    }

    @Test
    public void amarroElYateYSeAgrega(){
        Fondeadero fondeadero1 = new Fondeadero(70);
        YateMotor yatemotor1 = new YateMotor("Az1","Adrés Borgeat",18.87,5.15,119.0,37,4400,5959,"2 x Motores diésel MAN RK2805",9000,23,6500);
        fondeadero1.amarrarYate(yatemotor1);
        assertEquals(1,fondeadero1.obtenerCantidadDeYatesAmarrados());
    }

    @Test
    public void testDesamarrarYate() {
        Fondeadero fondeadero = new Fondeadero(70);
        Yate yate = new YateVela("XXR", "Sebastián Pardo", 6.90, 2.7, 13.45, 5, 1400, 21.5, 85, 133);

        fondeadero.amarrarYate(yate);
        String resultado = fondeadero.desamarrarYate(yate);
        assertEquals("Yate desamarrado", resultado);
    }

    @Test
    public void testObtenerCantidadDeAmarrasDisponiblesCorrectas() {
        Fondeadero fondeadero1 = new Fondeadero(70);
        Yate yatesito = new YateVela("XXR", "Sebastián Pardo", 6.90, 2.7, 13.45, 5, 1400, 21.5, 85, 133);
        fondeadero1.amarrarYate(yatesito);
        assertEquals(69,fondeadero1.obtenerCantidadDeAmarrasDisponibles());
    }

}
