package runapplication;
import java.util.Scanner;
public class RunApplication {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       // Getting cricketers name from the user
        System.out.println("The cricketer name: ");
        String batsmanName = scanner.nextLine();
        
        // getting the stadium name
        System.out.println("Enter the stadium: ");
        String stadiumName = scanner.nextLine();
        
        // total runs
        System.out.println("Enter the total runs scored by " + batsmanName + "at" + stadiumName + ":" );
        int totalRuns = scanner.nextInt();
        
        // creating an object for the cricket runs scored
        CricketRunsScored cricketer = new CricketRunsScored(batsmanName, stadiumName, totalRuns);
        
        // spacing
        System.out.println();
        
       cricketer.printReport();
       
       scanner.close();
    }
    
}
