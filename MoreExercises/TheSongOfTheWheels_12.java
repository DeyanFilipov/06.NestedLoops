package NestedLoops.MoreExercises;

import java.util.Scanner;

public class TheSongOfTheWheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int g=1;
        int h=1;
        int j=1;
        int k=1;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (num == a * b + c * d) {
                            if (a < b && c > d) {
                                System.out.printf("%s%s%s%s ", a, b, c, d);
                                counter++;

                                if (counter == 4) {
                                    g=a;
                                    h=b;
                                    j=c;
                                    k=d;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (counter >= 4) {
            System.out.println("");
            System.out.println("Password: "+g+h+j+k+"");
        } else {
            System.out.println("");
            System.out.println("No!");
        }
    }
}