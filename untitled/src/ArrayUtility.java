import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of Array You Want: ");
        int lengthOfArray = input.nextInt();
        int[] myArray = new int[lengthOfArray];

        int i = 0;
        while(i < lengthOfArray){
            System.out.print("enter your " + ( i + 1 ) + " array value: ");
            myArray[i] = input.nextInt();
            i++;
        }
    return myArray;
    }
}
