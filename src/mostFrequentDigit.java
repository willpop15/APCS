public class mostFrequentDigit {
    public static void main(String[] args){
        System.out.println(liam(66926067));

    }
    public static int liam(int num) {
        int max = Integer.MIN_VALUE;
        int[] array = new int[10];
        int last = 0;
        while(num>0) {
            last = num % 10;
            array[last]++;
            num/=10;
        }
            for(int i = 0; i<array.length; i++) {
                if(array[i]>max) {
                    max = i;
                }

                }

                return max;
    }
        }



