package NestedLoops.MoreExercises;

import java.util.Scanner;

public class PasswordGenerator_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNum = Integer.parseInt(scanner.nextLine());
        int lNum = Integer.parseInt(scanner.nextLine());

        for (int i1 = 1; i1 < nNum; i1++)  {
            for (int i2 = 1; i2 < nNum; i2++) {
                for (int i3 = 'a'; i3 < 'a'+ lNum; i3++) {
                    for (int i4 = 'a'; i4 < 'a'+ lNum; i4++) {
                        for (int i5 = 2; i5 <= nNum; i5++)
                        {
                            if (i5 > i1 && i5 > i2)
                            {
                                System.out.printf("%d%d%s%s%d ", i1, i2, (char) i3, (char) i4, i5);
                            }
                        }
                    }
                }
            }
        }
    }
}
