package lesson01;

public class Numbers {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 10, b = 14;

        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a <= b) {
            System.out.println("a <= b");
        }
    }
}
