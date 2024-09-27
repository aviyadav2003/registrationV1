package com.api;

import java.util.Scanner;

public class A {
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);

            // Input from the user
            System.out.println("Enter a string: ");
            String original = scanner.nextLine();

            // Remove non-alphanumeric characters and convert to lowercase
            String cleanedString = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Check if the string is a palindrome
            if (isPalindrome(cleanedString)) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }

            scanner.close();
        }

        // Method to check if the string is a palindrome
        public static boolean isPalindrome(String str){
            int left = 0, right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

}
