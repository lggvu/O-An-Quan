package sourcecode.board;

public class HalfCircle extends Cell {
    private boolean hasBigGem;

    public HalfCircle(int position, int numberOfGems) {
        super(position, numberOfGems);
    }

    public boolean hasBigGem() {
        return hasBigGem;
    }
}
