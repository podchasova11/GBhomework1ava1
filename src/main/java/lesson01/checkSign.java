package lesson01;

public class checkSign {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 3, b = 5, sum;
        sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        if (sum < 0) {
            System.out.println("Сумма Отрицательная");
        }
    }
}
