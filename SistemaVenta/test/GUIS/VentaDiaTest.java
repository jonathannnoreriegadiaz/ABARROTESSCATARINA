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
public class VentaDiaTest {
    
    public VentaDiaTest() {
    }

    @Test
    public void testMostrarVentas() {
        System.out.println("MostrarVentas");
        VentaDia instance = new VentaDia();
        instance.MostrarVentas();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VentaDia.main(args);
       
    }
    
}
