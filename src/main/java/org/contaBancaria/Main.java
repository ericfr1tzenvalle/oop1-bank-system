package org.contaBancaria;

import org.contaBancaria.controller.LoginController;
import org.contaBancaria.model.Banco;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opcao = -1;
        Banco banco = new Banco("Nubank");
        Scanner sc = new Scanner(System.in);
        LoginController lc = new LoginController();

        while (opcao != 0) {
            System.out.println("===================");
            System.out.println("[1] Entrar no banco");
            System.out.println("[2] Sair");
            System.out.print("Digite opcao: ");
            opcao =  sc.nextInt();
            switch (opcao) {
                case 1:
                    lc.iniciar(banco, sc);
                    break;
                case 2:
                    System.out.println("Saindo....");
                    opcao = 0;
                    break;

            }
        }

    }
}