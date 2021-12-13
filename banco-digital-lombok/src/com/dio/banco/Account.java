package com.dio.banco;

import lombok.Data;

@Data
public abstract class Account implements IConta{

    protected int agancy;
    protected int number;
    protected double balance;
    protected double bill;
    protected Client client;

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;


    public Account(Client client){
        this.agancy = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
    }


    @Override
    public void withdraw(double value) {
        this.balance = balance - value;
    }

    @Override
    public void deposit(double value) {
        this.balance = balance + value;
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    @Override
    public void payBill(double value) {
        this.balance = balance - value;
        this.bill = bill - value;
    }

    protected void extractContent() {
        System.out.printf("Titular: %s %s%n", this.client.getFirstName(),this.client.getLastName());
        System.out.printf("CPF: %s%n", this.client.getCpf());
        System.out.printf("Agência: %d%n", this.agancy);
        System.out.printf("Número da Conta: %d%n", this.number);
        System.out.printf("Saldo: %.2f%n", this.balance);
        if(bill != 0.0)System.out.printf("Boleto: %.2f%n", this.bill);

    }
}
