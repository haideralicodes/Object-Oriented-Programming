import java.util.Scanner;

public class question8 {
    public static void main(String args[]){

        int[] array = new int[10];

        reverseArrayElements(array);

    }

    public static void reverseArrayElements(int[] myArray){

        Scanner input  = new Scanner(System.in);

        //  loop for entering the array elements
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = input.nextInt();
        }

        for(int i = myArray.length; i > 0; i--){
            System.out.print(myArray[i] + " ");
        }
    }
}
