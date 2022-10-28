package NestedLoops.MoreExercises;

import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fistNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int firstDiff = Integer.parseInt(scanner.nextLine());
        int secondDiff = Integer.parseInt(scanner.nextLine());

        for (int a = fistNum; a <= fistNum + firstDiff; a++) {
            for (int b = secondNum; b <= secondNum + secondDiff; b++) {
                if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0 && a % 7 != 0 && b % 2 != 0 && b % 3 != 0 && b % 5 != 0 && b % 7 != 0) {
                    System.out.printf("%s%s\n", a, b);
                }
            }

            }
        }

        }
