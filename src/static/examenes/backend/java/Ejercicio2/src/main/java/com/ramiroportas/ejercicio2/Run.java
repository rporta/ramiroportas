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
public class Run {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando CompaniaAerea & Cliente ...
        
        CompaniaAerea CompaniaAerea1 = new CompaniaAerea("CompaniaAerea1");
        
        Cliente ClienteJuan = new Cliente("Juan");
        Cliente ClientePepe = new Cliente("Pepe");
        Cliente ClientePedro = new Cliente("Pedro");
        Cliente ClienteHector = new Cliente("Hector");
        Cliente ClienteGranKan = new Cliente("GranKan");
        Cliente ClienteBatman = new Cliente("Batman");
        Cliente ClienteSuperman = new Cliente("Superman");
        
        // Generando Paquete ...
        
        ClienteJuan.generarPaquete("Brasil", "Japon");
        ClienteJuan.generarPaquete();
        ClienteJuan.generarPaquete();
        ClientePepe.generarPaquete("Rusia", "Ecuador");
        ClientePepe.generarPaquete();
        ClientePepe.generarPaquete();
        ClientePedro.generarPaquete("Colombia", "Madagascar");
        ClientePedro.generarPaquete();
        ClientePedro.generarPaquete();
        ClienteHector.generarPaquete("Paraguay", "Sierra Leona");
        ClienteHector.generarPaquete();
        ClienteHector.generarPaquete();
        ClienteGranKan.generarPaquete("Costa de Marfil", "Nigeria");
        ClienteGranKan.generarPaquete();
        ClienteGranKan.generarPaquete();
        ClienteBatman.generarPaquete("Egipto", "Liberia");
        ClienteBatman.generarPaquete();
        ClienteBatman.generarPaquete();
        ClienteSuperman.generarPaquete("Comoras", "Nicaragua");
        ClienteSuperman.generarPaquete();
        ClienteSuperman.generarPaquete();
        
        // Enviando Paquete a CompaniaAerea...
        
        ClienteJuan.enviarPaquete(CompaniaAerea1);
        ClienteJuan.enviarPaquete(CompaniaAerea1);
        ClienteJuan.enviarPaquete(CompaniaAerea1);
        ClientePepe.enviarPaquete(CompaniaAerea1);
        ClientePepe.enviarPaquete(CompaniaAerea1);
        ClientePepe.enviarPaquete(CompaniaAerea1);
        ClientePedro.enviarPaquete(CompaniaAerea1);
        ClientePedro.enviarPaquete(CompaniaAerea1);
        ClientePedro.enviarPaquete(CompaniaAerea1);
        ClienteHector.enviarPaquete(CompaniaAerea1);
        ClienteHector.enviarPaquete(CompaniaAerea1);
        ClienteHector.enviarPaquete(CompaniaAerea1);
        ClienteGranKan.enviarPaquete(CompaniaAerea1);
        ClienteGranKan.enviarPaquete(CompaniaAerea1);
        ClienteGranKan.enviarPaquete(CompaniaAerea1);
        ClienteBatman.enviarPaquete(CompaniaAerea1);
        ClienteBatman.enviarPaquete(CompaniaAerea1);
        ClienteBatman.enviarPaquete(CompaniaAerea1);
        ClienteSuperman.enviarPaquete(CompaniaAerea1);
        ClienteSuperman.enviarPaquete(CompaniaAerea1);
        ClienteSuperman.enviarPaquete(CompaniaAerea1);
        
        // Transportar paquetes revisar ... 
        
        CompaniaAerea1.transportarPaquete("2019-10-06 01:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-06 01:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-06 00:01:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-06 00:00:01", 10);
        CompaniaAerea1.transportarPaquete("2019-10-06 02:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-08 00:02:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-08 00:00:02", 10);
        CompaniaAerea1.transportarPaquete("2019-10-08 03:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-08 00:03:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-08 00:00:03", 10);
        CompaniaAerea1.transportarPaquete("2019-10-08 04:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:04:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:00:04", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 05:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:05:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:00:05", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 06:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:06:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:00:06", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 07:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:07:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:00:07", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 08:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:08:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-15 00:00:08", 10);
        CompaniaAerea1.transportarPaquete("2019-10-21 09:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-21 00:09:09", 10);
        CompaniaAerea1.transportarPaquete("2019-10-21 10:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-21 00:10:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-21 00:00:10", 10);
        CompaniaAerea1.transportarPaquete("2019-10-21 11:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-21 00:11:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-26 00:00:11", 10);
        CompaniaAerea1.transportarPaquete("2019-10-26 12:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-26 00:12:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-26 00:00:12", 10);
        CompaniaAerea1.transportarPaquete("2019-10-26 13:00:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-26 00:13:00", 10);
        CompaniaAerea1.transportarPaquete("2019-10-26 00:00:13", 10);

        // salida reporte
        
        CompaniaAerea1.reporteTotalPaquetesTransportados("2019-10-08");
        
    }
}
