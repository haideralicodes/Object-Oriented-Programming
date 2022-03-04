public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(){
        // Default Constructor
    }

    public QuadraticEquation(double x, double y){
        // Two-Argument Constructor
        a = x;
        b = y;
    }

    public void display(){
        System.out.println("value of a is: " + a);
        System.out.println("value of b is: " + b);
        System.out.println("value of c is: " + c);
    }

    public void setValues(double x, double y, double z){
        if(x < 0.0 && y < 0.0 && z < 0.0){
            System.out.println("Negative values are not allowed");
        }
        else{
            a = x;
            b = y;
            c = z;
        }
    }

    //return double
    public double getDiscriminant(){
        double discriminant = ((b*b)-4*(a*c));
        return discriminant;
    } 

    public boolean checkIfDescriminantIsGretaerThan100(){
        double disc = getDiscriminant();
        if(disc > 100.0){
            return true;
        }
        else{
            return false;
        }
    }
}
