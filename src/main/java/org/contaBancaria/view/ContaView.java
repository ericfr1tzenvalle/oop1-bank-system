/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.contaBancaria.view;

import org.contaBancaria.model.Banco;
import org.contaBancaria.model.ContaCorrente;

/**
 *
 * @author Luísa
 */
public class ContaView {
    
    
    
     public void mostrarOpcoesContaCorrente(ContaCorrente c){
        System.out.println("> Bem vindo : " + c.getNome());
        System.out.println("\n=== Conta Corrente ===");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Transferir");
        System.out.println("5. Consultar limite");
        System.out.println("0. Sair");
        System.out.print("> ");
        
    }

    public void consultarSaldo(ContaCorrente cc) {
        System.out.println("Saldo: R$" + cc.getSaldo());
    }
    
    public void mostrarOpcoesSaque(ContaCorrente cc){
        System.out.println("======= Saque ========");
        System.out.println("Saldo atual: R$" + cc.getSaldo());
        System.out.println("SAQUE [1]   CANCELAR [0]");;
    }
    
}
