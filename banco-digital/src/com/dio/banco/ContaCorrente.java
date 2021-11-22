package com.dio.banco;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extratoConta() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.conteudoExtrato();
    }
}
