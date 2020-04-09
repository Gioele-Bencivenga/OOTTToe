/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ootttoe;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gioel
 */
public class Player {

    private String marker; // the player's sign (X or O)

    Scanner in = new Scanner(System.in);

    public Player(String _marker) {
        if (_marker != "X" && _marker != "O") {
            System.out.println("Player's marker is invalid, assigning X");
            marker = "X";
        } else {
            marker = _marker;
        }
    }

    public String GetMarker() {
        return marker;
    }

    public int GetMove() {
        int move;
        do {
            System.out.println(marker + "'s turn. Insert a 1 to 9 number to decide where to place the " + marker);
            try {
                move = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Only insert NUMBERS 1 TO 9!");
                move = 0; // we initialize the variable to an invalid value so the while loop continues without throwing an exception
            }
        } while (move < 1 || move > 9);

        return move;
    }
    
    // to be used by the artificial intelligence when implemented
    public int GenerateMove(){
        int move = 1;
        
        // TODO: add code that returns a move in accordance with the board status
        
        return move;
    }
}
