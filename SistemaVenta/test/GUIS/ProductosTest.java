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
public class ProductosTest {
    
    public ProductosTest() {
    }

    @Test
    public void testRecibirDatos() {
        System.out.println("RecibirDatos");
        Productos instance = new Productos(new javax.swing.JFrame(), true);
        instance.RecibirDatos();
        
    }

    @Test
    public void testSelection() {
        System.out.println("selection");
        Productos instance = new Productos(new javax.swing.JFrame(), true);
        instance.selection();
       
    }

    @Test
    public void testReiniciar() {
        System.out.println("Reiniciar");
        Productos instance = new Productos(new javax.swing.JFrame(), true);
        instance.Reiniciar();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Productos.main(args);
        
    }
    
}
