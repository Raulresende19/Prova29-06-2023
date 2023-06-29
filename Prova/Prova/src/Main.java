import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor("Raul", "8656461", "46464646", new Endereco("DAOSDKOK", "260", "51", "56565656", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 4646065, EstadoCivil.CASADO, LocalDate.of(2000, Month.APRIL, 10), Bonificacao.DIRETOR, 500);
        Engenheiro engenheiro = new Engenheiro("Raul", "8656461", "46464646", new Endereco("DAOSDKOK", "260", "51", "56565656", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 4646065, EstadoCivil.CASADO, LocalDate.of(2000, Month.APRIL, 10), "165161");
        MotoBoy motoBoy = new MotoBoy("Raul", "8656461", "46464646", new Endereco("DAOSDKOK", "260", "51", "56565656", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 4646065, EstadoCivil.CASADO, LocalDate.of(2000, Month.APRIL, 10), "665dasd");

        System.out.println(diretor);
        System.out.println(motoBoy);
        System.out.println(engenheiro);
    }


}
