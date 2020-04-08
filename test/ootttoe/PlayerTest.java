/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ootttoe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gioel
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of GetMarker method, of class Player.
     */
    @Test
    public void testGetMarker() {
        System.out.println("GetMarker");
        Player instance = new Player("X");
        String expResult = "X";
        String result = instance.GetMarker();
        assertEquals(expResult, result);       
    }

    /**
     * Test of GetMove method, of class Player.
     */
    @Test
    public void testGetMove() {
        System.out.println("GetMove");
        Player instance = new Player("X");
        int expResult = 0;
        int result = instance.GetMove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
