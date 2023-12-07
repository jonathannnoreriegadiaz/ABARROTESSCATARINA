/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import static GUIS.Logín.txtuser;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JONATHAN
 */
public class LogínTest {
    
    public LogínTest() {
    }

    //@Test
//    public void testAsiganrUsuario() {
//        System.out.println("AsiganrUsuario");
//        Logín instance = new Logín();
//        String expResult = "";
//        String usuario="";
//        String sqlperfil="";
//    sqlperfil="select cargo from usuarios us inner join cargos cg on "
//            + "us.id_cargo=cg.id_cargo where us.usuario='"+txtuser.getText()+"'";
//    
//        String result = instance.AsiganrUsuario();
//        assertEquals(expResult, result);
//       
//    }

    @Test
    public void testPermisoUsuario() {
        System.out.println("PermisoUsuario");
        Logín instance = new Logín();
        instance.PermisoUsuario();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Logín.main(args);
        
    }
    
}
