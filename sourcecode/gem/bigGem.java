package sourcecode.gem;

import sourcecode.board.Cell;

public class bigGem extends Gem{
	protected int VALUE = 1;
    public bigGem(Cell position){
        super(position);
    }

	public int getVALUE() {
		return VALUE;
	}
    
    
}