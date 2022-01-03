package entity;

import app.RandomNumber;

public enum Color {
        RED("красный"),
        ORANGE ("Оранжевый"),
        YELLOW("Желтый"),
        GREEN ("Зеленый"),
        BLUE ("Голубой"),
        VIOLET("Фиолетовый");


    private String name;
    Color(String name) {
this.name=name;

    }
    public String getName() {
        return name;
    }


    public static boolean contains(String element) {
        for (Color subject : Color.values()) {
            if (subject.name().equals(element))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getName();
    }
}
