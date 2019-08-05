package Lesson3;

import java.util.HashMap;

public class Main {

    //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    // Посчитать сколько раз встречается каждое слово.

    public static void main(String[] args) {
        String[] words = {
                "Purple",
                "Red",
                "Blue",
                "Pink",
                "Black",
                "Red",
                "Blue",
                "Green",
                "Purple",
                "Yellow",
                "Black",
                "Blue",
                "Red",
                "Green"};
        HashMap<String, Integer> mm = new HashMap<>();
        for(String word: words) {
            Integer res = mm.get(word);
            mm.put(word, res == null ? 1 : res + 1);
        }
        System.out.println(mm);

        //2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Путин", "+79241111111");
        phoneBook.add("Лукашенко", "+79242222222");
        phoneBook.add("Путин", "+79243333333");
        phoneBook.add("Трамп", "+7924444444");

        System.out.println("\nНомера Путина: " + phoneBook.get("Путин"));
    }

}