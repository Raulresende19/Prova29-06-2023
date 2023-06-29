import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private double PREMIO = 0.3;

    //Construtor

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Bonificacao bonificacao, double PREMIO) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento, bonificacao);
        this.PREMIO = PREMIO;
    }
    //getter and setter

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }
    //ToString

    @Override
    public String toString() {
        return super.toString() +
                "/n Premio: " + PREMIO ;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salario * this.PREMIO;
        salarioFinal += super.salario;
        return salarioFinal;
    }

    @Override
    public void adimitir(Funcionario funcionario) {
        System.out.println("Você Foi Adimitido");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Você foi Demitido:");
    }
}
