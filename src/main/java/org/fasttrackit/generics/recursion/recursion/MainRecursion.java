package org.fasttrackit.generics.recursion.recursion;

import java.util.HashMap;
import java.util.Map;

public class MainRecursion {
    public static Map<Long, Long> cache = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(sumRecurisionNumbers(10));

        int result = sumRecursionIntegerNumbers(1);
        System.out.println(result);

        String word = "mom";
        System.out.println(palindromeWordRecursion("mom"));
        System.out.println(palindromeWordRecursion2("mom"));

        int number = 4821;
        int sum = sumOfDigitsOfNumber(number);
        System.out.println("Sum of digit: " + number + " is " + sum);

        int i = 10;
        int result1 = fibonacci(i);
        Long result2 = fibonacciCache(i);
        System.out.println("The " + i + " th fibonacci number is " + result1);
        System.out.println("The " + i + " th fibonacci cache number is " + result2);
    }

    //sumOfNumbers
    private static int sumRecurisionNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecurisionNumbers(n - 1);
    }

    //sumOfEvenNumbers
    private static int sumRecursionIntegerNumbers(int n) {
        if (n > 10) {
            return 0;
        }
        if (n % 2 == 0) {
            return n + sumRecursionIntegerNumbers(n + 2);
        } else {
            sumRecursionIntegerNumbers(n + 1);
        }
        return n + sumRecursionIntegerNumbers(n - 1);
    }

    //Palindrome- first method
    private static boolean palindromeWordRecursion(String word) {

        if (word.length() <= 3) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() + 1)) {
            return palindromeWordRecursion(word.substring(1, word.length() + 1));
        } else {
            return false;
        }
    }

//Palindrome-second method

    private static boolean palindromeWordRecursion2(String word) {
        if (word.length() <= 0) {
            return false;
        }
        if (word.charAt(2) == 'm' || word.charAt(0) == 'm') {
            return true;
        } else {
            return containsLetterm(word.substring(1));
        }
    }

    private static boolean containsLetterm(String substring) {
        return false;
    }

    //sum of digit of a number
    private static int sumOfDigitsOfNumber(int n) {
        if (n < 10) {
            return n;
        }
        int lastDigit = n % 10;
        int remainingDigits = n / 10;
        return lastDigit + sumOfDigitsOfNumber(remainingDigits);
    }

    // fibonacci
    private static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    //fibonacciCache
    private static Long fibonacciCache(long i) {
        if (i == 1 || i == 0) {
            return 1L;
        }
        if (cache.containsKey(i)) {
            return cache.get(i);
        }
    long firstResult = fibonacciCache(i-1);
    long secondResult = fibonacciCache(i-2);
    long result2 = firstResult + secondResult;
    cache.put(i, result2);
    return result2;
    }
}


