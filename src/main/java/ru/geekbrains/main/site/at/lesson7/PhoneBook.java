package ru.geekbrains.main.site.at.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PhoneBook {

    public static void main(String[] args) {

        Person person = new Person();
        person.add("111", "Иванов");
        person.add("222", "Смирнов");
        person.add("333", "Смирнов");
        person.add("444", "Смирнов");
        person.add("555", "Жуков");



        String[] results = person.getPhoneNumber("Смирнов");
        System.out.printf("Результаты поиска:\n%s\n", Arrays.toString(results));
        System.out.println();
    }
}