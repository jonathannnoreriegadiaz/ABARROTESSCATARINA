/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JONATHAN
 */
public class ConsultaClientesTest {
    
    public ConsultaClientesTest() {
    }

    @Test
    public void testMostrarClientes() {
        System.out.println("MostrarClientes");
        ConsultaClientes instance = new ConsultaClientes(new javax.swing.JFrame(), true);
        instance.MostrarClientes();
      
    }

//    @Test
//    public void testMandarDatosClientes() {
//        System.out.println("MandarDatosClientes");
//        ConsultaClientes instance = new ConsultaClientes(new javax.swing.JFrame(), true);
//        
//        instance.MandarDatosClientes();
//        
//    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ConsultaClientes.main(args);
        
    }
    
}
