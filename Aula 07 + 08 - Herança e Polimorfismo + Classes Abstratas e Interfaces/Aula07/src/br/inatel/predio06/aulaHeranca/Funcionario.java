package br.inatel.predio06.aulaHeranca;

public abstract class Funcionario {
    // Atributos = Características
    protected String nome;
    private String cpf;
    public int idade;
    public double salario;

    // Construtor

    public Funcionario(String nome, String cpf, int idade, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }


    // Comportamentos = Métodos

    public void tirarFerias(){
        System.out.println("O funcionário "+this.nome+" tirou férias");
    }

    public double calcularSalarioAnual(){
        return salario*12;
    }

    public void mostrarInfos(){
        System.out.println("NOME: "+this.nome);
        System.out.println("IDADE: "+this.idade);
        System.out.println("SALÁRIO: "+this.salario);
        System.out.println("CPF: "+this.cpf);
    }

    public abstract void executaAcao();

    // Modificadores de acesso


    public String getCpf() {
        return cpf;
    }
}
