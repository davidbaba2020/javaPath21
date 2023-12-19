package org.example;

import java.util.Arrays;

public class MainFact {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetPermutation = 1_000_000;

        String permutation = getNthPermutation(nums, targetPermutation);
        System.out.println("The millionth lexicographic permutation is: " + permutation);
    }

    public static String getNthPermutation(int[] nums, int n) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);

        StringBuilder sb = new StringBuilder();
        int[] factorials = new int[nums.length];
        factorials[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int index = (n - 1) / factorials[i];
            n -= index * factorials[i];

            for (int j = 0; j < nums.length; j++) {
                if (!used[j]) {
                    if (index == 0) {
                        sb.append(nums[j]);
                        used[j] = true;
                        break;
                    }
                    index--;
                }
            }
        }
        return sb.toString();
    }
}



//import java.math.BigInteger;

//public class Main {
//    public static void main(String[] args) {
//        BigInteger factorial = BigInteger.ONE;
//
//        for (int i = 1; i <= 100; i++) {
//            factorial = factorial.multiply(BigInteger.valueOf(i));
//        }
//
//        // Find the sum of digits in the factorial
//        String factorialStr = factorial.toString();
//        int sum = 0;
//        for (int i = 0; i < factorialStr.length(); i++) {
//            sum += factorialStr.charAt(i) - '0';
//        }
//
//        System.out.println(sum);
//    }
//}

//
//import java.math.BigInteger;
//        import java.util.HashMap;
//        import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        int number = getTriangleNumberWithOverNDivisors(500);
//        System.out.println(number);
//    }
//
//
//    public static int calculateNthTriangleNumber(int n) {
//        return (n * (n + 1)) / 2;
//    }
//
//
//    public static int countDivisors(int number) {
//        Map<Integer, Integer> primeFactors = new HashMap<>();
//        int temp = number;
//        for (int i = 2; i <= temp / i; i++) {
//            while (temp % i == 0) {
//                primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
//                temp /= i;
//            }
//        }
//        if (temp > 1) {
//            primeFactors.put(temp, primeFactors.getOrDefault(temp, 0) + 1);
//        }
//
//        int count = 1;
//        for (int exponent : primeFactors.values()) {
//            count *= (exponent + 1);
//        }
//        return count;
//    }
//
//
//    public static int getTriangleNumberWithOverNDivisors(int n) {
//        int index = 1;
//        while (true) {
//            int triangleNumber = calculateNthTriangleNumber(index);
//            int divisors = countDivisors(triangleNumber);
//            if (divisors > n) {
//                return triangleNumber;
//            }
//            index++;
//        }
//    }
//}
