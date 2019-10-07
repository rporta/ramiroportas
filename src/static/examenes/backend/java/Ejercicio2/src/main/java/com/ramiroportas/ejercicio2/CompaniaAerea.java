/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramiroportas.ejercicio2;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ramiro
 */
public class CompaniaAerea {
    
    private static Transportes Transportes;
    private static Integer au = 0;
    private Integer id;
    private String nombre;
    private ArrayList<Paquete> paquete = new ArrayList<Paquete>();
    
    public CompaniaAerea(String nombre) {
        CompaniaAerea.au++;
        this.id = CompaniaAerea.au;
        this.nombre = nombre;
        System.out.println("CompaniaAerea id : " + this.id);
    }
    
    public void recibirPaquete(Paquete P){
        this.paquete.add(P);
    }
    
    public void transportarPaquete(String fecha, Integer valor){
        if(!this.paquete.isEmpty()){
            Paquete p = this.paquete.get(0);
            
            p.setFecha(fecha);
            p.setValor(valor);
            
            Transportes.transporteRealizado(p.getId(), this.id, fecha, valor, p.getMoneda(), p.getClientId());
            
            
            System.out.println("transportarPaquete id : " + p.getId());
            System.out.println("transportarPaquete clientId : " + p.getClientId());
            System.out.println("transportarPaquete CompaniaAereaId : " + this.id);
            System.out.println("transportarPaquete, paquete transportado");
            this.paquete.remove(p);   
        }else{
            System.out.println("No se pudo realizar la operacion, porque la cantidad de paquetes es de : " + this.paquete.size());
        }       
    }
    
    public void reporteTotalPaquetesTransportados(String dia){
        if(!Transportes.fecha.isEmpty()){
            Iterator <String> p = Transportes.fecha.iterator();
            
            Integer index = 0;
            Integer TotalPaquetesTransportados = 0;
            Integer TotalPaquetesRecaudados = 0;
            System.out.println("reporteTotalPaquetesTransportados fecha : " + dia);
            System.out.println("CompaniaAereaID | ClienteID | PaqueteID | Valor | Moneda");
            while(p.hasNext()){
                String fechaFullTransportes = p.next();
                String [] fechaSplit = fechaFullTransportes.split(" ");
                String fecha = fechaSplit[0];
                
                if(fecha.equals(dia)){
                    System.out.println(this.id + "|" + Transportes.idCliente.get(index) + "|" + Transportes.idPaquete.get(index) + "|" + Transportes.moneda.get(index) + "|" + Transportes.valor.get(index));
                    TotalPaquetesRecaudados += Transportes.valor.get(index);
                    TotalPaquetesTransportados++;                
                }               
                index++;
            }
            System.out.println("Total de paquetes recaudado : " + TotalPaquetesRecaudados);          
            System.out.println("Total de paquetes transportados : " + TotalPaquetesTransportados);          
            
        }else{
            System.out.println("No se pudo realizar la operacion");
        }
    }
    
    public Integer getId(){
        return this.id;
    }    

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public static class Transportes {
        
        public static ArrayList<String> moneda = new ArrayList<String>();
        public static ArrayList<Integer> idCliente = new ArrayList<Integer>();
        public static ArrayList<Integer> idPaquete = new ArrayList<Integer>();
        public static ArrayList<Integer> idCompaniaAerea = new ArrayList<Integer>();
        public static ArrayList<String> fecha = new ArrayList<String>();
        public static ArrayList<Integer> valor = new ArrayList<Integer>();
        
        public static void transporteRealizado(Integer idPaquete, Integer idCompaniaAerea, String fecha, Integer valor, String moneda, Integer clientID){
            Transportes.idPaquete.add(idPaquete);
            Transportes.idCompaniaAerea.add(idCompaniaAerea);
            Transportes.fecha.add(fecha);
            Transportes.valor.add(valor);
            Transportes.moneda.add(moneda);
            Transportes.idCliente.add(clientID);
        }
        
        public static ArrayList getIdPaquete(){
            return Transportes.idPaquete;
        }
        
        public static ArrayList getIdCompaniaAerea(){
            return Transportes.idCompaniaAerea;
        }
        
        public static ArrayList getFecha(){
            return Transportes.fecha;
        }
    }        
}
