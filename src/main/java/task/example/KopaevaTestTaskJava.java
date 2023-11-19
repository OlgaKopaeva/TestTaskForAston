package task.example;

import java.util.Arrays;
import java.util.Scanner;

public class KopaevaTestTaskJava {
    private static final int CONST = 7;
    private static final String GIVEN_NAME = "Вячеслав";

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        checkNumber(number);

        Scanner newName = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = newName.nextLine();
        checkName(name);

        Scanner newArray = new Scanner(System.in);
        System.out.println("Введите числовой массив, разделяя числа пробелами: ");
        String arrString = newArray.nextLine();
        String[] arrayStrings = arrString.split(" ");
        int[] arrayNumbers = Arrays.stream(arrayStrings)
                .mapToInt(Integer::parseInt)
                .toArray();
        checkArrayElementsMultipleOf3(arrayNumbers);

    }

    public static void checkNumber(int number) {
        if (number > CONST)
            System.out.println("Привет!");
        else
            System.out.println("Число меньше или равно " + CONST);
    }

    public static void checkName(String name) {
        if (name.equals(GIVEN_NAME))
            System.out.println("Привет, Вячеслав!");
        else
            System.out.println("Нет такого имени.");
    }

    public static void checkArrayElementsMultipleOf3(int[] inputArray) {
        System.out.println("Числа, кратные 3:");
        for (int i : inputArray)
            if (i % 3 == 0) System.out.println(i + " ");
    }
}

