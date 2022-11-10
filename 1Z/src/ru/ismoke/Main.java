package ru.ismoke;

public class Main {
    private static void displayNumberContainingOnlyDifferentDigits(int[] array) {
        for (int element : array) {
            boolean isDistinct = true;
            char[] chars = String.valueOf(Math.abs(element)).toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        isDistinct = false;
                        break;
                    }
                }
                if (!isDistinct) {
                    break;
                } else if (i == chars.length - 2) {
                    System.out.println("Число, состоящее только из различных цифр: " + element);
                    return;
                }
            }
        }
        System.out.println("Таких чисел нет!");
    }
}