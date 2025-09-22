import java.util.Scanner;
public class Main {
   public static void main() {
        int[] numArray = ArrayUtility.inputArray();
        long sum = sumOfArray(numArray);
        int average = averageOfArray(numArray);
       System.out.println("sum of all array values: " + sum);
       System.out.println("average of all array values: " + average);

   }
    public static long sumOfArray(int[] numArray){
       int i = 0;
       long sum = 0;
       while(i < numArray.length){
           sum = sum + numArray[i];
           i++;
       }
       return sum;
    }
    public static int averageOfArray(int[] numArray) {
       long sum = sumOfArray(numArray);
       return (int) sum/(numArray.length);
    }
}