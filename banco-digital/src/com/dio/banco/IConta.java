package com.dio.banco;

public interface IConta {

     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor, Conta contaDestino);

     void pagarBoleto(double valor);

     void extratoConta ();
}
