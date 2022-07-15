package sourcecode.gem;

import sourcecode.board.Cell;

public class smallGem extends Gem implements getValue{
	protected int VALUE = 1;

    public smallGem(Cell position){
        super(position);
    }

	public int getVALUE() {
		return VALUE;
	}
    
    
}