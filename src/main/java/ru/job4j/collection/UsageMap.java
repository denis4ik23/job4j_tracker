package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("denis4ik2387@gmail.com", "Cheklov Denis Gennadievich");
        map.put("petrov@mail.ru", "Petrov Ivan Petrovich");
        map.put("ivanov@yandex.ru", "Ivanov Alex Ivanovich");
        map.put("petrov@mail.ru", "Petrov Nikita Sergeevich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
