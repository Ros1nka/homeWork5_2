import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Ex1
        System.out.println("Задача 1");

        int[] payment = {12, 16, 8, 22, 18};
        int sum = 0;

        for (int i : payment) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        //Ex2
        System.out.println("Задача 2");

        int minExpenses = payment[0];
        int maxExpenses = payment[0];

        for (int i = 1; i < payment.length; i++) {
            if (minExpenses > payment[i]) {
                minExpenses = payment[i];
            } else if (maxExpenses < payment[i]) {
                maxExpenses = payment[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses  + " рублей." +
                " Максимальная сумма трат за неделю составила " + maxExpenses  + " рублей");
        System.out.println();

        //Ex3
        System.out.println("Задача 3");

        double average = (double) sum / payment.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();

        //Ex4
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
        System.out.println();
    }
}