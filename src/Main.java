
import services.strategyContexto.Envio;

public class Main {
    /* valores para ingresar como ejemplo
     * TRANSPORTISTA = PRIVADO Y ESTANDAR
     * TIPO= LOCAL Y LARGA_DISTANCIA
     * DISTANCIAENKILOMETROS= UN NUMERO
     * PESOENKILOS= UN NUMERO*/
    /* envio.getPrecioEnvio(transportista, tipo, distanciaEnKilometros, pesoEnKilos);*/

    public static void main(String[] args) {
        Envio envio = new Envio();
        /*ejemplo 1*/
        float respuesta1 = envio.getPrecioEnvio("ESTANDAR", "LARGA_DISTANCIA", 5, 10);
        System.out.println("El costo ESTANDAR, larga distancia es: " + respuesta1 + "$");
        /*ejemplo 2*/
        float respuesta2 = envio.getPrecioEnvio("ESTANDAR", "LOCAL", 5, 10);
        System.out.println("El costo ESTANDAR, LOCAL es: " + respuesta2 + "$");
        /*ejemplo 3*/
        float respuesta3 = envio.getPrecioEnvio("PRIVADO", "LARGA_DISTANCIA", 5, 10);
        System.out.println("El costo PRIVADO, larga distancia es: " + respuesta3 + "$");
        /*ejemplo 4*/
        float respuesta4 = envio.getPrecioEnvio("PRIVADO", "LOCAL", 5, 10);
        System.out.println("El costo PRIVADO, LOCAL es: " + respuesta4 + "$");
    }


}
