package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingNumber = Integer.parseInt(scanner.nextLine());
        int finalNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinations = 0;

        for (int i = startingNumber; i <= finalNumber ; i++) {
            for (int j = startingNumber; j <= finalNumber; j++) {
                combinations++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combinations, i, j, magicNumber);
                    return;
                }
            }
        }
            System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
    }
}