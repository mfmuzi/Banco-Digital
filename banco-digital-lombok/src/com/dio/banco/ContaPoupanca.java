package com.dio.banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extratoConta() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.conteudoExtrato();
    }


}
