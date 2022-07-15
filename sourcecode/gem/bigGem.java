package sourcecode.gem;

import sourcecode.board.Cell;

public class bigGem extends Gem implements getValue{
	protected int VALUE = 5;
    public bigGem(Cell position){
        super(position);
    }

	public int getVALUE() {
		return VALUE;
	}
    
    
}