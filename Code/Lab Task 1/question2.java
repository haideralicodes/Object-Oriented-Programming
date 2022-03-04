import java.util.Scanner;

public class question2 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int row = sc.nextInt();
            pattern(row);
        }
    }

    public static void pattern(int row){
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= i+2; j++){
        if(j == 1 || j == i+2){
                System.out.print(i);
                }
        else{
            System.out.print("*");
        }           
            }
            System.out.println();
        }
    }
}