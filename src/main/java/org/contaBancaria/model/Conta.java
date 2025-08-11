package org.contaBancaria.model;

import java.util.Random;
import org.contaBancaria.model.enums.TipoConta;

public abstract class Conta {
    private final String cpf;
    private String numeroDaConta;
    private double saldo;
    private String senha;
    private String nome;
    

    public Conta(String nome,String cpf,String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDaConta = geraNumeroDaConta();
        this.senha = senha;
        this.saldo = 0;
        
    }
    
    

    public String getCpf() {
        return cpf;
    }
    //Simular um número de conta.
    public String geraNumeroDaConta(){
        Random random = new Random();
        StringBuilder numeroConta = new StringBuilder();
        for(int i = 0; i < 8; i++){
            numeroConta.append(String.valueOf(random.nextInt(10)));
        }
        return numeroConta.toString();

    }
    
    public String getNome(){
        return nome;
    }




    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if(saldo<0){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo = saldo;
    }
    public String getSenha(){
        return senha;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public abstract boolean sacar(double valor);
    @Override
    public String toString() {
        return "Titular: " + cpf + " Numero da Conta: " + numeroDaConta + " Saldo: " + saldo;
    }



}
