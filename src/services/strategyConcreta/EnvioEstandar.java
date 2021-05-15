package services.strategyConcreta;

import services.strategyInterfaces.Transportista;

public class EnvioEstandar implements Transportista {

    /* USO DATOS SOLO PARA EJEMPLO*/
    private final float costoporkmLocal = 60;
    private final float costoporkmDistancia = 30;

    public float getTarifa(String tipo, int distancia, int peso) {
        float resultado = 0;
        if ("LARGA_DISTANCIA".equals(tipo)) {
            resultado = costoporkmDistancia * distancia;
        } else {
            resultado = costoporkmLocal * distancia;
        }
        return resultado;
    }
}
