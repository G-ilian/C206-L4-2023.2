package br.inatel.lab.excecoes;

public class Funcionario {
    // Criando os atributos
    private String nomeFunc;
    private String cargoFunc;
    private int idadeFunc;

    // Construtor do funcionário
    public Funcionario(String nomeFunc, String cargoFunc, int idadeFunc) {
        this.nomeFunc = nomeFunc;
        this.cargoFunc = cargoFunc;
        this.idadeFunc = idadeFunc;
    }

    // Getters e setters do funcionário

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCargoFunc() {
        return cargoFunc;
    }

    public void setCargoFunc(String cargoFunc) {
        this.cargoFunc = cargoFunc;
    }

    public int getIdadeFunc() {
        return idadeFunc;
    }

    public void setIdadeFunc(int idadeFunc) {
        this.idadeFunc = idadeFunc;
    }
}
