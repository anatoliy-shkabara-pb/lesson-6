package hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();

        str = capilalize(str);
        System.out.println("New string: ");
        System.out.println(str);
    }

    public static String capilalize(String str) {
        char[] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        boolean isPrevLetter = false;
        for (char c: chars) {
            boolean isCurrentLetter = Character.isLetter(c);
            if (isCurrentLetter && !isPrevLetter) {
                builder.append(Character.toUpperCase(c));
            } else {
                builder.append(c);
            }
            isPrevLetter = isCurrentLetter;
        }
        return builder.toString();
    }
}
