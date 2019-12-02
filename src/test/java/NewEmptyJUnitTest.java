/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Financiera.Financiera;
import dominio.Credito;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Franco-PC
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void loginConUsuarioYContraseñaValidos() {
        Boolean b = Financiera.login("juan","juan");
        assertTrue(b);
    }
    
    @Test
    public void loginConUsuarioYContraseñaInValidos() {
        Boolean b = Financiera.login("pedro","1234");
        assertFalse(b);
    }
    
    @Test
    public void creditoCalculoDeTotalAdelantado(){
        Credito cred = new Credito(5000);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
