package lesson01;

public class Colo {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
}
