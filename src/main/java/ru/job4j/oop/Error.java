package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String massage;

    public void printInfo() {
        System.out.println("есть ошибка: " + active);
        System.out.println("количество: " + status);
        System.out.println("название: " + massage);
    }

    public Error() {
    }

    public Error(boolean active, int status, String massage) {
        this.active = active;
        this.status = status;
        this.massage = massage;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 1, "ошибка 404");
        error1.printInfo();
        Error error2 = new Error(true, 2, "ошибка 401");
        error2.printInfo();
    }
}
