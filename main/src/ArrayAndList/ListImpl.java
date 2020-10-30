package ArrayAndList;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            stringList.add("hello");
        }
    }

}

//2. Заполнить List рандомными именами. И вывести этот список в обратном порядке
