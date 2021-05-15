package services.strategyContexto;

import services.TipoEnum;
import services.TransporteEnum;
import services.strategyConcreta.EnvioEstandar;
import services.strategyConcreta.EnvioPrivado;
import services.strategyInterfaces.Transportista;

public class Envio {
    private Transportista transportista;

    public Envio() {
    }


    public float getPrecioEnvio(String transportistas, String tipo, int distancia, int peso) {
        /*si es trasporte privado instancio envioprivado
        * si es trasporte estandar instancio envioprivado, cada trasportista calcula sus costos
        * sea por envio local o largadistancia*/
        if (TransporteEnum.EPRIVADO.getDescripcion().equals(transportistas)) {
            this.transportista = new EnvioPrivado();

        } else if (TransporteEnum.EESTANDAR.getDescripcion().equals(transportistas)) {
            this.transportista = new EnvioEstandar();
        }

        return this.transportista.getTarifa(tipo, distancia, peso);
    }

}
