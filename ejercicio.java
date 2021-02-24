
/**
 * # Authenticate a list of usernames
 * 
 * Given an array of strings representing a list of usernames, return true only
 * if all usernames comply with your company's guidelines. Return false
 * otherwise.
 * 
 * The guidelines say that the username is valid only if:
 * 
 * it is between 6-10 characters long; 
 * contains at least 1 lowercase letter;
 * contains at least 1 number; 
 * contains only numbers and lowercase letters.
 * Examples of arrays that will be tested:
 * 
 * const usernames1 = ["john123", "alex222", "sandra1"]; // returns true
 * 
 * const usernames2 = ["john123", "alex222", "sandraW"]; // returns false
 * because sandraW has no number
 * 
 * const usernames3 = ["john_123", "alex222", "sandra1"]; // returns false
 * because john_123 contains an invalid character
 * 
 * Notes:
 * 
 * You will always be given an array with at least 1 string to check.
 */

import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {

        // String usernames1[] = { "john123", "alex222", "sandra1" };

        // System.out.println(charactersLong(usernames1));
        // System.out.println(containOneLowerCaseLetter(usernames1));
        // System.out.println(containOneNumber(usernames1));
        // System.out.println(containOnlyNumbersLowerCaseLetters(usernames1));

        int n = 0;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s1.nextInt();
        String usernames[] = new String[n];
        System.out.println("Enter all the usernames:");
        for (int i = 0; i < n; i++) {
            usernames[i] = s2.nextLine();
        }

        if (charactersLong(usernames) && containOneLowerCaseLetter(usernames) && containOneNumber(usernames)
                && containOnlyNumbersLowerCaseLetters(usernames)) {
            System.out.println("Resultado : " + true);
        } else {
            System.out.println("Resultado : " + false);
        }
    }

    // it is between 6-10 characters long

    public static boolean charactersLong(String[] array) {
        boolean varBool = true;
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
            if (!sizeUsername(array[i])) {
                varBool = false;
            }
        }
        return varBool;
    }

    public static boolean sizeUsername(String username) {
        if (username.length() >= 6 && username.length() <= 10) {
            return true;
        }
        return false;
    }

    // contains at least 1 lowercase letter;

    public static boolean containOneLowerCaseLetter(String[] array) {
        boolean varBool = true;
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
            if (!itHasLowerCase(array[i])) {
                varBool = false;
            }
        }
        return varBool;
    }

    public static boolean itHasLowerCase(String username) {
        for (int i = 0; i < username.length(); i++) {
            if ((int) username.charAt(i) >= 97 && (int) username.charAt(i) <= 122) {
                return true;
            }
        }
        return false;
    }

    // contains at least 1 number;

    public static boolean containOneNumber(String[] array) {
        boolean varBool = true;
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
            if (!itHasNumber(array[i])) {
                varBool = false;
            }
        }
        return varBool;
    }

    public static boolean itHasNumber(String username) {
        for (int i = 0; i < username.length(); i++) {
            if ((int) username.charAt(i) >= 48 && (int) username.charAt(i) <= 57) {
                return true;
            }
        }
        return false;
    }

    // contains only numbers and lowercase letters.

    public static boolean containOnlyNumbersLowerCaseLetters(String[] array) {
        boolean varBool = true;
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
            if (!itHasOnlyNumberAndLowerCaseLetter(array[i])) {
                varBool = false;
            }
        }
        return varBool;
    }

    public static boolean itHasOnlyNumberAndLowerCaseLetter(String username) {
        for (int i = 0; i < username.length(); i++) {
            if ((int) username.charAt(i) < 48 || ((int) username.charAt(i) > 57 && ((int) username.charAt(i) < 97)
                    || (int) username.charAt(i) > 122)) {
                return false;
            }
        }
        return true;
    }
}
