package sourcecode.gameplay;
import java.util.Scanner;

import sourcecode.board.Board;
import sourcecode.board.Cell;
import sourcecode.player.Player;
import java.util.ArrayList;
public class GamePlayTest {
	private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Board board = new Board();
        Cell[] boardlist = board.getBoard(); 
        Player Player1 = new Player("Player 1", boardlist[1]);
        Player Player2 = new Player("Player 2", boardlist[11]);
        //Add Introduction and rules here
        System.out.println("Introduction");
        Player1.setTurn(Math.random() < 0.5);
        if (Player1.isInTurn()){
            GameStart(Player1, Player2, board);
        }else {
        	GameStart(Player2, Player1, board);
        }
    }
    public static boolean gameIsOver(Board board) {
    	boolean endGame = false;
    	if (board.getNumBigGem() == 0 && board.getNumSmallGem() == 0) {
    		endGame = true;
    	}
    	else if (board.getBoard()[0].isEmpty() ==  true && board.getBoard()[(board.getNumSquare() + board.getNumHalfCircle()) / 2].isEmpty() == true) {
    		endGame = true; 
    	}
    	return endGame;
    }
    public static void GameStart(Player player1, Player player2, Board board){
    	int Player1NumOfBorrow = 0;
    	int Player2NumOfBorrow = 0;
    	ArrayList <Cell> Player1CellOnSide = new ArrayList<Cell>();
    	ArrayList <Cell> Player2CellOnSide = new ArrayList<Cell>();
    	for (int i = 1; i < 6; i ++) {
    		Player1CellOnSide.add(new Cell(i));
    	}
    	for (int i = 7; i < 12; i ++) {
    		Player2CellOnSide.add(new Cell(i));
    	}
    	while (!(gameIsOver(board))) {
    		//if (!player1.isCellOnSideEmpty()) {
    	//while(!player1.pickUpGemFrom(new Cell((int)(Math.random() * 11))) ){
     	    System.out.print("Pick gem from another Cell");
    	}
    }
}