package com.dio.banco;

public interface IConta {

     void withdraw(double valor);

     void deposit(double valor);

     void transfer(double valor, Account destinationAccount);

     void payBill(double valor);

     void extractAccount();
}
