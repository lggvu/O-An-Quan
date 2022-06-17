package sourcecode.gem;
public class smallGem extends Gem{
    String color;
    public smallGem(int position, String color){
        super(position);
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}