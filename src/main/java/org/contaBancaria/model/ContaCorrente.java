package org.contaBancaria.model;

public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(String nome,String cpf, String senha, double limiteChequeEspecial){
        super(nome,cpf, senha);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
       if(valor <= 0){
           System.out.println("Saldo insuficiente");
       }
       double saldoTotal = this.getSaldo() + limiteChequeEspecial;
       if(this.getSaldo() >= valor){
           this.setSaldo(this.getSaldo() - valor);
           System.out.println("Saque realizado com sucesso");
           return;
       }
       if(saldoTotal >= valor){
           double valorRestante = valor - this.getSaldo();
           this.setSaldo(0);
           this.limiteChequeEspecial -= valorRestante;
       }else{
           System.out.println("Saldo insuficiente");
       }


    }
    @Override
    public String toString(){

    }
}
