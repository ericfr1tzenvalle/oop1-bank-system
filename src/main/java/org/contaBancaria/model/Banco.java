package org.contaBancaria.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }
    public List<Conta> getContas(){
        return contas;
    }
}
