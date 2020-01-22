package dp;

import java.util.Scanner;

public class Main {

    static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        array = new int[count];

        for (int i = 0; i <count; i++) {
            array[i] = scanner.nextInt();
        }

        int problemCount = scanner.nextInt();

        for (int i = 0; i < problemCount; i++) {
            if (dp(scanner.nextInt() - 1, scanner.nextInt() - 1 )) {
                System.out.println(1);
            } else {
                System.out.println(0);

            }
        }

    }

    private static boolean dp(int start, int end) {
        if (start == end || start > end) {
            return true;
        }

        boolean result = array[start] == array[end] ? true : false;

        int middle = start + (end - start) / 2;

        for (int i = start + 1; i <= middle; i++) {
            result = result && dp(start + i, end - i);
            if (!result) {
                return false;
            }
        }

        return true;

    }
}
