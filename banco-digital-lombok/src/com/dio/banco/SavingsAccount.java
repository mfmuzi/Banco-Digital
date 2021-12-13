package com.dio.banco;

public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void extractAccount() {
        System.out.println("\n*** Extrato Conta Poupança ***\n");
        super.extractContent();
    }


}
