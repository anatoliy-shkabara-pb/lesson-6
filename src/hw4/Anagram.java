package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Input second string: ");
        String str2 = scanner.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // через регулярное выражение
        // str1 = str1.replaceAll("[^\\p{L}]", "");

        str1 = removeNotLetters(str1);
        str2 = removeNotLetters(str2);

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // не правильное сравнение массивов
        // chars1.equals(chars2) то же самое, что и chars1 == chars2

        if (Arrays.equals(chars1, chars2)) {
            System.out.println("Anagram detected!");
        } else {
            System.out.println("No anagram found!");
        }
    }

    private static String removeNotLetters(String str) {
        char[] chars = str.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (char c: chars) {
            if (Character.isLetter(c)) {
                strBuilder.append(c);
            }
        }
        return strBuilder.toString();
    }
}
