package br.inatel.lab.excecoes;

public class SemSaldoException extends Exception{
    public SemSaldoException(String message,float valorSaque) {
        super(message);
        System.out.println("Valor do saque: "+valorSaque);
    }
}
