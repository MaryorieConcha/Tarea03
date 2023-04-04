package Model;

public enum TipoDeClinica {
    Priv("Privada"),
    Public("Pública");
    private String tipoDeClinica;

    TipoDeClinica(String tipoDeClinica) {
        this.tipoDeClinica = tipoDeClinica;
    }

    public String getTipoDeClinica() {
        return tipoDeClinica;
    }
}
