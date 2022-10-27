package NestedLoops.MoreExercises;

import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLevCoins = Integer.parseInt(scanner.nextLine());
        int twoLevCoins = Integer.parseInt(scanner.nextLine());
        int fiveLevCoins = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        int currentSum = 0;

        for (int one = 0; one <= oneLevCoins * 1; one++) {
            for (int two = 0; two <= twoLevCoins * 2; two+= 2) {
                for (int five = 0; five <= fiveLevCoins * 5; five+= 5) {
                    currentSum = one + two + five;
                    if (currentSum == sum) {
                        int onesCount = one / 1;
                        int twosCount = two / 2;
                        int fivesCount = five / 5;

                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", onesCount, twosCount, fivesCount, currentSum);
                    }
                }
            }
        }
    }
}
