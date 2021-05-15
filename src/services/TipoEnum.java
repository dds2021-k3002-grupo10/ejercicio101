package services;

public enum TipoEnum {

    L("LOCAL"),
    LD("LARGA_DISTANCIA");
    private final String descripcion;

    TipoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static boolean isValidTipo(String tipo) {
        for (TipoEnum tipoActual : TipoEnum.values()) {
            if (tipoActual.toString().equals(tipo)) {
                return true;
            }
        }

        return false;
    }
}
