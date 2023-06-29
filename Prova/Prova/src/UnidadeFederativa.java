public enum UnidadeFederativa {
    BAHIA("Bahia","BA"),
    SAO_PAULO("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio De Janeiro","RJ");

    protected final String nome;
    protected final String sigla;

    UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
