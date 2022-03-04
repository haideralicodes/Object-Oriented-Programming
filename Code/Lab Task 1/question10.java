import java.util.Scanner;

public class question10 {
    public static void main(String args[]){

        System.out.print("Enter student email: ");
        Scanner sc = new Scanner(System.in);
        String a  = sc.next();
        String[] b = a.split("@gmail.com");
        
        stringSplit(b);
    }
    public static void stringSplit(String[] array){
        for(int i = 0; i < array.length; i++){
        System.out.print(array[i]);    
        }
    }
}


