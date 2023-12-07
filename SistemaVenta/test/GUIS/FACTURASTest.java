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
public class FACTURASTest {
    
    public FACTURASTest() {
    }

    @Test
    public void testMostrarFacturasEmitidas() {
        System.out.println("MostrarFacturasEmitidas");
        FACTURAS instance = new FACTURAS(new javax.swing.JFrame(), true);
        instance.MostrarFacturasEmitidas();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FACTURAS.main(args);
        
    }
    
}
