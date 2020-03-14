/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ootttoe;

/**
 *
 * @author gioel
 */
public class Board {

    String[] board;

    String winner;

    // creates the board and initializes it with numbers 1 to 9
    public Board() {
        board = new String[9];

        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }

    // tries to add a move in the board slot, returnig true if succesful
    public boolean SubmitMove(String _marker, int _slot) {
        if (IsSlotFree(_slot - 1)) { // if the slot where we are trying to place the mark is free
            board[_slot - 1] = _marker; // the -1 is needed because arrays start at 0
            return true;
        } else {
            System.out.println("You are trying to mark an occupied slot, choose another one.");
            return false;
        }
    }

    // checks if the slot is occupied by another X or O
    private boolean IsSlotFree(int _slot) {
        if (board[_slot] == "X" || board[_slot] == "O") {
            return false;
        } else {
            return true;
        }
    }

    // checks if any line has a consecutive XXX or OOO
    public boolean IsWinner(String _marker) {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            // after each loop we check if the line is 3 consecutive markers, if it is then that marker has won
            if (line.equals(_marker + _marker + _marker)) {
                winner = _marker;
                return true;
            }else{
                winner = null;
            }
        }
        return false; // the only reason this is here and not in the else is because the compiler was complaining
    }

    // prints the contents of the board in a nice way, totally not stolen from someone else
    public void PrintBoard() {
        System.out.println("Current board status: ");

        System.out.println("/---|---|---\\");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("\\---|---|---/");
    }
}
