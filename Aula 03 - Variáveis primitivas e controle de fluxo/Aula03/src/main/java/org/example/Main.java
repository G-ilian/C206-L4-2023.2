package org.example;


import java.util.Scanner;

public class Main {
    // Método main
    public static void main(String[] args) {
        /* Comentário para mais
         * de uma linha */

        /* Variáveis primitivas
        * Armazenam valor diretamente*/
        int idade = 21; //21
        int idade1;
        int idade2;
        float salario;
        double valor;
        char letra;
        final int CREDITOS_MATRICULA = 27; // Declaração de variáveis constantes
        boolean valorLogico; // Valor booleano

        /* Variáveis de referência
        * Armazenam a posição de memória*/
        String palavra="oi"; // 0x21B4
        String nomeSobrenome; // Declaração de variávels compostas


        // Imprimir valores

        // Conversão de valores (Casting)
        // Conversão de primitivos
        float valorFloat;
        double valorDouble=1.41;
        valorFloat=(float)valorDouble; // Casting

        // Conversão de referência
        String numero ="1";
        //int numeroConvertido = Integer.parseInt(numero);

        System.out.println(valorFloat);
        //System.out.println(numeroConvertido);
        System.out.println(palavra.toUpperCase());

        // Entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDoUsuario = teclado.nextLine();
        char primeiraLetra = nomeDoUsuario.charAt(0); // Captura primeiro caracter da String

        System.out.println("Idade: ");
        int idadeDoUsuario = teclado.nextInt();
        teclado.nextLine(); // Limpeza do buffer
        System.out.println("CPF: ");
        String cpfDoUsuario = teclado.nextLine();
        System.out.println("Salário: ");
        double salarioDoUsuario = teclado.nextDouble();
        teclado.nextLine(); // Limpeza do buffer
        // Controle de fluxo
        if(idadeDoUsuario>=18 && idadeDoUsuario<=100)
            System.out.println("Tá podendo entrar na festa");
        else
            System.out.println("Deu ruim, não pode entrar na festa !!");

        // Estruturas de repetição
        while(idadeDoUsuario<18){
            idadeDoUsuario = idadeDoUsuario+1;
        }

        for (int i = 0; i < 18; i++) {
            System.out.println("Valor do contador "+i);
        }

        System.out.println("Bem vindo ao sistema");
        System.out.println("Digite A - Ótima B - Boa C - Razoável D - Ruim");
        String notaDoAluno = teclado.nextLine();
        char nota = notaDoAluno.charAt(0);

        switch (nota){
            case 'A':
                System.out.println("Excelente nota !!! ");
                break;
            case 'B':
                System.out.println("Boa nota !!! ");
                break;
            case 'C':
                System.out.println("Nota razoável !!! ");
                break;
            case 'D':
                System.out.println("Deu ruim =( !!! ");
                break;
            default:
                System.out.println("Não entendi a sua entrada");
                break;
        }
        // Imprimindo dados
        System.out.println("Oi eu sou "+nomeDoUsuario+" tenho "+ idadeDoUsuario+" e ganho "+salarioDoUsuario+"R$");
        System.out.println("Primeira letra do nome: "+primeiraLetra);
    }
}