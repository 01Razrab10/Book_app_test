package org.example.book_app_test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Algorithm {
    ArrayList<String> newList = new ArrayList<>();

    Algorithm() throws Exception {

        // int i = 0;

        Document document = Jsoup.connect("https://kamen-lib.altai.muzkult.ru/100knig/").userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 " +
                "(KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36").get();

        Elements element = document.getElementsByTag("strong");
        String elements = element.text().substring(element.text().indexOf("1."), element.text().indexOf("658700"));

        /*
        for (int i = 0; i < books.length; i++) {
            books[i] = elements.split(" ")
        }
         */

        String[] books = elements.split("» ");

        /*
        Iterator<String> iterator = Arrays.stream(books).iterator();

        while (i < 101) {

            books[i] += "»";
            books[87] = "Гомер «Одиссея»";
            i++;

            newList.add(books[i]);
        }
        System.out.println(newList);
        */

        for (int i = 0; i < 100; i++) {
            books[i] += "»";
            books[87] = "Гомер «Одиссея»";
            books[33] = "Библия";

            newList.add(books[i]);

        }
        newList.add("Франц Кафка «Процесс»");
    }
    public String getRandomTitle() {
        int random = (int) (Math.random() * newList.size());

        return newList.get(random).substring(newList.get(random).indexOf(".") + 1,
                newList.get(random).length()) + ".";
    }
}

