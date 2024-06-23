package com.teste.empresa;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;


public class Principal {
    private List<Funcionario> funcionarios;
    private final Locale localBR;
    private final NumberFormat moeda;

    public Principal(){
        funcionarios = new ArrayList<>();
        localBR = new Locale("pt", "BR");
        moeda = NumberFormat.getCurrencyInstance(localBR);
    }

    public void adicionarFuncionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao){
        funcionarios.add(new Funcionario(nome, dataNascimento, salario, funcao));
    }
    public void removerFuncionarioPorNome(String nome){
        for (Funcionario funcionario : funcionarios){
            if(Objects.equals(funcionario.getNome(), nome)){
                funcionarios.remove(funcionario);
                System.out.println("Funcionário " + nome + " Removido.");
                break;
            }
        }
    }
    public void listaDeFuncionarios(){
        System.out.println(" ");
        System.out.println("Lista de Funcionários");
        System.out.format("+-----------------+--------------------+---------------+-----------------+%n");
        System.out.format("| Nome            | Data de Nascimento | Salário       | Função          |%n");
        System.out.format("+-----------------+--------------------+---------------+-----------------+%n");

        String leftAlignFormat = "| %-15s | %-18s | %-13s | %-15s | %n";

        for (Funcionario funcionario : funcionarios) {

            System.out.format(leftAlignFormat, funcionario.getNome(),
                    funcionario.getDataNascimentoFormatado(),
                    funcionario.getSalarioFormatado(),
                    funcionario.getFuncao());
        }

        System.out.format("+-----------------+--------------------+---------------+-----------------+%n");
        System.out.println(" ");
    }
    public void listaDeFuncionarios(List<Funcionario> lista){
        System.out.println(" ");
        System.out.println("Lista de Funcionários");
        System.out.format("+-----------------+--------------------+---------------+-----------------+%n");
        System.out.format("| Nome            | Data de Nascimento | Salário       | Função          |%n");
        System.out.format("+-----------------+--------------------+---------------+-----------------+%n");

        String leftAlignFormat = "| %-15s | %-18s | %-13s | %-15s | %n";

        for (Funcionario funcionario : lista) {

            System.out.format(leftAlignFormat, funcionario.getNome(),
                    funcionario.getDataNascimentoFormatado(),
                    funcionario.getSalarioFormatado(),
                    funcionario.getFuncao());
        }

        System.out.format("+-----------------+--------------------+---------------+-----------------+%n");
        System.out.println(" ");
    }

    public void adicionarAumentoParaTodos(double porcentagem){
        for(Funcionario funcionario : funcionarios){
            double salarioDouble = Double.parseDouble(funcionario.getSalario().toString());
            double salarioComAumento = salarioDouble + (salarioDouble * porcentagem);
            funcionario.setSalario(BigDecimal.valueOf(salarioComAumento));
        }
        double porcentagemFormatada = porcentagem * 100 ;
        System.out.println(" ");
        System.out.println("Aumento de " + porcentagemFormatada +"% em todos os salários.");
        System.out.println(" ");
    }

    public Map agruparPorFuncao(){
        Map<String, Funcionario> funcionariosAgrupados = new HashMap<>();



        return funcionariosAgrupados;
    }
    public void listaDeFuncionarios_AgrupadoPorFuncao(){

    }

    public void listaDeFuncionarios_OrdemAlfaberica(){
        List<Funcionario> funcinarios_OrdemAlfaberica = funcionarios;
        funcinarios_OrdemAlfaberica.sort(Comparator.comparing(Funcionario::getNome));
        System.out.println("Lista ordenada por Ordem alfabética");
        this.listaDeFuncionarios(funcinarios_OrdemAlfaberica);

    }
    public void funcionario_ComMaiorIdade(){

    }
    public void totalDeSalarios(){
        double totalSalarios = 0;

        for(Funcionario funcionario : funcionarios){
            double salarioDouble = Double.parseDouble(funcionario.getSalario().toString());
            totalSalarios += salarioDouble;
        }
        System.out.println("Valor total de salários: " + moeda.format(totalSalarios));
        System.out.println(" ");
    }
    public void totalDeSalariosMinimos_CadaFuncionario(){

    }
}
