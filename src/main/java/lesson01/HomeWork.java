package lesson01;

public class HomeWork {
    public static void main(String[] args) {
        checkHomework();
    }

    public static void checkHomework() {
        int tasksCount = 3;
        if (tasksCount == 6) {
            System.out.println("Великолепно,  вы выполнили все задачи");
        }
        if (tasksCount > 3 && tasksCount < 6) {
            System.out.println("Отлично, Вы выполнили почти все задачи!");
        }
        if (tasksCount <= 3) {
            System.out.println("Вы решили меньше половины, но Вы все равно молодец, надо же с чего-то начинать!!");
        }

        System.out.println("Проверка завершена");

    }
}
