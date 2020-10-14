package Main;

import java.util.Arrays;
import java.util.Random;

class Homework {
    public static void main(String[] args) {
    System.out.print(Arrays.toString(evenArray(10)));

    Person person = new Person("igor", 25, 177, false);

    Person person1= new Person("igor", 177, true);

    //number1 and number2
        //1 and 2 => sum
        //1.05 and 1.06 => multi
        //"hello" and "worl" => variable1 + variable2 = "hellowrold"
        //add(variable1 ,variable2)
        //public static void add(


    //class Random()
       //создание объекта любого класса
//        Random random = new Random();
//        int number = random.nextInt(50);
}

    public static int[] evenArray(int number) {
        Random random = new Random();
        int[] array = new int[number];
        for (int i = 0, n = 2; i < array.length; n = n + 2, i++) {
            int randomnumber = random.nextInt(100);
            if (randomnumber % 2 == 0)
            {
                array[i] = randomnumber;
            }
            else {
                randomnumber = randomnumber + 1;
                array[i] = randomnumber;
            }

                //5 / 2 = 2
                //5 % 2 = 1
                //6 % 2 = 0
        }

        return array;
    }

}



