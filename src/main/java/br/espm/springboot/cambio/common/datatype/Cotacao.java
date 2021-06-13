package br.espm.springboot.cambio.common.datatype;

import java.math.BigDecimal;
import java.util.Date;

public class Cotacao {

    private String id;
    private Moeda moeda;
    private BigDecimal valor;
    private Date data;

    // Get
    public String getId(){
        return id;
    }

    public Moeda getMoeda(){
        return moeda;
    }

    public BigDecimal getValor(){
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

    public void setValor(BigDecimal valor){
        this.valor = valor;
    }

    public void setData(Date data){
        this.data = data;
    }
    
}
