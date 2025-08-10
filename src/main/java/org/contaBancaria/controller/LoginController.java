package org.contaBancaria.controller;

import org.contaBancaria.model.Banco;
import org.contaBancaria.model.Conta;
import org.contaBancaria.model.Validador;
import org.contaBancaria.view.LoginView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginController {
    LoginView view;
    public LoginController() {
        this.view = new LoginView();
    }


    public void iniciar(Banco banco, Scanner sc) {
        int opcao = -1;
        while(opcao == -1){
            view.mostrarOpcoes();
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    Conta conta = processoEntrarConta(banco, sc);
                    if(conta == null){
                        break;
                    }
                    entrarConta(banco,conta, sc);






            }
        }



    }

    public Conta processoEntrarConta(Banco banco, Scanner sc){
        System.out.println("> Digite o CPF:");
        String cpf = sc.nextLine();
        String senha = "";

        if(Validador.verificaCpf(cpf)){
            System.out.println("> Senha Eletrônica:");
            senha = sc.nextLine();
        }else{
            view.mostrarMensagem("CPF invalido");
            return null;
        }
        Conta conta = Validador.verificaSenhaConta(banco,cpf,senha);
        if(conta == null){
            view.mostrarMensagem("Senha Invalida / Conta Invalida");
        }
        return conta;
    }

    public void entrarConta(Banco banco,Conta conta, Scanner sc){
        List<Conta> contasUsuario = new ArrayList<>();
        for(Conta c: banco.getContas()){
            if(c.getCpf().equals(conta.getCpf())){
                contasUsuario.add(c);
            }
        }
        view.mostrarMensagem("Entrando no sistema...");
        view.mostrarContasUsuario(contasUsuario);
        int escolhaConta = sc.nextInt();
        while(escolhaConta <= 0 || escolhaConta > contasUsuario.size()){
            System.out.println("Conta inválida!");
            escolhaConta = sc.nextInt();
        }

    }



}
