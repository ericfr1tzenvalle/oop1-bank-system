package org.contaBancaria.view;

import org.contaBancaria.model.Conta;

import java.sql.SQLOutput;
import java.util.List;

public class LoginView {


    public void mostrarOpcoes(){
        System.out.println("[1] Entrar na conta");
        System.out.println("[2] Criar conta");
        System.out.println("[0] Sair");
        System.out.print("Digite a opção desejada: ");
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
