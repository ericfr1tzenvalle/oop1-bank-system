package org.contaBancaria.model;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(String nome,String cpf, String senha){
        super(nome,cpf, senha);
    }

    @Override
    public void sacar(double valor) {
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
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
}
