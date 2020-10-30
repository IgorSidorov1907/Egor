package ArrayAndList;

public class Array {
    //массив - упородяченные однотипные данные
    public static void main(String[] args) {
        int[] arrayInt = new int[55]; // одномерные массивы
        int[][] arrayIntInt = new int[4][4];

        //заполнение массива
        //1 - в ручную
        arrayInt[3] = 14;
        arrayInt[6] = 29;

        int sumIntInt = 0;

        for (int i = 0; i < arrayIntInt.length; i++) {
            for (int j = 0; j < arrayIntInt[i].length; j++) {
                sumIntInt = sumIntInt + arrayIntInt[i][j];
            }
        }

        //2 - через циклы
        for (int i = 0; i < arrayInt.length + 1; i++) {
            arrayInt[i] = 5;
        }

        int sum = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            sum = sum + arrayInt[i];
        }

    }
}



//1. Создать двумерный массив. Посчитать сумму на каждой строке данного массива и вывести наибольшую
