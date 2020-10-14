package Main;

import java.util.Arrays;

class Homework {
    public static void main(String[] args) {
    System.out.print(Arrays.toString(evenArray(10)));
}

    public static int[] evenArray(int number) {
        int[] array = new int[number / 2];
        for (int i = 0, n = 2; i < array.length; n = n + 2, i++) {
            array[i] = n;
        }
        return array;
    }
}

