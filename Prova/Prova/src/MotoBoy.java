import java.time.LocalDate;

public class MotoBoy extends Funcionario{
    private String carteiraDeHabilitacao;

    //Construtor

    public MotoBoy(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, String carteiraDeHabilitacao) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    //Getter

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    //ToString

    @Override
    public String toString() {
        return super.toString()+
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }
}
