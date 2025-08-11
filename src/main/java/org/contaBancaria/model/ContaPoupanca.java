package org.contaBancaria.model;

import org.contaBancaria.model.enums.TipoConta;

public class ContaPoupanca extends Conta{
    private TipoConta tipo;


    public ContaPoupanca(String nome,String cpf, String senha){
        super(nome,cpf, senha);
        this.tipo = TipoConta.POUPANÇA;
    }
    
    public TipoConta getTipo(){
        return tipo;
    }

    @Override
    public boolean sacar(double valor) {
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
        
    }

    public void aplicarRendimento(double selicAnual){
        double taxaMensal;
        
        if(selicAnual > 8.5){
            taxaMensal = 0.005;
        }else{
            taxaMensal = (0.70 * (selicAnual / 100)) / 12;
        }
        this.setSaldo(this.getSaldo() * taxaMensal);
    }
    
    @Override
    public String toString(){
        return this.geraNumeroDaConta() + "| " + getTipo().name();
    }
}
