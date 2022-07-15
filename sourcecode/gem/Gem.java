package sourcecode.gem;
import sourcecode.board.*;

public abstract class Gem {
	protected Cell position;

    public Gem(Cell position){
        this.position = position;
    }

	public Gem() {

	}

	public Cell getPosition() {
		return position;
	}

	private void setPosition(Cell position) {
		this.position = position;
	}

	public String toString() {
		return this.getClass().getSimpleName() + " - position = " + this.position;
	}

	public abstract int getVALUE();
}
