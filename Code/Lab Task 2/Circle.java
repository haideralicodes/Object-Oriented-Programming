public class Circle{

    //class data member
    int radius;

    public void setValues(int r){
        radius = r;
    }

    public void display(){
        System.out.println("The  radius is: " + radius);
    }

    public double getCircumfrence(){
        double circumfrence = (2*Math.PI*radius);
        return circumfrence;
    }

    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public double getDiameter(){
        double diameter = 2*radius;
        return diameter;
    }

    // ...>>Rules :
    // * No static Function in the Class
    // * No arguments in any Function except for set Values.

}