import com.teste.empresa.Principal;

import java.math.BigDecimal;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal();

        principal.adicionarFuncionario("Maria",
                LocalDate.of(2000, 10, 18),
                BigDecimal.valueOf(2009.44),
                "Operador");

        principal.adicionarFuncionario("João",
                LocalDate.of(1990, 5, 12),
                BigDecimal.valueOf(2284.38),
                "Operador");

        principal.adicionarFuncionario("Caio",
                LocalDate.of(1961, 5, 2),
                BigDecimal.valueOf(9836.14),
                "Coordenador");

        principal.adicionarFuncionario("Miguel",
                LocalDate.of(1988, 10, 14),
                BigDecimal.valueOf(19119.88),
                "Diretor");

        principal.adicionarFuncionario("Alice",
                LocalDate.of(1995, 1, 5),
                BigDecimal.valueOf(2234.68),
                "Recepcionista");

        principal.adicionarFuncionario("Heitor",
                LocalDate.of(1999, 11, 19),
                BigDecimal.valueOf(1582.72),
                "Operador");

        principal.adicionarFuncionario("Arthur",
                LocalDate.of(1993, 3, 31),
                BigDecimal.valueOf(4071.84),
                "Contador");

        principal.adicionarFuncionario("Laura",
                LocalDate.of(1994, 7, 8),
                BigDecimal.valueOf(3017.45),
                "Gerente");

        principal.adicionarFuncionario("Heloísa",
                LocalDate.of(2003, 5, 24),
                BigDecimal.valueOf(1606.85),
                "Eletricista");

        principal.adicionarFuncionario("Helena",
                LocalDate.of(1996, 9, 2),
                BigDecimal.valueOf(2799.93),
                "Gerente");

        principal.listaDeFuncionarios();

        principal.adicionarAumentoParaTodos(0.1);

        principal.listaDeFuncionarios();

        principal.removerFuncionarioPorNome("João");

        principal.listaDeFuncionarios();

        principal.totalDeSalarios();

        principal.listaDeFuncionarios_OrdemAlfaberica();
    }
}