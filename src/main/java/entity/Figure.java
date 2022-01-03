package entity;

import app.RandomNumber;

public class Figure {

private int square;
private String name;
private Color color;
    public Figure() {
        this.square =  RandomNumber.getRandomBetweenRange(1,1000);
        this.name = "Figure";
        this.color=setColor();
    }



    @Override
    public String toString() {

        return "Figure:"+getName()+";"+"          Ploshad:"+getSquare()+";"+" Color:"+getColor()+";";
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getColor() {
        return color.getName();
    }
    public Color setColor() {
        return switch (RandomNumber.getRandomBetweenRange(1, 6)) {
            case 1 ->  color.RED;

            case 2 ->  color.GREEN;

            case 3 ->  color.ORANGE;

            case 4 ->  color.BLUE;

            case 5 ->  color.YELLOW;

            case 6 ->  color.VIOLET;
            default -> {

                System.out.println("Problem in generation");
                throw new IllegalArgumentException();
            }
        };

    }
}
