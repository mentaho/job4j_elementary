package ru.job4j.array;

public class SimpleStringEncoder {
    @SuppressWarnings("checkstyle:RightCurly")
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length() - 1; i++) {

            if (symbol == input.charAt(i + 1)) {
                counter++;
            } else {
                if (counter > 1) {
                    result = result + symbol + counter;
                    counter = 1;
                } else {
                    result = result + symbol;
                }
                symbol = input.charAt(i + 1);
            }

        }
        result = result + symbol;
        if (counter > 1) {
            result = result + counter;
        }
        return result;
    }
}
