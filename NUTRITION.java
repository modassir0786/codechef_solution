/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{



    public static void main(String[] args) {
        // Create a Scanner object to read the input
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases, T
        int T = sc.nextInt();

        // Loop through T times
        for (int t = 0; t < T; t++) {
            // Read the number of fruits, N
            int N = sc.nextInt();

            // Create an array to store the types of the fruits, A
            int[] A = new int[N];

            // Create an array to store the nutrition values of the fruits, B
            int[] B = new int[N];

            // Create a HashMap to store the maximum nutrition value for each type
            HashMap<Integer, Integer> maxNutrition = new HashMap<>();

            // Read the types of the fruits
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // Read the nutrition values of the fruits
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
                // Update the maximum nutrition value for the current type
                maxNutrition.put(A[i], Math.max(maxNutrition.getOrDefault(A[i], 0), B[i]));
            }

            // Initialize the maximum possible sum of nutrition values
            int maxSum = 0;

            // Loop through the HashMap and add the values to the sum
            for (int value : maxNutrition.values()) {
                maxSum += value;
            }

            // Print the maximum possible sum of nutrition values
            System.out.println(maxSum);
        }

        // Close the Scanner object
        sc.close();
    }
}
