// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Array de primitivos - Declarações
        int [] idades = {1,2,3,4,5};
        char [] iniciaisDoNome = new char[10];
        float [] salario;
        double [] valores;

        // Mostrando os valores do array
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Na posição ["+i+"]"+"está o valor"+idades[i]);
        }

        // Array de referências
        Funcionario funcionario1 = new Funcionario(); // Instanciou o objeto
        funcionario1.nome = "Gabriel";
        funcionario1.cpf="123-456-789-00";
        funcionario1.salario=1250.80;

        Funcionario [] arrayDeFuncionarios = new Funcionario[10]; // Array de referencia

        // Adicionando o funcionário no array
        arrayDeFuncionarios[0] = funcionario1;

        for (int i = 0; i < arrayDeFuncionarios.length; i++) {
            if(arrayDeFuncionarios[i]==null)
                arrayDeFuncionarios[i]=funcionario1;
        }

        // Imprimindo os valores do array de Funcionarios
        for (int i = 0; i < arrayDeFuncionarios.length; i++) {
            // Controle de fluxo para só mostrar valores !null
            if(arrayDeFuncionarios[i]!=null)
                arrayDeFuncionarios[i].mostrarInfos();
        }





    }
}