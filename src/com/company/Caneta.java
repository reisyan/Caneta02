package com.company;

import java.time.format.SignStyle;

public class Caneta { // classe sempre com letra Maiúscula//
    public String modelo; //atributo começa com letra minúscula//
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status() { //metodos letra minuscula e () no final//
        System.out.println(" modelo " + this.modelo);
        System.out.println(" uma caneta " + this.cor);
        System.out.println(" ponta " + this.ponta);
        System.out.println(" carga " + this.carga);
        System.out.println(" está tampada " + this.tampada);

    }
    protected void rabiscar() {
        if (this.tampada == true) {
            System.out.println(" Erro! Nao posso rabiscar");
        } else {
            System.out.println(" Estou Rabiscando");
        }

    }

    public void tampar(){
    this.tampada = true;
    }

     public void destampar() {this.tampada = false; }

}
