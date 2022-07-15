package sourcecode.board;
public class Square extends Cell implements Pickable {
    public Square(int position, int numberOfGems) {
        super(position, numberOfGems);
    }

	@Override
	public boolean mayBePickable() {
		// TODO Auto-generated method stub
		return true;
	}
}