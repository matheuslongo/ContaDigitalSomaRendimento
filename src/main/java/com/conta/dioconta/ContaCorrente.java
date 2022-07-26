package com.conta.dioconta;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir() {
        System.out.println("=====EXTRATO CONTA CORRENTE=====");
        super.imprimirSaldo();

    }


}


