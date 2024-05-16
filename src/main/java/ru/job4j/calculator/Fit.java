package ru.job4j.calculator;

public class Fit {
    /**
     * Расчёт идеального веса для мужчин.
     * @param height Рост в сантиметрах.
     * @return Идеальный вес в килограммах.
     */
    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;

    public static double manWeight(short height) {
        final double coefficient = 1.15;
        return (height - BASE_HEIGHT_MAN) * coefficient;
    }

    public static double womanWeight(short height) {
        final double coefficient = 1.15;
        return (height - BASE_HEIGHT_WOMAN) * coefficient;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + womanWeight(height));
    }
}
