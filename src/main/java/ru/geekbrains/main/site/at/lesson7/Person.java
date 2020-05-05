package ru.geekbrains.main.site.at.lesson7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    private Map<String, String> book = new HashMap<String, String>();

    public void add(String phoneNumber, String surname) {book.put(phoneNumber, surname);}

    public String[] getPhoneNumber(String surname) {
        List<String> result = new ArrayList<>();
        for (Map.Entry entry : book.entrySet()) {
            if (surname.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("Записей не найдено");
        return result.toArray(new String[0]);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : book.entrySet()) {
            sb.append(entry.getKey() + "\t- " + entry.getValue() + "\n");
        }
        return sb.toString();
    }
}

