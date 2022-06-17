package sourcecode.gem;

import sourcecode.board.Cell;

public class bigGem extends Gem{
	protected int value = 5;
    public bigGem(Cell position){
        super(position);
    }
	public int getVALUE() {
		return value;
	}
    
    
}
