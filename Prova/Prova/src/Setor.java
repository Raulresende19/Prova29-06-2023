public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");

    protected final String nome;

    //Construtor

    Setor(String nome) {
        this.nome = nome;
    }
    //Metodo gett

    public String getNome() {
        return nome;
    }
}
