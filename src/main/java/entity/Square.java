package entity;

public class Square extends Figure{

    public Square() {
        setName("Square");
    }

    @Override
    public String toString() {
        return "Figure:"+getName()+";   "+"          Ploshad:"+getSquare()+";"+" Color:"+getColor()+";";
    }
}
