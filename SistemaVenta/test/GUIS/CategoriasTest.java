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
public class CategoriasTest {
    
    public CategoriasTest() {
    }

    @Test
    public void testInicio() {
        System.out.println("Inicio");
        Categorias instance = new Categorias(new javax.swing.JFrame(), true);
        instance.Inicio();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Categorias.main(args);
        
    }
    
}
