public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");

    protected final String texto;

    //Construtor

    EstadoCivil(String texto) {
        this.texto = texto;
    }
    //Metodo Getter

    public String getTexto() {
        return texto;
    }

}
