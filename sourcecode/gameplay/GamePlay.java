package sourcecode.gameplay;
import java.util.Scanner;

import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;
import java.util.ArrayList;
public class GamePlay {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Board board = new Board();
        Player Player1 = new Player("Player 1");
        Player Player2 = new Player("Player 2");

        // TODO Add Introduction and rules here
        System.out.println("Introduction");
        Player1.setTurn(Math.random() < 0.5);
        if (Player1.isInTurn()){
        	System.out.println("Player 1 plays first");
            GameStart(Player1, Player2, board);
        } else {
            GameStart(Player2, Player1, board);
            System.out.println("Player 2 plays first");
        }
    }
    public static boolean isGameOver(Player player1, Player player2, Board board) {
    	boolean res = false;
    	if (board.getNumBigGem() == 0) {
    		res = true;
    	}
    	return res;
    }
    public static void GameStart(Player player1, Player player2, Board board){
        ArrayList <Cell> Player1CellOnSide = new ArrayList<Cell>();
        ArrayList <Cell> Player2CellOnSide = new ArrayList<Cell>();
        Cell[] boardList = board.getBoard();
        for (int i = 1; i < 6; i ++) { 
            Player1CellOnSide.add(boardList[i]);
        }
        for (int i = 7; i < 12; i ++) {
            Player2CellOnSide.add(boardList[i]);
        }
        player1.setCellsOnSide(Player1CellOnSide);
        player2.setCellsOnSide(Player2CellOnSide);

        while (!(isGameOver(player1, player2, board))) {
        	System.out.println("Player 1's turn");
        	System.out.println("*********************************************");
        	System.out.println("Player 1 chooses a cell to pick gems from: ");
        	int cell_Num = sc.nextInt();
        	sc.nextLine();
            while (!(player1.pickUpGemFrom(boardList[cell_Num]))){
                System.out.println("The cell is invalid. Please choose another cell to pick!");
                cell_Num = sc.nextInt();
                sc.nextLine();
            }
            System.out.println("Choose Hand Direction");
            int Player1HandDirection = sc.nextInt();
            sc.nextLine();
            while (Player1HandDirection != 1 && Player1HandDirection != 0) {
                System.out.println("Invalid Hand Direction. Please choose again!");
            }
            player1.spreadGem(boardList[cell_Num], Player1HandDirection, board);
            System.out.println("*****************************************");
            System.out.println("Player 2's turn");
            System.out.println("Player 2 chooses a cell to pick gems from: ");
            int cell_Num2 = sc.nextInt();
            sc.nextLine();
            while(!player2.pickUpGemFrom(boardList[cell_Num2] )){
                System.out.println("The cell is invalid. Please choose another cell to pick!");
                sc.nextLine();
                }
            player2.pickUpGemFrom(boardList[cell_Num2]);
            System.out.println("Choose Hand Direction");
            int Player2HandDirection = sc.nextInt();
            while (Player2HandDirection != 1 && Player2HandDirection != 0) {
                System.out.println("Invalid Hand Direction. Please choose again!");
            }
            player2.spreadGem(boardList[cell_Num2], Player2HandDirection, board);
   
        }
        if (player1.calculateScore() > player2.calculateScore()) {
            System.out.println(player1.getName() + " wins.");
        } else if (player1.calculateScore() < player2.calculateScore()) {
            System.out.println(player2.getName() + " wins.");
        } else {
            System.out.println("Draw");
        }
        System.exit(0);

    }
}
