package com.kodilla.kodillacourse;

interface Knight {
    String fight();
}

class KnightOne implements Knight {
    String name;

    public KnightOne(String name) {
        this.name = name;
    }

    public String fight() {
        return this.name + " Bitwa pod Grunwaldem";
    }

}

class KnightTwo implements Knight {
    String name;

    public KnightTwo(String name) {
        this.name = name;
    }

    public String fight() {
        return this.name + ": Bitwa pod Koronowem";
    }

}

public class FirstClass {

    public static void main(String[] args) {

        Knight knight = new KnightTwo("Konrad");
        FirstClass.info(knight);

        if ((knight instanceof Knight)) {
            System.out.println("\nTak, ten obiekt jest instancją interfejsu Knight");
        }

        System.out.println(("OK").hashCode());
        System.out.println(("OK1").hashCode());
        System.out.println(("OK2").hashCode());
    }

    public static void info(Knight knight) {
        System.out.print(knight.fight());
    }

}
