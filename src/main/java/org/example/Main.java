package org.example;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(checkForPalindrome("Racecar")); // true
        System.out.println(checkForPalindrome("hello")); // false
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?")); // true
    }

    public static boolean checkForPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Locale.setDefault(Locale.ENGLISH);

        //sondan/baştan okunuşu aynı mı kontrolü:
        int start = 0;
        int end = cleanedText.length() - 1;

        while (start < end) {
            if (cleanedText.charAt(start) != cleanedText.charAt(end)) {
                return false;
            }
                start++;
                end--;
        }
        return true;
    }

    public static String convertDecimalToBinary(int decimal) {

        StringBuilder binaryString = new StringBuilder();

        while (decimal > 0){
            int remainder = decimal%2;
            binaryString.insert(0, remainder);
            decimal/=2;
        }
        return binaryString.toString();
    }

}