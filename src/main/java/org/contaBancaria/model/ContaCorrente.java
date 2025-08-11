package org.contaBancaria.model;

import org.contaBancaria.model.enums.TipoConta;

public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;
    private TipoConta tipo;

    public ContaCorrente(String nome,String cpf, String senha, double limiteChequeEspecial){
        super(nome,cpf, senha);
        this.tipo = TipoConta.CORRENTE;
        this.limiteChequeEspecial = limiteChequeEspecial;
        
    }
    
    public TipoConta getTipo(){
        return tipo;
    }

    @Override
    public boolean sacar(double valor) {
       if(valor <= 0){
           System.out.println("Saldo insuficiente");
           return false;
       }
       double saldoTotal = this.getSaldo() + limiteChequeEspecial;
       if(this.getSaldo() >= valor){
           this.setSaldo(this.getSaldo() - valor);
           System.out.println("Saque realizado com sucesso");
           return true;
       }
       if(saldoTotal >= valor){
           double valorRestante = valor - this.getSaldo();
           this.setSaldo(0);
           this.limiteChequeEspecial -= valorRestante;
           return true;
       }else{
           System.out.println("Saldo insuficiente");
           return false;
       }


    }
    @Override
    public String toString(){
        return this.geraNumeroDaConta() + "| " + getTipo().name();  

    }

   
}
