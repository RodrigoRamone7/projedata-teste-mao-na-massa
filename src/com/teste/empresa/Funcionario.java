package com.teste.empresa;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;
    private final Locale localBR;
    private final NumberFormat moeda;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
        localBR = new Locale("pt", "BR");
        moeda = NumberFormat.getCurrencyInstance(localBR);
    }

    public void setSalario(BigDecimal novoSalario){
        this.salario = novoSalario;
    }

    public BigDecimal getSalario(){
        return this.salario;
    }

    public String getSalarioFormatado(){
        double salarioDouble = Double.parseDouble(this.salario.toString());
        return moeda.format(salarioDouble);
    };

    public String getFuncao(){
        return this.funcao;
    }

}
