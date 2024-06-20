package com.teste.empresa;

import java.time.LocalDate;

public abstract class Pessoa {
    public String nome;
    public LocalDate dataNascimento;
    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    };
}
