package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Sergei Petrov";
        names[2] = "Dima Wined";
        names[3] = "Tom Hanks";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}