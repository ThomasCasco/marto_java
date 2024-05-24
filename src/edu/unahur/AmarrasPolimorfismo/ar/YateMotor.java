package edu.unahur.AmarrasPolimorfismo.ar;

public class YateMotor extends Yate {
    private double desplazamiento;
    private String propulsion;
    private double potencia;
    private double velocidad;
    private double autonomia;

    public YateMotor(String nombre, String dueno, double manga, double calado, double eslora, int tripulacion, double peso, double desplazamiento, String propulsion, double potencia, double velocidad, double autonomia) {
        super(nombre, dueno, manga, calado, eslora, tripulacion, peso);
        this.desplazamiento = desplazamiento;
        this.propulsion = propulsion;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.autonomia = autonomia;
    }


    public double obtenerPrecioDeAmarre(){
        double precioBase = 10000;
        double adicionalEslora = eslora > 20 ? 3000 : 2000;
        return precioBase + adicionalEslora;
    }


}