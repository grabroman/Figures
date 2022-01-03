package app;

import entity.Figure;

import java.util.ArrayList;

public class main  {
    public static void main(String[] args) {



        ArrayList<Figure> figuresMass=MassGenerator.generatemas( RandomNumber.getRandomBetweenRange(1,1000));
       /* for (Figure s:figuresMass) {
            System.out.println(s);
        }*/

        for(int i = 0; i< figuresMass.size(); i++) {
            System.out.println("Number :"+(i+1)+"    "+figuresMass.get(i));
        }

    }

}
