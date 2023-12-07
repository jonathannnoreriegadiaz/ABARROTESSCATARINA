/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import Controlador.Controlador;
import static GUIS.Empleados.combocargo;
import static GUIS.Empleados.combogenero;
import static GUIS.Empleados.txtapellidos;
import static GUIS.Empleados.txtcodigo;
import static GUIS.Empleados.txtcorreo;
import static GUIS.Empleados.txtdireccion;
import static GUIS.Empleados.txtdni;
import static GUIS.Empleados.txtnombres;
import static GUIS.Empleados.txttelefono;
import javax.swing.JOptionPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JONATHAN
 */
public class EmpleadosTest {
    
    public EmpleadosTest() {
    }

    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        Empleados instance = new Empleados(new javax.swing.JFrame(), true);
        instance.Registrar();
        
    }

    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        Empleados instance = new Empleados(new javax.swing.JFrame(), true);
        instance.Limpiar();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Empleados.main(args);
      
    }
    
}
