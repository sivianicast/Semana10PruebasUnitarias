/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aula
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setSexo method, of class Persona.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        char param = ' ';
        Persona instance = new Persona();
        instance.setSexo(param);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saludar method, of class Persona.
     */
    @Test
    public void testSaludar() {
        System.out.println("saludar");
        Persona instance = new Persona();
        String expResult = "Hola";
        String result = instance.saludar();
        assertEquals(expResult, result);
    }

    /**
     * Test of addDireccion method, of class Persona.
     */
    @Test
    public void testAddDireccion() throws Exception {
        System.out.println("addDireccion");
        
        Persona persona = new Persona();
        
        Persona.Direccion direccion = persona.getNewDireccion();
        direccion.provincia = Persona.Provincia.SanJose;
        direccion.canton = "central";
        
        persona.addDireccion(direccion);
        
        assertTrue(persona.exists(direccion));
    }
    
    @Test(expected=Exception.class)
    public void testAddDireccionDuplicada() throws Exception {
        System.out.println("addDireccionDuplicada");
        
        Persona persona = new Persona();
        
        Persona.Direccion direccion = persona.getNewDireccion();
        direccion.provincia = Persona.Provincia.SanJose;
        direccion.canton = "central";
        
        persona.addDireccion(direccion);
        persona.addDireccion(direccion);
        
    }
}
