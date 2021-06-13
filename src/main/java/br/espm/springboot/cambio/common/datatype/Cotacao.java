package br.espm.springboot.cambio.common.datatype;

import java.util.Date;

public class Cotacao {

    private String id;
    private Moeda moeda;
    private double valor;
    private Date data;

    // Get
    public String getId(){
        return id;
    }

    public Moeda getMoeda(){
        return moeda;
    }

    public double getValor(){
        return valor;
    }

    public Date getData(){
        return data;
    }

    // Set
    public void setId(String id){
        this.id = id;
    }

    public void setMoeda(Moeda moeda){
        this.moeda = moeda;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setData(Date data){
        this.data = data;
    }
    
}
