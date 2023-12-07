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
public class VentasTest {
    
    public VentasTest() {
    }

    @Test
    public void testMostrarProductoVenta() {
        System.out.println("MostrarProductoVenta");
        Ventas instance = new Ventas(new javax.swing.JFrame(), true);
        
        instance.MostrarProductoVenta();
        
    }

    @Test
    public void testReiniciar() {
        System.out.println("Reiniciar");
        Ventas instance = new Ventas(new javax.swing.JFrame(), true);
        instance.Reiniciar();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ventas.main(args);
       
    }
    
}
