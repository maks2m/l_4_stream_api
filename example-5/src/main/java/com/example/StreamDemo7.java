package com.example;

// Использование collect() для создания объектов List и Set из списка.

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String n, String р, String е) {
        name = n;
        phonenum = р;
        email = е;
    }
}

class NamePhone {
    String name;
    String phonenum;

    NamePhone(String n, String р) {
        name = n;
        phonenum = р;
    }
}

public class StreamDemo7 {
    public static void main(String[] args) {
        // Список имен , телефонных номеров и адресов электронной почты.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", " 555-5555 ",
                "Larry@HerbSchildt . com "));
        myList.add(new NamePhoneEmail("James", " 5 55-4444",
                " Jam es@HerbSchildt . com "));
        myList.add(new NamePhoneEmail("Mary", " 555-3333",
                "Mary@HerbSchildt.com"));
        // Сопоставить с новым потоком имена и телефонные номера.
        Stream<NamePhone> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );
        // Использовать collect () дпя создания списка List
        // с именами и телефонными номерами.
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Имена и телефонные номера в List : ");
        for (NamePhone e : npList)
            System.out.println(e.name + ": " + e.phonenum);
        // Получить еще одно сопоставление имен и телефонных номеров.
        nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );
        // Создать набор Set с применением collect() .
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("Имeнa и телефонные номера в Set:");
        for (NamePhone e : npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
}

/**
 * Имена и телефонные номера в List :
 * Larry:  555-5555
 * James:  5 55-4444
 * Mary:  555-3333
 * Имeнa и телефонные номера в Set:
 * James:  5 55-4444
 * Larry:  555-5555
 * Mary:  555-3333
 */