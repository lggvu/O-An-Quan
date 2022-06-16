package sourcecode.board;

public class Board {
    private final int numSquare = 10; // even number
    private final int numHalfCircle = 2;  // even number
    private final int numSmallGem = 50;
    private final int numBigGem = 2;

    private Cell[] board = new Cell[numHalfCircle + numSquare];

    public Board() {
        this.board[0] = new HalfCircle(0, numBigGem /2);
        this.board[0].addGem(new Gem());

        this.board[(numSquare + numHalfCircle)/2] = new HalfCircle((numSquare + numHalfCircle)/2, numBigGem /2);
        this.board[(numSquare + numHalfCircle)/2].addGem(new Gem());

        for(int i = 1; i <= (numSquare /2); i++) {
            this.board[i] = new Square(i, numSmallGem / numSquare);
            this.board[i].addGem();
        }
        for(int i = (numSquare /2)+2; i <= numSquare + numHalfCircle - 1; i++) {
            this.board[i] = new Square(i, numSmallGem / numSquare);
            this.board[i].addGem(new Gem());
        }
    }

    public Cell[] getBoard() {
        return board;
    }
}
