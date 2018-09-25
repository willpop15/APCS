import java.util.Arrays;
public class ArrayPractice {
    public static void randomArray() {
        int randomSize=(int)(Math.random()*10)+1;
        int[] randomArray = new int[randomSize];
        for(int i=0;i<randomArray.length;i++) {
            randomArray[i] = (int) (Math.random() * 10) + 1;
            //System.out.print(i + " "); other way to have printed array
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
