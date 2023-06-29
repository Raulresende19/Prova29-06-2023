import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    private String crea;

    //Constutor

    public Engenheiro(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, String crea) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.crea = crea;
    }

    //Metodos Getter e Setter

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    //ToString

    @Override
    public String toString() {
        return super.toString()  +
                "crea='" + crea ;
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }
}
