/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import javax.swing.table.DefaultTableModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JONATHAN
 */
public class FRM_CONSULTA_VENTASTest {
    
    public FRM_CONSULTA_VENTASTest() {
    }

    @Test
    public void testMostrarenDetalle() {
        System.out.println("MostrarenDetalle");
        FRM_CONSULTA_VENTAS instance = new FRM_CONSULTA_VENTAS();
        instance.MostrarenDetalle();
       
    }

    @Test
    public void testLlenarTablaDetalle() {
        System.out.println("LlenarTablaDetalle");
        FRM_CONSULTA_VENTAS instance = new FRM_CONSULTA_VENTAS();
        instance.LlenarTablaDetalle();
        
    }

    @Test
    public void testCalcularGanancia() {
        System.out.println("CalcularGanancia");
        FRM_CONSULTA_VENTAS instance = new FRM_CONSULTA_VENTAS();
        instance.CalcularGanancia();
        
    }

    @Test
    public void testCargarComboEmpleado() {
        System.out.println("CargarComboEmpleado");
        FRM_CONSULTA_VENTAS instance = new FRM_CONSULTA_VENTAS();
        instance.CargarComboEmpleado();
        
    }

    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        DefaultTableModel model = null;
        FRM_CONSULTA_VENTAS instance = new FRM_CONSULTA_VENTAS();
        instance.Limpiar(model);
        
    }

    @Test
    public void testLlenarTabla() {
        System.out.println("LlenarTabla");
        String sql = "";
        FRM_CONSULTA_VENTAS instance = new FRM_CONSULTA_VENTAS();
        instance.LlenarTabla(sql);
       
    }

    @Test
    public void testCalcularTotal() {
        System.out.println("CalcularTotal");
        FRM_CONSULTA_VENTAS instance = new FRM_CONSULTA_VENTAS();
        instance.CalcularTotal();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FRM_CONSULTA_VENTAS.main(args);
        
    }
    
}
