import java.util.Scanner;
public class question1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temprature in degree Centigrate: ");
        int temp = sc.nextInt();
        
        temptrature(temp);
    }
        public static void temptrature(int tempratureInCentigrate){
        if(tempratureInCentigrate < 0){
            System.out.println("FREEZING");
        }
        else if(tempratureInCentigrate >= 0 && tempratureInCentigrate <= 15){
            System.out.println("COLD");
        }
        else if(tempratureInCentigrate >= 16 && tempratureInCentigrate <= 30){
            System.out.println("WARM");
        }
        else if(tempratureInCentigrate >= 31 && tempratureInCentigrate <= 40){
            System.out.println("HOT");
        }
        else if(tempratureInCentigrate > 40){
            System.out.println("VERY HOT");
        }
    }
}