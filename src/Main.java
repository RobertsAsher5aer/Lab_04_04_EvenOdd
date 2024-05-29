public class Main {
    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        // Initializes the number to examine
        int numToExamine = 3;

        // Checks if the number "inputted" is even or odd based on % 2, and outputs the results
        if(numToExamine % 2 == 0) {
            System.out.println(" ");
            System.out.println("The number " + numToExamine + " is even.");
        } else {
            System.out.println(" ");
            System.out.println("The number " + numToExamine + " is odd.");
        }
    }
}