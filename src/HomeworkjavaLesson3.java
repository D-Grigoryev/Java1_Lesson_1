// 1. Написать программу, которая загадывает случайное число от 0 до 9 и
// пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить,
// больше ли указанное пользователем число, чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
// (1 – повторить, 0 – нет).

import java.util.Random;
import java.util.Scanner;
    public class HomeworkjavaLesson3 {
        static Random random = new Random();
        static Scanner sc = new Scanner(System.in);
        static int cout;
        static boolean x=false;

        public static void main(String[] args) {
            System.out.println("Добро пожаловать в игру УГАДАЙ ЧИСЛО");
            numbersGame();
            sc.close();
        }
        public static void numbersGame() {
            if (cout<3) {
                int number = random.nextInt(9);
                System.out.println(number);
                while (cout < 3) {
                    System.out.println("Введите число");
                    int inputnumber = sc.nextInt();
                    if (number == inputnumber) {
                        x = true;
                        System.out.println("Вы угадали");
                        restart(x);
                    } else if (number > inputnumber) {
                        System.out.println("Введенное число меньше, чем загаданное");
                        cout++;
                    } else {
                        System.out.println("Введенное число больше, чем загаданное");
                        cout++;
                    }
                    if (number != inputnumber && cout == 3) {
                        x = true;
                        System.out.println("Вы проиграли");
                        restart(x);
                    }
                }
            }
        return;
        }
        public static void restart(boolean x) {
            if (x==true) {
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

            }
            while (true) {
                if (sc.next().equals("1")) {
                    cout = 0;
                    numbersGame();
                } else {
                    cout=3;
                }
           return;
            }
        }
    }
















