package com.teste.empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
    private final String nome;
    private final LocalDate dataNascimento;
    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    };

    public String getNome(){
        return this.nome;
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public String getDataNascimentoFormatado(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dataNascimento.format(formatador);
    }
}
