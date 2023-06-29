import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{
    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento, bonificacao);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }
}
