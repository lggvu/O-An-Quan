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
        //Add Introduction and rules here
        System.out.println("Introduction");
        Player1.setTurn(Math.random() < 0.5);
        if (Player1.isInTurn()){
            GameStart(Player1, Player2, board);
        }else {
        	GameStart(Player2, Player1, board);
        }
    }
    public static void GameStart(Player player1, Player player2, Board board){
    	int Player1NumOfBorrow = 0;
    	int Player2NumOfBorrow = 0;
    	ArrayList <Cell> Player1CellOnSide = new ArrayList<Cell>();
    	ArrayList <Cell> Player2CellOnSide = new ArrayList<Cell>();
    	for (int i = 1; i < 6; i ++) {
    		Player1CellOnSide.add(new Cell(i));
    	}
    	for (int i = 8; i < 12; i ++) {
    		Player2CellOnSide.add(new Cell(i));
    	}
    	while ((!(board.getNumBigGem() == 0 && board.getNumSmallGem() == 0)) || (!(board.getBoard()[0]).isEmpty() && board.getBoard()[board.getNumSquare() / 2 + board.getNumHalfCircle() / 2].isEmpty())) {
    		if (!player1.isCellOnSideEmpty()) {
    	  	     while(!player1.pickUpGemFrom(new Cell((int)(Math.random() * 11))) ){
     	            System.out.print("Pick gem from another Cell");
     	        }
     	        if(player1.pickUpGemFrom(new Cell((int)(Math.random() * 11)))) {
     	        	System.out.println("Choose Hand Direction");
     	        	int Player1HandDirection = sc.nextInt();
     	        	player1.spreadGem(Player1HandDirection);
     	        	System.out.println("Player 2's turn");
     	        	if (!player2.isCellOnSideEmpty()) {
        	            while(!player2.pickUpGemFrom(new Cell((int)(Math.random() * 11))) ){
         	                System.out.println("Pick gem from another Cell");
         	            }
         	            if(player2.pickUpGemFrom(new Cell((int)(Math.random() * 11)))){
         	            	System.out.println("Choose Hand Direction");
         	            	int Player2HandDirection = sc.nextInt();
         	            	player2.spreadGem(Player2HandDirection);
         	            }
     	        	}else {
     	        		player2.setBorrow(true);
     	        		Player2NumOfBorrow += 1;
     	        		player2.setNumBorrow(5 * Player2NumOfBorrow);
       	        		player2.setNumBorrow(5 * Player2NumOfBorrow);
       	        		//How to add five small gems to gemInHand of player 2??
        	            while(!player2.pickUpGemFrom(new Cell((int)(Math.random() * 11))) ){
         	                System.out.println("Pick gem from another Cell");
         	            }
         	            if(player2.pickUpGemFrom(new Cell((int)(Math.random() * 11)))){
         	            	System.out.println("Choose Hand Direction");
         	            	int Player2HandDirection = sc.nextInt();
         	            	player2.spreadGem(Player2HandDirection);
         	            }
     	        	}
     	        }
    		}
    		else {
    			// Borrow Gem from the other player
    			player1.setBorrow(true);
    			Player1NumOfBorrow += 1;
	        	player1.setNumBorrow(5 * Player1NumOfBorrow);
    			//How to add five small gems to gemsInHand of player 1??
    			GameStart(player1, player2, board);
    			//If GameStart(player1, player2, board) is used, can we preserve the number of gems in hand,... of 2 players?
    		}
    	}
    	if (player1.CalculteScore() > player2.CalculteScore()) {
    		System.out.println("Player 1 wins.");
    	}else if (player1.CalculteScore() < player2.CalculteScore()) {
    		System.out.println("Player 2 wins");
    	}else {
    		System.out.println("Draw");
    	}

}
}