import java.util.Scanner;

public class question5 {
    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");

            int size  = sc.nextInt();
            int[] a1 = new int[size];
            System.out.print("Enter the array elements: ");
            for(int i = 0; i < size; i++){
                a1[i] = sc.nextInt();
            }
            myArraySum(a1);
        }

    }

    public static void myArraySum(int[] a1){
        int sumOfArrayElements = 0;
        for(int i = 0; i < a1.length; i++) {
            sumOfArrayElements = sumOfArrayElements + a1[i];
        }

        System.out.println("The sum of array elements is: " + sumOfArrayElements);

        int averageOfArrayElements = sumOfArrayElements/a1.length ;
        System.out.println("The average of array elements is: " + averageOfArrayElements);
    }
}
