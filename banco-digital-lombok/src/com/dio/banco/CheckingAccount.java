package com.dio.banco;

public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void extractAccount() {
        System.out.println("\n*** Extrato Conta Corrente ***\n");
        super.extractContent();
    }
}
