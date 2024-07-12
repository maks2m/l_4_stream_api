package com.example;

// Использование сплитератора .

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

class StreamDemo9 {
    public static void main(String[] args) {
        // Создать список строк.
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");
        // Получить поток для ArrayList.
        Stream<String> myStream = myList.stream();
        // Получить сплитератор.
        Spliterator<String> splititr = myStream.spliterator();
        // Пройти по элементам в потоке.
//        while (splititr.tryAdvance((n) -> System.out.println(n))) ;

        splititr.forEachRemaining ( (n) -> System.out.println (n) );

    }
}

/**
 * Alpha
 * Beta
 * Gamma
 * Delta
 * Phi
 * Omega
 */