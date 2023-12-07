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
public class GANANCIASTest {
    
    public GANANCIASTest() {
    }

    @Test
    public void testMostrarVentas() {
        System.out.println("MostrarVentas");
        GANANCIAS instance = new GANANCIAS();
        instance.MostrarVentas();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GANANCIAS.main(args);
        
    }
    
}
