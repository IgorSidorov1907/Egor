package ArrayAndList;

import java.util.ArrayList;
import java.util.List;

public class Array {
    //массив - упородяченные однотипные данные
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(18);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        list.remove(1);
//        list.remove(person1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer element : list)
        {
            System.out.println(element);
        }

    }
}





//1. Создать список на рандомное число элементов (будешь его заводить с клаивиатуры). Заполнить лист
// через функцию Random() и надо вывести этот список только с четными числами.

//2. Создать список слов (String). Заполнить рандомными словами. Размер списка не важен (size>5).
//Вывести два списка:
//а. Список должен содержать слова, которые начинаются с гласной буквы
//б. Список должен содержать слова, размер которых - нечетное число.