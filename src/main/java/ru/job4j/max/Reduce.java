package ru.job4j.max;

public class Reduce {
    private int[] newArray;

    public void to(int[] array) {
        newArray = array;
    }

    public void print() {
        for (int index = 0; index < newArray.length; index++) {
            System.out.println(newArray[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}