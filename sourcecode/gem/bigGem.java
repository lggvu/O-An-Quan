package sourcecode.gem;

import sourcecode.board.Cell;

public class bigGem extends Gem{
	private final int VALUE = 5;
    public bigGem(Cell position){
        super(position);
    }

	public int getVALUE() {
		return VALUE;
	}
    
    
}