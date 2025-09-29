package runapplication;
// Subclass that extends Cricket class
public class CricketRunsScored extends Cricket {
    
   
    public CricketRunsScored(String batsmanName, String stadiumName, int totalRunsScored) {
        super(batsmanName, stadiumName, totalRunsScored);
    }
    
    // Method to print the batsman runs scored report
    public void printReport() {
        System.out.println("BATSMAN RUNS SCORED REPORT");
        System.out.println("**************************");
        System.out.println("CRICKET PLAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }
}

