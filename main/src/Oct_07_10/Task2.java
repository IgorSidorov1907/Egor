package Oct_07_10;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberArray = scanner.nextInt();

        String[][] nameArray = new String[4][6];

        nameArray[2][3] = "Hello";

        //1. type array = int. Заполнить массив четными числами. Размерность задается с консоли
        //2, 4, 6, 8

        //2. найти сумму всех элементов массива из task1.

        //3. type array = int. Двумерный массив. создать, заполнить не нулевыми значениями
        //  Найти сумму элементов данного массива по строчно

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                nameArray[i][j] =  "1";
            }
        }

    }

}
