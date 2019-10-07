/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramiroportas.ejercicio2;

/**
 *
 * @author ramiro
 */
public class Paquete {
    
    private static Integer au = 0;
    private Integer id;
    private Integer clientId;
    private String origen;
    private String destino;
    private Integer valor = 0;
    private String fecha;
    private String moneda;
    
    
    public Paquete(Integer clientId){
        this(clientId, "", "");
    }
    
    public Paquete(Integer clientId, String origen, String destino){
        
        Paquete.au++;
        this.id = Paquete.au;
        this.clientId = clientId;
        this.origen = origen;
        this.destino = destino;
        this.moneda = "USD";
    }
    
    public Paquete(Integer clientId, String moneda, Integer valor, String origen, String destino) {
        Paquete.au++;
        this.id = Paquete.au;
        this.clientId = clientId;
        this.origen = origen;
        this.destino = destino;
    }    
    
    public Integer getId(){
        return this.id;
    }
    
    public void setClientId(Integer o){
        this.clientId = o;
    }
    
    public Integer getClientId(){
        return this.clientId;
    }

    public void setOrigen(String o){
        this.origen = o;
    }
    
    public String getOrigen(){
        return this.origen;
    }
    
    public void setDestino(String d){
        this.destino = d;
    }
    
    public String getDestino(){
        return this.destino;
    }    
    
    public void setValor(Integer f){
        this.valor = f;
    }
    
    public Integer getValor(){
        return this.valor;
    }
    
    public void setFecha(String f){
        this.fecha = f;
    }
    
    public String getFecha(){
        return this.fecha;
    }
    
    public String getMoneda(){
        return this.moneda;
    }
    
    public void setMoneda(String m){
        this.moneda = m;
    }
}
