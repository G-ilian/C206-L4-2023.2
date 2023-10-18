package br.inatel.lab.excecoes.Modelos;

import br.inatel.lab.excecoes.SemSaldoException;

import java.math.BigDecimal;

public class Conta {
    // Atributos da conta
    private float saldo;
    private String nome;

    public Conta(float saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public void sacar(float valorSaque)  {
        try{
            if(valorSaque>saldo){
                throw new SemSaldoException("Saldo insuficiente na conta !!",valorSaque);
            }else{
                saldo = saldo - valorSaque;
                System.out.println("Valor após saque: "+this.saldo);
            }
        }catch (SemSaldoException semSaldoException){
            System.out.println("");
        }

    }

}
