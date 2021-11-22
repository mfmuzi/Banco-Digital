package com.dio.banco;

import lombok.Data;

@Data
public abstract class Conta implements IConta{

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double boleto;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void pagarBoleto(double valor) {
        this.saldo = saldo - valor;
    }

    protected void conteudoExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Boleto: %.2f", this.boleto));

    }
}
