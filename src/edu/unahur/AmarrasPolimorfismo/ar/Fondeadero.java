package edu.unahur.AmarrasPolimorfismo.ar;

import java.util.ArrayList;
import java.util.List;

public class Fondeadero {
    private int maxAmarras;
    public List<Yate> yatesAmarrados;

    public Fondeadero(int maxAmarras) {
        this.maxAmarras = maxAmarras;
        this.yatesAmarrados = new ArrayList<Yate>();
    }


    public String amarrarYate(Yate yate) {
        if (yate == null) {
            return  "No existe el yate";
        }
        if (yatesAmarrados.size() >= maxAmarras) {
            return "no hay amarras disponibles";
        }
        yatesAmarrados.add(yate);
        return "Yate amarrado";
    }

    public int obtenerCantidadDeYatesAmarrados() {
        return yatesAmarrados.size();
    }

    public String desamarrarYate(Yate yate) {
        if (yatesAmarrados.remove(yate)) {
            return "Yate desamarrado";
        } else {
            return "Yate no encontrado";
        }
    }

    public int obtenerCantidadDeAmarrasDisponibles() {
        return maxAmarras - obtenerCantidadDeYatesAmarrados();
    }
}
