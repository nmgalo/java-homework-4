package ge.edu.btu.demo3;

import ge.edu.btu.demo3.models.AiponIqsi;
import ge.edu.btu.demo3.models.FanrianiNokia;

public class Main {
    public static void main(String[] args) {
        AiponIqsi aiponIqsi = new AiponIqsi();
        printSmartPhone(aiponIqsi);

        FanrianiNokia fanrianiNokia = new FanrianiNokia();
        printSimbian(fanrianiNokia);

    }

    public static <E extends Smartphone> void printSmartPhone(E e) {
        System.out.println(e);
    }

    public static <E extends Simbian> void printSimbian(E e) {
        System.out.println(e);
    }

}
