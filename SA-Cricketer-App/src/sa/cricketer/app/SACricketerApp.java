package sa.cricketer.app;

import java.util.Scanner;

public class SACricketerApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaration and arrays
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};
        String[] batsman = {"Jaques Killis", "Hashim Amla", "AB De Villiers"};

        // 2-dimensional array
        int[][] runs = new int[3][3];

        // Header
        System.out.println("SA Cricketer Application: ");
        System.out.println("-----------------------------------------------");

        // Inputting the runs
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                System.out.println("Enter number of runs scored by " + batsman[p] + " at " + stadiums[i] + ": ");
                runs[i][p] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("-------------------------");
        System.out.println("Total runs at stadiums: ");
        System.out.println("--------------------------");

        int[] stadiumTotal = new int[3];
        int maxRuns = 0;
        String topStadium = "";

        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int m = 0; m < 3; m++) {
                total += runs[i][m];
            }
            stadiumTotal[i] = total;
            System.out.println(stadiums[i] + ": " + total);

            if (total > maxRuns) {
                maxRuns = total;
                topStadium = stadiums[i];
            }
        }

        // Final Display
        System.out.println("----------------------");
        System.out.println("Stadium with the most runs: " + topStadium);
        System.out.println("-----------------------");

        input.close();
    }
}

