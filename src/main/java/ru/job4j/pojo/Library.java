package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book first = new Book("Clean code", 500);
        Book second = new Book("Java", 999);
        Book third = new Book("Pattern", 250);
        Book fours = new Book("War and peace", 1500);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fours;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCountPage());
        }
        System.out.println("Переставим местами книги с индексом 0 и 3");
        books[0] = fours;
        books[3] = first;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCountPage());
        }
        System.out.println("Вывод книг с именем Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getCountPage());
            }
        }
    }
}
