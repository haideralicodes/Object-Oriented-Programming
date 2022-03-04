public class Rectangle {

    //class data members
    int length;
    int width;
    double height;

    // setting Length and width
    public void setValues(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }
    
// showing the set properties
    public void display(){
        System.out.println("The length of Rectange is "+ length);
        System.out.println("The width of Rectange is "+ width);
        System.out.println("The height of Rectange is "+ height);
    }

    
// calculation of Some properties of Rectangle (Behaviours/methods)
    double calculateArea(){
        return width*length;

    }

    double calculatePerimeter(){
        return 2*(length+width);
    }

    double calculateVolume(){
        return length*width*height;
    }

}
