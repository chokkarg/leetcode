package com.chokkar.leetcode.twosum;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        int[] arrayValue = new int[5];
        int targetValue;
        boolean found = false;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + i + " array value");
            arrayValue[i] = scanner.nextInt();
        }

        System.out.print("You entered array values: ");
        for (int arrValue : arrayValue) {
            System.out.print(arrValue + " ");
        }

        System.out.println("\nEnter Target value ");
        targetValue = scanner.nextInt();
        System.out.println("Target Value " + targetValue);

        // Take each value and find the complement to match with the target value
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arrayValue[i] + arrayValue[j] == targetValue) {
                    System.out.println("Indices with values that add up to the target value are: " + i + " ("
                            + arrayValue[i] + ")" + ", " + j + " (" + arrayValue[j] + ")");
                    found = true;
                    break; // Stop searching further pairs once one is found
                }
            }
            if (found) {
                break; // Stop searching altogether once one pair is found
            }
        }

        if (!found) {
            System.out.println("No two elements add up to the target value.");
        }
    }
}
