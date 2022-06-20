/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tiendaVideoJuegos.Controller;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.ui.Model;

/**
 *
 * @author steve
 */
public class indexControllerTest {
    
  

    /**
     * Test of inicio method, of class indexController.
     */
    @Test
    public void testInicio() {
        System.out.println("inicio");
        Model model = null;
        indexController instance = new indexController();
        String expResult = "";
        String result = instance.inicio(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
