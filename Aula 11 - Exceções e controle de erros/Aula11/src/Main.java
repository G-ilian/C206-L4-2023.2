import br.inatel.lab.excecoes.Funcionario;
import br.inatel.lab.excecoes.Modelos.Conta;
import br.inatel.lab.excecoes.SemSaldoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Lançando algumas exceções conhecidas
        // 1. NullPointerException
        Funcionario func1 = new Funcionario("Gabriel","Dev",22);
        Funcionario func2 = new Funcionario("Ramon","Dev Júnior",23);
        Funcionario func3 = new Funcionario("Arthur","Dev Pleno",26);

        // Criando um array para funcionários
        Funcionario []funcionarios = new Funcionario[10];

        // Adicionar os funcionários nas posições
        funcionarios[0]=func1;
        funcionarios[1]=func2;

        // ArrayIndexOutOfBoundsExceptions
        try{
            funcionarios[11]=func3;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Deu ruim mais eu segui o código!!");
            //e.printStackTrace();
        }


        // Apresentar as informações

        try{
                for (int i = 0; i < funcionarios.length; i++) {
                    // O trecho de código que potencialmente pode gerar erro
                    if(funcionarios[i]!=null){
                        System.out.println("NOME: "+funcionarios[i].getNomeFunc());
                        System.out.println("Cargo: "+funcionarios[i].getCargoFunc());
                        System.out.println("IDADE: "+funcionarios[i].getIdadeFunc());
                    }

                }

        }catch (NullPointerException e){
            System.out.println("Deu ruim na leitura !!");
        }

        System.out.println("Continua executando de qualquer maneira !!!");


        // Tratamento de erro aritmetico
        Scanner sc = new Scanner(System.in); // Variável para entrada de dados

        int media = 0; // Média da divisão
        try{
            System.out.println("Entre com o valor de n1 > ");

            int n1 = sc.nextInt();
            System.out.println("Entre com o valor de n2 > ");
            int n2 = sc.nextInt();

            media = n1/n2;

        }catch (ArithmeticException e){
            System.out.println("Seu código está com divisão por zero");
            System.out.println(e.fillInStackTrace());
        }catch (InputMismatchException input){
            System.out.println("Deu erro no tipo da entrada de dados");
        }finally {
            System.out.println("MÉDIA: "+media);
        }
        System.out.println("Depois da divisão??? ");
        */

        // Exceções personalizadas
        Conta conta1 = new Conta(1000,"Gabriel");


        conta1.sacar(1200);

        System.out.println("oi");
    }
}