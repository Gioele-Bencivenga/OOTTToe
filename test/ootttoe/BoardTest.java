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
public class BoardTest {
    
    public BoardTest() {
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
     * Test of SubmitMove method, of class Board.
     */
    @Test
    public void testSubmitMove() {
        System.out.println("SubmitMove");
        String _marker = "X";
        int _slot = 0;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.SubmitMove(_marker, _slot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of IsWinner method, of class Board.
     */
    @Test
    public void testIsWinner() {
        System.out.println("IsWinner");
        String _marker = "";
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.IsWinner(_marker);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of PrintBoard method, of class Board.
     */
    @Test
    public void testPrintBoard() {
        System.out.println("PrintBoard");
        Board instance = new Board();
        instance.PrintBoard();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
