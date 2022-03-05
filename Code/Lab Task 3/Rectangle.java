public class Rectangle {
    int length;
    int width;
    public Rectangle(){
        // Default Constructor
    }

    public Rectangle(int l , int w){
        // Two-Argument Constructor

        length = l;
        width = w;
    }

    public void display(){
        System.out.println("The length of rectangle is: " + length);
        System.out.println("The width of rectangle is: " + width);
    }

    public void setValues(int l, int w){
        if(l < 0 && w < 0){
            System.out.println("length & width can't be zero");
        }
        else{
            length = l;
            width = w;
        }
    }

    public int calculateArea(){
        int area = length * width;
        return area;
    }

    public boolean checkSquare(){
        if(length == width){
            return true;
        } 
        else{
            return false;
        }
    }    
}
