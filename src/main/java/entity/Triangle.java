package entity;

public class Triangle extends Figure{
    public Triangle() {
        setName("Triangle");
    }

    @Override
    public String toString() {
        return "Figure:"+getName()+"; "+"          Ploshad:"+getSquare()+";"+" Color:"+getColor()+";";
    }
}
