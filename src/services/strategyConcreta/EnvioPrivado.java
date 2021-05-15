package services.strategyConcreta;

import services.strategyInterfaces.Transportista;

public class EnvioPrivado implements Transportista {

    /* USO DATOS SOLO PARA EJEMPLO costoporPesoDistancia y costoporPesoLocal*/

    public float getTarifa(String tipo, int distancia, int peso) {
        float resultado;
        if ("LARGA_DISTANCIA".equals(tipo)) {
            float costoporPesoDistancia = 600;
            resultado = costoporPesoDistancia * peso;
        } else {
            float costoporPesoLocal = 300;
            resultado = costoporPesoLocal * peso;
        }
        return resultado;

    }

}
