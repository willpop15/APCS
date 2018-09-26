//this program takes user input about the temperature over a certain number of days and calculates the average and prints how many days' temperatures were above average.
import java.util.Scanner;
import java.util.Arrays;


public class WillPopoliWeatherAnalysisV2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in); //create scanner
        System.out.print("How many days' temperatures? "); //ask for user input
        int days = console.nextInt(); //store user input
        populate(days); //call methods
    }

    public static void populate(int days) {
        int[] temp = new int[days]; //create array
        double sum = 0.0;
        double average = 0.0;
        for (int i = 1; i <= days; i++) { //for loop to go through the whole array
            Scanner input = new Scanner(System.in);
            System.out.print("Day " + i + "'s high temp: ");
            int nexttemp = input.nextInt();
            temp[i-1] = nexttemp; //populate array
            sum++;
            average+=nexttemp;

        }
        calculate(average, sum, temp);
        hottestAndColdest(temp, days);


    }
    public static void calculate(double average, double sum, int[] temp) {
        double finalaverage = average / sum;
        finalaverage = Math.round(finalaverage * 10.0) / 10.0; //round to nearest tenth
        System.out.println("Average temp = " + finalaverage);

        int aboveavg = 0;
        for (int j = 1; j <= temp.length; j++) {
            if(temp[j-1] > finalaverage){ //go through array and check to see if each entity is above or below average temp
                aboveavg++;
            }
        }
        System.out.println(aboveavg + " days were above average."); //print
    }
    public static void hottestAndColdest(int[] temp, int days) {
        System.out.println("Temperatures: " + Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println("Two coldest days: " + temp[0] + ", " + temp[1]);
        System.out.println("Two hottest days: " + temp[temp.length-1] + ", " + temp[temp.length-2]);
    }
}