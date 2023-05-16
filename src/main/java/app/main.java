package app;

import entity.Figure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main  {
    public static void main(String[] args) throws IOException {
        PrintStream tmpOut = System.out;

        // change stream into text collector
        TextCollector textCollector = new TextCollector();
        System.setOut(new PrintStream(textCollector));


        ArrayList<Figure> figuresMass=MassGenerator.generatemas( RandomNumber.getRandomBetweenRange(1,1000));
       /* for (Figure s:figuresMass) {
            System.out.println(s);
        }*/




        for(int i = 0; i< figuresMass.size(); i++) {

            System.out.println("Number :"+(i+1)+"    "+figuresMass.get(i));
        }


        System.out.println("end");

        System.setOut(tmpOut);
        ArrayList<String> lines = (ArrayList<String>) textCollector.getLines();
        for (String line : lines) {
            System.out.println(line);
        }
        for(int i = 0; i< figuresMass.size(); i++) {

            System.out.println("Number :"+(i+1)+"    "+figuresMass.get(i));
        }

    }
    public static class TextCollector extends OutputStream {
        private final ArrayList<String> lines = new ArrayList<>();
        private StringBuilder buffer = new StringBuilder();

        @Override
        public void write(int b) throws IOException {
            if (b == '\n') {
                lines.add(buffer.toString());
                buffer = new StringBuilder();
            } else {
                buffer.append((char) b);
            }
        }

        public List<String> getLines() {
            return lines;
        }
    }
}
