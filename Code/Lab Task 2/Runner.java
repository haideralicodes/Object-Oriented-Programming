public class Runner {
    public static void main(String[] args) {

        // Circle class
        Circle c1 = new Circle();
        c1.setValues(44);
        c1.display();
        c1.getDiameter();
        c1.getCircumfrence();
        c1.getArea();

        //Rectangle class
        Rectangle r1 = new Rectangle();
        r1.setValues(12, 5, 40);
        r1.display();
        r1.calculateArea();
        r1.calculatePerimeter();
        r1.calculateVolume();

        //Student class
        Student ali = new Student();
        String[] regCourses = {"bio", "physics", "chemistry", "math", "urdu"};
        ali.setValues("ali", "sp21-bcs-021", regCourses);
        ali.addCourse("english");
        ali.deleteCourse("math");
    }
}
