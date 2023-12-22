/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
            // Read the total bill, N
            int N = sc.nextInt();

            // Read the number of friends, K
            int K = sc.nextInt();

            // Calculate the fair share for each friend
            double share = (double) N / (K + 1);

            // Initialize the net amount that you paid
            int net = N;

            // Loop through K times
            for (int k = 0; k < K; k++) {
                // Subtract the rounded down amount that each friend paid
                net -= (int) share;
            }

            // Print the net amount that you paid
            System.out.println(net);
        }

        // Close the Scanner object
        sc.close();
    }
}