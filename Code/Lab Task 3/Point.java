public class Point {
    int x;
    int y;

    public Point(){
        //Default Constructor
    }

    public Point(int a, int b){
        //Two-Argument Constructor
        if((a < 0 && b < 0) || (a > 0 && b > 0)){
            x = a;
            y = b;
        }
    }

    public void display(){
        System.out.println("value of x is: " + x);
        System.out.println("value of y is: " + y);
    }

    public void setValues(int a, int b){
        x = a;
        y = b;
    } 

    public void move(int dx, int dy){
        x = x + dx;
        y = y + dy;
        System.out.println("moved value of x & y is: (" + x + ", " + y + ")");
    } 

        public boolean checkOrigin(){
            if((x == 0) && (y == 0)){
                return true;
            }
            else{
                return false;
            }
        }

}
