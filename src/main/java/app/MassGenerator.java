package app;

import entity.*;

import java.util.ArrayList;

public interface MassGenerator {


    static ArrayList<Figure> generatemas(int size) {
        ArrayList<Figure> mass = new ArrayList<>(size);
        ;
        for (int i = 0; i < size; i++) {
            int a = RandomNumber.getRandomBetweenRange(1, 4);
            switch (a) {
                    case 1 -> mass.add(new Circle());

                    case 2 -> mass.add(new Square());

                    case 3 -> mass.add(new Trapezoid());

                    case 4 -> mass.add(new Triangle());
                    default -> {
                        mass.add(new Figure());
                    System.out.println("Problem in generation");
                    throw new IllegalArgumentException();
                    }
            }


        }
        return mass;
    }
}