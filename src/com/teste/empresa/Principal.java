package com.teste.empresa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Principal {
    private List<Funcionario> funcionarios;
    private Map funcionariosAgrupados;

    private Principal(){
        this.funcionarios = new ArrayList<>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Funcionario> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Funcionario funcionario) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Funcionario> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Funcionario> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Funcionario get(int index) {
                return null;
            }

            @Override
            public Funcionario set(int index, Funcionario element) {
                return null;
            }

            @Override
            public void add(int index, Funcionario element) {

            }

            @Override
            public Funcionario remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Funcionario> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Funcionario> listIterator(int index) {
                return null;
            }

            @Override
            public List<Funcionario> subList(int fromIndex, int toIndex) {
                return List.of();
            }
        };
        this.funcionariosAgrupados = new HashMap<>();
    }

    public void adicionarFuncionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao){
        funcionarios.add(new Funcionario(nome, dataNascimento, salario, funcao));
    }
    public void removerFuncionarioPorNome(String nome){
        for (Funcionario funcionario : funcionarios){
            if(Objects.equals(funcionario.nome, nome)){
                funcionarios.remove(funcionario);
                break;
            }
        }
    }
    public void listaDeFuncionarios(){
        for (Funcionario funcionario : funcionarios){
            System.out.println();
        }
    }
    public void adicionarAumentoParaTodos(float porcentagem){

    }
    public Map agruparPorFuncao(){

    }
    public void listaDeFuncionarios_AgrupadoPorFuncao(){

    }
    public void listaDeFuncionarios_OrdemAlfaberica(){

    }
    public void funcionario_ComMaiorIdade(){

    }
    public void totalDeSalarios(){

    }
    public void totalDeSalariosMinimos_CadaFuncionario(){

    }
}
