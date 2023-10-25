import br.inatel.aula11.javaIO.Arquivo;
import br.inatel.aula11.javaIO.model.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto de Arquivo
        Arquivo arq = new Arquivo();
        // Criando uma estrutura para entrada de dados
        Scanner sc = new Scanner(System.in);
        // Controladora do menu
        boolean executando = true;
        // Criando um objeto de Funcionario
        Funcionario func = new Funcionario();


        while(executando){
            // Menu de informações
            System.out.println("+++ BEM VINDO AO MENU DE CADASTRO DE FUNCIONÁRIOS +++");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            // Menu
            switch (op){
                case 1:
                    // Coletando as informações do funcionário
                    System.out.println("Nome: ");
                    func.setNome(sc.nextLine());
                    System.out.println("Cargo: ");
                    func.setCargo(sc.nextLine());
                    System.out.println("Idade: ");
                    func.setIdade(sc.nextInt());

                    // Escrevendo o funcionário no arquivo
                    arq.escrever(func);
                    break;
                case 2:
                    // Executar o método de leitura
                    ArrayList<Funcionario> funcionarios = arq.ler();
                    System.out.println("INFORMAÇÕES DOS FUNCIONARIOS");
                    for (int i = 0; i < funcionarios.size(); i++) {
                        System.out.println("Nome "+funcionarios.get(i).getNome());
                        System.out.println("Cargo "+funcionarios.get(i).getCargo());
                        System.out.println("Idade "+funcionarios.get(i).getIdade());
                    }
                    break;
                case 3:
                    // Sair do menu
                    executando=false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }


        }




    }
}