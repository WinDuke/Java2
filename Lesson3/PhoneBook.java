package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;


// 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи.
// С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может
// быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String tel) {
        ArrayList<String> telList = phoneBook.get(name);
        if (telList == null) telList = new ArrayList<>();
        telList.add(tel);
        phoneBook.put(name, telList);
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }
}