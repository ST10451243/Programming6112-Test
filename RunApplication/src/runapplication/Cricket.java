package runapplication;
// Abstract class that stores batsman information
public abstract class Cricket implements ICricket {
   
    private String batsmanName;
    private String stadiumName;
    private int totalRunsScored;
    
    // Constructor that accepts batsman's name, stadium name, and total runs scored
    public Cricket(String batsmanName, String stadiumName, int totalRunsScored) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRunsScored = totalRunsScored;
    }
    
    // Method to get the batsman's name
    public String getBatsman() {
        return batsmanName;
    }
    
    // Method to get the stadium name
    public String getStadium() {
        return stadiumName;
    }
    
    // Method to get the total runs scored
    public int getRunsScored() {
        return totalRunsScored;
    }
}

