import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;
    //Construtor


    public CargoDeConfianca(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.bonificacao = bonificacao;
    }
    //Getter e setter

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    //ToString

    @Override
    public String toString() {
        return super.toString() +
                "bonificacao=" + bonificacao ;
    }
}
