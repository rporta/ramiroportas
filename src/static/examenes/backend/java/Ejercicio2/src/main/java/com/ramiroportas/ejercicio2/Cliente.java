/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramiroportas.ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author ramiro
 */
public class Cliente {
    
    private static Integer au = 0;
    private Integer id;
    private String nombre;
    private ArrayList<Paquete> paquete = new ArrayList<Paquete>();
   
    public Cliente(String nombre){
        Cliente.au++;
        this.id = Cliente.au;
        this.nombre = nombre;
        
        System.out.println("Cliente id : " + this.id);
    }
    
    public void generarPaquete(String origen, String destino){
        Paquete p = new Paquete(this.id, origen, destino);
        
        System.out.println("generarPaquete Paquete id : " + p.getId());
        System.out.println("generarPaquete Paquete clientId : " + p.getClientId());
        
        this.paquete.add(p);
    }
    
    public void generarPaquete(){
        Paquete p = new Paquete(this.id);
        this.paquete.add(p);
        System.out.println("generarPaquete Paquete id : " + p.getId());
        System.out.println("generarPaquete Paquete clientId : " + p.getClientId());        
    }
    
    public void enviarPaquete(CompaniaAerea c){
        if(!this.paquete.isEmpty()){
            Paquete p = this.paquete.get(0);
            System.out.println("enviarPaquete Paquete id : " + p.getId());
            System.out.println("enviarPaquete Paquete clientId : " + p.getClientId());
            System.out.println("enviarPaquete CompaniaAerea id : " + c.getId());                           
  
            c.recibirPaquete(p);
            this.paquete.remove(p);            
            p = null;
        }
    }

    public Integer getId(){
        return this.id;
    }
}
