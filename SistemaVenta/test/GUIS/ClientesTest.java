/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import Controlador.Controlador;
import static GUIS.Clientes.combogenero;
import static GUIS.Clientes.txtapellidos;
import static GUIS.Clientes.txtdireccion;
import static GUIS.Clientes.txtdni;
import static GUIS.Clientes.txtnombres;
import static GUIS.Clientes.txtruc;
import static GUIS.Clientes.txttelefono;
import javax.swing.JOptionPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JONATHAN
 */
public class ClientesTest {
    
    public ClientesTest() {
    }
int x,y;Controlador control=new Controlador();
    

    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        Clientes instance = new Clientes(new javax.swing.JFrame(), true);
        instance.Limpiar();
       
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Clientes.main(args);
        
    }
    
}
