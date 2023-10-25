package br.inatel.aula11.javaIO.model;

public class Funcionario {
    // Atributos do funcionario
    private String nome;
    private int idade;
    private String cargo;


    // Criando getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
