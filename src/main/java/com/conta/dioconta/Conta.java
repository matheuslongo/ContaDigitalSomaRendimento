package com.conta.dioconta;

public abstract class Conta implements Iconta {
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1 ;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected double rendimento;

    public  Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente= cliente;
    }

        @Override
    public void sacar(double valor) {
        this.saldo -=  valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Iconta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public void investir(double valor){
        rendimento = saldo * 0.15;
    }

    protected void imprimirSaldo() {
        System.out.println("Cliente:  " + this.cliente.getNome());
        System.out.println("Rendimento de Investimento:  " + this.rendimento);
        System.out.println("Agencia:  " + this.agencia);
        System.out.println("Numero:  " + this.numero);
        System.out.println("Saldo:  " + this.saldo);
        System.out.println("Saldo após investimento: " + (rendimento + saldo));
    }



        public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
