package br.inatel.predio06.aulaHeranca;

public class Engenheiro extends Funcionario implements GerenciarProjetos{
    // Atributos específicos do engenheiro
    protected String ramoAtuacao;

    public Engenheiro(String nome, String cpf, int idade, double salario, String ramoAtuacao) {
        super(nome, cpf, idade, salario);
        this.ramoAtuacao = ramoAtuacao;
    }

    // Método vindo da classe mãe

    @Override
    public void mostrarInfos(){
        System.out.println("INFORMAÇÕES DO ENGENHEIRO");
        super.mostrarInfos();
        System.out.println("Ramo de atuação: "+ramoAtuacao);
    }

    @Override
    public void executaAcao() {
        System.out.println(this.nome+" está programando");
    }

    @Override
    public void gerenciarProjetos() {
        System.out.println(this.nome+" está gerenciando o projeto xpto");
    }
}
