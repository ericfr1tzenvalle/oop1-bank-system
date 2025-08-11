package org.contaBancaria.view;

import org.contaBancaria.model.Conta;

import java.sql.SQLOutput;
import java.util.List;
import org.contaBancaria.model.ContaCorrente;

public class LoginView {


    public void mostrarOpcoes(){
        System.out.println("[1] Entrar na conta");
        System.out.println("[2] Criar conta");
        System.out.println("[0] Sair");
        System.out.print("Digite a opção desejada: ");
    }
    
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
    public void mostrarMensagem(String mensagem){
        System.out.println("["+mensagem+"]");
    }

    public void mostrarContasUsuario(List<Conta> contasUsuario) {
        int i = 1;
        for(Conta c: contasUsuario){
            System.out.println("["+ i++  + "]: " + c.toString());
        }
        System.out.print("Deseja acessar qual conta: ");
    }
}
