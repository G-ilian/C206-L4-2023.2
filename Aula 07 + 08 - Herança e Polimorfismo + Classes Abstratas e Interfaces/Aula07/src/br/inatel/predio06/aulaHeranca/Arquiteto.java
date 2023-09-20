package br.inatel.predio06.aulaHeranca;

public class Arquiteto extends Funcionario implements DesignInterior{
    // Atributos
    private String especialidade;

    public Arquiteto(String nome, String cpf, int idade, double salario, String especialidade) {
        super(nome, cpf, idade, salario);
        this.especialidade = especialidade;
    }

    // Métodos
    @Override
    public void mostrarInfos(){
        System.out.println("INFORMAÇÕES DO ARQUITETO");
        super.mostrarInfos();
        System.out.println("Especialidade: "+especialidade);
    }

    @Override
    public void executaAcao() {
        System.out.println(this.nome+" está desenhando");
    }

    public void mostrarNomeECpf(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+this.getCpf());
    }

    // Setters

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public double calcularSalarioAnual(){
        if(especialidade.equalsIgnoreCase("Design"))
            return (12*salario)+1500;
        else{
            return (12*salario);
        }

    }

    @Override
    public void desenhouDesign() {
        System.out.println(this.nome+" desenhou o design");
    }
}
