package services;

public enum TransporteEnum {

    EPRIVADO("PRIVADO"),
    EESTANDAR("ESTANDAR");

    private final String descripcion;

    TransporteEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static boolean isValidTransporte(String transporte) {
        for (TransporteEnum transporteActual : TransporteEnum.values()) {
            if (transporteActual.toString().equals(transporte)) {
                return true;
            }
        }

        return false;
    }
}
