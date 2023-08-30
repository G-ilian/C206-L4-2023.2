package ExercicioProposto;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criando o objeto da escola
        Escola escola = new Escola();
        escola.nome="Escola Do Paulo";
        escola.endereco="Rua Do Paulo";
        escola.numTelefone=00000;
        escola.email="escola@email.com.br";


        // Criando o menu
        boolean controle=true;

        while(controle){
            System.out.println("BEM VINDO AO SISTEMA DE CADASTRO DA ESCOLA");
            System.out.println("1- Adicionar Alunos");
            System.out.println("2- Mostrar informações");
            System.out.println("3 - Mostrar quantidade aluno por ano");
            System.out.println("4 - Sair");
            // Capturando a informação digitada pelo usuário
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    // Instanciando um objeto de aluno
                    Estudante aluno = new Estudante();

                    // Preenchendo as informações dos alunos
                    System.out.println("Nome do aluno: ");
                    aluno.nome = sc.nextLine();
                    System.out.println("Idade do aluno: ");
                    aluno.idade = sc.nextInt();
                    sc.nextLine(); // Limpando o buffer
                    System.out.println("Ano em que estuda: ");
                    aluno.anoLetivo=sc.nextLine();

                    // Adicionando o aluno a escola
                    escola.addEstudante(aluno);
                    break;
                case 2:
                    // Mostrando todas as informações da escola e dos alunos
                    escola.mostrarInfos();
                    break;
                case 3:
                    // Mostrando a quantidade de alunos por ano
                    escola.qtdEstudantesPorAno();
                    break;
                case 4:
                    // Saindo do menu
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida !!!!");
                    break;

            }

        }


    }
}
