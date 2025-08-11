package org.contaBancaria.controller;

import java.util.Scanner;
import org.contaBancaria.model.Banco;
import org.contaBancaria.model.Conta;
import org.contaBancaria.model.ContaCorrente;
import org.contaBancaria.view.ContaView;

public class ContaController {
    ContaView view;
    
    public ContaController(){
        this.view = new ContaView();
    }
    
    
    
     private void entrarContaCorrente(Banco banco, Conta conta, Scanner sc) {
        ContaCorrente cc = (ContaCorrente) conta;
        int opcao = -1;
        
        while(opcao != 0){
            view.mostrarOpcoesContaCorrente(cc);
            
        }
        
    }


}
