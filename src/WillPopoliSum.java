import java.util.Arrays;
import java.util.

public class WillPopoliSum {
    public static final int DIGIT = 25;
    public static void main(String[] args) {
        Scanner file = new Scanner("sum.txt");
        while(file.hasNextLine()) {
            String line = file.nextLine();
            Scanner console = new Scanner(line);
            String number = "" + file.nextInt();
            while(console.hasNextInt()){
                String current = console.next();
                int[] num = new int[DIGIT];
                String[] expand = current.split("");
                for(int i = 0; i<expand.length; i++){
                    num[i]=Integer.parseInt(expand[i]);
                }


            }


        }



    }






}
