package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passed = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 Euro. Test result : " + passed);
        float inDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inDollar);
        passed = expectedDollar == outDollar;
        System.out.println("180 rubles are 3 Dollars. Test result : " + passed);

    }

}
