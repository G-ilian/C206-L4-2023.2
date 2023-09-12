import br.inatel.predio6.aula06.Teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teste teste = new Teste();
        Teste teste2 = new Teste();
        Teste teste3 = new Teste();


        System.out.println("Quantidade de objetos criados: "+Teste.cont);

        // Criando os objetos de funcionário
        Funcionario func1 = new Funcionario("Gabriel");
        Funcionario func2 = new Funcionario("Ramon");
        Funcionario func3 = new Funcionario("Artur");
        Funcionario func4 = new Funcionario("Artur");
        func1.setCpf("123.345.678-90");


        // Entrada de dados usando o setter
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu cpf");
        String cpf = sc.nextLine();
        func2.setCpf(cpf);
        func1.mostrarInfos();
        func2.mostrarInfos();
        func3.mostrarInfos();

        System.out.println("Quantidade total de funcionários: "+Funcionario.getCont());


    }
}