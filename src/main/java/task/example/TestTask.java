package task.example;

import java.util.Scanner;

public class TestTask {
    private static final int CONST = 7;
    private static final String GIVEN_NAME = "Вячеслав";
    private static final int[] INT_ARRAY = {0, 1, 3, 10, 12, 14, 24, 33, 67};

    private static final String BRACKET_SEQUENCE = "[((())()(())]]";
    //This bracket sequence is not correct, because 1 bracket "(" is not closed with ")". For change it to correct, we should change 1 bracket "]" into ")".

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        checkNumber(number);

        Scanner newName = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = newName.nextLine();
        checkName(name);

        checkArrayElementsMultipleOf3(INT_ARRAY);

        System.out.println("Bracket Sequence is correct? - " + ifSequenceIsCorrect(BRACKET_SEQUENCE));
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
        for (int i : inputArray)
            if (i % 3 == 0) System.out.println(i + " ");
    }

    public static boolean ifSequenceIsCorrect(String sequence) {
        boolean flag = false; //Is sequence open?
        int list1 = 0; //number of unpair (

        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == '(')
                if (!flag) {
                    flag = true;
                    ++list1;
                } else
                    ++list1;

            if (sequence.charAt(i) == ')' && !flag) {
                return false;
            }
            if (sequence.charAt(i) == ')' && flag) {
                --list1;
                if (list1 == 0) flag = false;
            }

        }
        return !flag;
    }

}