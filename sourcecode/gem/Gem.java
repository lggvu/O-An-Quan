package sourcecode.gem;
import sourcecode.Cell.*;
public class Gem {
	protected Cell position;
    public Cell(Cell position){
        this.position = position;
    }
	public Cell getPosition() {
		return position;
	}

	private void setPosition(Cell position) {
		this.position = position;
	}
	public void moveLeft() {
		if (this.position == new Cell(0)) {
			setPosition(new Cell(11));
		}
		else {
			setPosition(new Cell(this.position.getPosition() - 1));
		}
	}

	public void moveRight() {
		if (this.position == new Cell (10)) {
			setPosition(new Cell(0));
		}else {
			setPosition( new Cell(this.position.getPosition() + 1));
		}
	}
	public void terminate() {
		//How to show that if this cell is captured then it is terminated from the board?
		setPosition(null);
	}
}
