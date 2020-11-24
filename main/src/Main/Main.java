package Main;

import java.util.Scanner;


 class Main
{
    public static void print3(String statement)
    {
        //Hello World! How are you? My name is Igor.Hello World! How are you? My name is Igor.

//        String[] array = new String[5]; //инициализация пустого массива

        String[] array = statement.split(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String stroka1 = scanner.nextLine();

        print3(stroka1);
    }
}






























