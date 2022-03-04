//circle class
public class Circle{
    double radius;

    public void setValues(double r){
        radius = r;
    }

    public void display(){
        System.out.print("The radius of the circle is: " + radius);
    }

    public void findDiameter(){
        double diameter = 2*radius;
        System.out.print("The diameter of the circle is: " + diameter);
    }

    public void findCircumfrence(){
        double circumfrence = 2*(3.14)*radius;
        System.out.print("The circumfrence of the circle is: " + circumfrence);
    }

    public void findArea(){
        double area = 2*(3.14)*(radius*radius);
        System.out.print("The area of the circle is: " + area);
    }

}