import java.util.Scanner;

public class question6 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter the array elements: ");
        int[] array1 = new int[size];

        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }

        lowestArrayElement(array1);
        highestArrayElement(array1);


    }

    public static void lowestArrayElement(int[] array1){
        int lowest = array1[0];
        for(int i = 0; i < array1.length; i++){
            if(array1[i] < lowest){
                lowest = array1[i];
            }
        }
        System.out.println("The lowest number in the array is: " + lowest);
    }
    public static void highestArrayElement(int[] array1){
        int highest = 0;
        for(int i = 0; i < array1.length; i++){
            if(array1[i] > highest){
                highest = array1[i];
            }
        }
        System.out.println("The highest number in the array is: " + highest);
    }

}
