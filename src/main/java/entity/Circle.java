package entity;

public class Circle extends Figure{

    public Circle() {
        setName("Circle");
    }

    @Override
    public String toString() {
        return "Figure:"+getName()+";   "+"          Ploshad:"+getSquare()+";"+" Color:"+getColor()+";";
    }


}
