/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Stephen Hoey
 */
public class JavaComp {

    public static String check(String s1, String s2) {

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Both words are the same.");
            System.exit(0);
        } else if (s1.length() != s2.length()) {
            System.out.println("Words are not the same length");
            System.exit(0);
        } else {
            System.out.println("Checking if first word can be rearranged to form the second word...");

            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                System.out.println("Yes the first word can be rearranged to form the second word.");
                System.exit(0);
            } else {
                System.out.println("Sorry no the first word can not be rearranged to form the second word.");
                System.exit(0);
            }

        }
        return "";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first word: ");
        String word_1 = scanner.nextLine();

        System.out.println("Please enter the second word: ");
        String word_2 = scanner.nextLine();

        check(word_1, word_2);

    }

}
