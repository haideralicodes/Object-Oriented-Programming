import java.util.Scanner;

public class question9 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        System.out.print("Enter the array elements: ");

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        eliminateDuplicateElements(array);

    }
    
    public static void eliminateDuplicateElements(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i+1] == myArray[i]){
                continue;
            }
            else{
                System.out.print(myArray[i] + " ");
            }
        }
    }
}
