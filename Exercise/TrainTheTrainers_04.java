package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judge = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double allRates = 0;
        int count = 0;

        while (!command.equals("Finish")) {

            String presentation = command;
            double gradesForPresentation = 0;

            for (int i = 1; i <= judge ; i++) {
                double rate = Double.parseDouble(scanner.nextLine());
                allRates += rate;
                gradesForPresentation += rate;
                count++;
            }
            System.out.printf("%s - %.2f.%n", presentation, gradesForPresentation / judge);
            command = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allRates / count);
    }
}