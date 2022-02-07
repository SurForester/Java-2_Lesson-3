package com.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // формируем массив
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Москва");
        stringList.add("Екатеринбург");
        stringList.add("Сургут");
        stringList.add("Сочи");
        stringList.add("Владивосток");
        stringList.add("Туапсе");
        stringList.add("Кириши");
        stringList.add("Санкт-Петербург");
        stringList.add("Москва");
        stringList.add("Сургут");
        stringList.add("Адлер");
        stringList.add("Адлер");
        stringList.add("Сочи");
        stringList.add("Сургут");
        stringList.add("Санкт-Петербург");
        stringList.add("Сургут");
        stringList.add("Санкт-Петербург");
        stringList.add("Сочи");

        // определяем уникальный набор строк и количство повторов
        HashMap<String, Integer> uniqueList = new HashMap<>();
        for (String stringValue : stringList) {
            Integer mapElement = uniqueList.get(stringValue);
            if (mapElement == null) {
                uniqueList.put(stringValue, 1);
            } else {
                uniqueList.put(stringValue, mapElement + 1);
            }
        }
        // выводим результат анализа на уникальность
        for (Map.Entry<String, Integer> object: uniqueList.entrySet()) {
            System.out.println("Unique key = " + object.getKey() + ", unique_quantity = " + object.getValue());
        }

        //телефонный справочник
        PhoneList phoneList = new PhoneList();
        phoneList.add("Петров", "+71234567890");
        phoneList.add("Васечкин", "+70987654321");
        phoneList.add("Маша", "+101234546789");
        phoneList.add("Васечкин", "+57898529517");

        // проверяем
        System.out.println();
        ArrayList<String> s = phoneList.get("Петров");
        System.out.println("Phones for Петров: " + s);

        System.out.println();
        s = phoneList.get("Васечкин");
        System.out.println("Phones for Васечкин: " + s);

    }
}
