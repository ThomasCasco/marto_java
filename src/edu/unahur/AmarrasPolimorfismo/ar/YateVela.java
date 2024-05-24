package edu.unahur.AmarrasPolimorfismo.ar;

public class YateVela extends Yate {
    private double alturaMastil;
    private double superficieVelicaMayor;
    private double superficieTotal;

    public YateVela(String nombre, String dueno, double manga, double calado, double eslora, int tripulacion, int peso, double alturaMastil, int superficieVelicaMayor, int superficieTotal) {
        super(nombre, dueno, manga, calado, eslora, tripulacion, peso);
        this.alturaMastil = alturaMastil;
        this.superficieVelicaMayor = superficieVelicaMayor;
        this.superficieTotal = superficieTotal;
    }
}
