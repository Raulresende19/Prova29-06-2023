public enum Genero {
    MASCULINO('M',"Masculino"),
    FEMININO('F',"Feminono");

    protected final char caractere;
    protected final String texto;

    //Constutores

    Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }
    //MetodoGetter

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
}
