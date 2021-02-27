import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TickTackToe {


    public static final int SIZE = 3;
    public static final String DOT_X = "X";
    public static final String DOT_O ="O";
    public static final String DOT_EMPTY ="¤";
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();
    public static boolean SILLY_MODE=false;
    public static String[][] map = new String[SIZE][SIZE];



    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {
            humanTurn();
            if (isEndGame(DOT_X)) {
                break;
            }
            computerTurn();
            if (isEndGame(DOT_O)) {
                break;
            }
        }
    }

    private static void initMap(){

        for (String[] m : map) {
            Arrays.fill(m, DOT_EMPTY);
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты ячейки (X Y)");
            y = scanner.nextInt() - 1; // Считывание номера строки
            x = scanner.nextInt() - 1; // Считывание номера столбца
            System.out.println("Вы ввели неверные координаты");
        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    private static void computerTurn() {
        int x = -1;
        int y = -1;
        if (SILLY_MODE) {
            do {
                y = random.nextInt(SIZE);
                x = random.nextInt(SIZE);
            } while (isCellValid(x, y));
        } else {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[0][0] == DOT_X && map[0][1] == DOT_X && map[0][2] == DOT_EMPTY && map[0][2] != DOT_O) {
                        y = 0;
                        x = 2;
                        break;
                    }
                    if (map[1][0] == DOT_X && map[1][1] == DOT_X && map[1][2] == DOT_EMPTY && map[1][2] != DOT_O) {
                        y = 1;
                        x = 2;
                        break;
                    }
                    if (map[2][0] == DOT_X && map[2][1] == DOT_X && map[2][2] == DOT_EMPTY && map[2][2] != DOT_O) {
                        y = 2;
                        x = 2;
                        break;
                    }
                    if (map[0][0] == DOT_X && map[1][0] == DOT_X && map[2][0] == DOT_EMPTY && map[2][0] != DOT_O) {
                        y = 2;
                        x = 0;
                        break;
                    }
                    if (map[0][1] == DOT_X && map[1][1] == DOT_X && map[2][1] == DOT_EMPTY && map[2][1] != DOT_O) {
                        y = 2;
                        x = 1;
                        break;
                    }
                    if (map[0][2] == DOT_X && map[1][2] == DOT_X && map[2][2] == DOT_EMPTY && map[2][2] != DOT_O) {
                        y = 2;
                        x = 2;
                        break;
                    }
                    if (map[0][0] == DOT_X && map[1][1] == DOT_X && map[2][2] == DOT_EMPTY && map[2][2] != DOT_O) {
                        y = 2;
                        x = 2;
                        break;
                    }
                    if (map[2][0] == DOT_X && map[1][1] == DOT_X && map[0][2] == DOT_EMPTY && map[0][2] != DOT_O) {
                        map[0][2] = DOT_O;
                    } else {
                        y = random.nextInt(SIZE);
                        x = random.nextInt(SIZE);
                    }
                }

            }
        }
        System.out.println("Компьютер выбрал ячейку " + (y + 1) + " " + (x + 1));
        map[y][x] = DOT_O;
    }
    private static boolean isCellValid(int x, int y) {
        boolean result = true;
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            result = false;
        } else if (map[y][x] != DOT_EMPTY) {
            result = false;
        }
        return result;
    }
    private static boolean isMapFull() {
        boolean result = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    result = false;
            }
        }
        return result;
    }
    private static boolean checkWin(String playerSymbol) {
        for (int i = 0; i < SIZE; i++) {
            // проверяем строки
            if (checkLine(i, 0, 0, 1, playerSymbol)) {
                return true;
            }
            // проверяем столбцы
            if (checkLine(0, i, 1, 0, playerSymbol)) {
                return true;
            }
        }
        // проверяем диагонали
        if (checkLine(0, 0, 1, 1, playerSymbol)) {
            return true;
        }
        if (checkLine(0, SIZE - 1, 1, -1, playerSymbol)) {
            return true;
        }
        return false;
    }
    public static boolean checkLine(int start_x, int start_y, int dx, int dy, String sign) {
        for (int i = 0; i < SIZE; i++) {
            if (map[start_x + i * dx][start_y + i * dy] != sign)
                return false;
        }
        return true;
    }
    private static boolean isEndGame(String playerSymbol){

        boolean result = false;
        printMap();
        if (checkWin(playerSymbol)) {
            System.out.println("Победили " + playerSymbol);
            return true;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            return true;
        }
        return result;
    }
}