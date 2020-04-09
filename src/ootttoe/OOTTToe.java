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
public class OOTTToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();
        Player playerX = new Player("X");
        Player playerO = new Player("O");

        System.out.println("Welcome to Team 5's version of console Tic Tac Toe!");

        // looping as long as there is no winner
        while (board.winner == null) {
            board.PrintBoard();

            // looping until the move is accepted by the board
            while (board.SubmitMove(playerX.GetMarker(), playerX.GetMove()) == false) {
                board.PrintBoard();
            }
            // we check if the player won with his last move
            board.IsWinner(playerX.GetMarker());
            if (board.winner != null) {
                break;
            }

            board.PrintBoard();

            // looping until the move is accepted by the board
            while (board.SubmitMove(playerO.GetMarker(), playerO.GetMove()) == false) {
                board.PrintBoard();
            }
            // we check if the player won with his last move
            board.IsWinner(playerO.GetMarker());
            if (board.winner != null) {
                break;
            }

        }

        // we print the board one last time to let the players see how their choices played out
        board.PrintBoard();

        if (board.winner == "draw") {
            System.out.println("It's a draw! No one has won this game, how boring. \nOh well, this is a boring game after all.");
        } else {
            System.out.println("The player using the marker " + board.winner + " has won this game!");
        }
    }

}
