package lesson01;

public class Weather {
    public static void main(String[] args) {
        howIsTheWeatherThere();
    }

    public static void howIsTheWeatherThere() {
        int temperature = 15;

        if (temperature > 10) {
            System.out.println("На улице очень даже тепло для марта месяца");
        } else if (temperature > -5) {
            System.out.println("Для марта самое то");
        } else {
            System.out.println("Там точно весна?");
        }
    }
}
