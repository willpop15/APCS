import java.util.Arrays;
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 1,};
        oliverAlgo(array);

    }

    //oliver's algorithim reverses the array by using a temperary array
    public static void oliverAlgo(int[] array) {
        int[] temparray = new int[array.length];

        for(int i =temparray.length-1; i>=0; i--) {
            temparray[i] = array[array.length-1-i];
        }
        System.out.println(Arrays.toString(temparray));
    }
        //michelle and matts algorithim

        public static void michelleAlgo(int[] array){
            int temp;
            for(int i=0;i<array.length/2;i++) {
                temp = array[i];
                array[i] = array[array.length-i-1];
                array[array.length-1-i] = temp;
            }
        }
}
