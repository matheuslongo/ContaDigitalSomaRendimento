package com.conta.dioconta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {

    public static void main(String[] args) {
        Cliente matheus = new Cliente();
         matheus.setNome("Matheus");


         Conta poupanca= new ContaPoupanca(matheus);
         Conta cc = new ContaCorrente(matheus);

         cc.depositar(1000);
         cc.transferir(50,poupanca);
         cc.investir(100);

         cc.imprimir();
         poupanca.imprimir();
    }
}