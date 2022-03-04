public class Student {

    //class data members
    String studentName;
    String registrationNumber;
    String[] registeredCourses = new String[5];

    // setting studentName, registrationNumber, registeredCourses
    public void setValues(String stdName, String regNo, String[] regCourses){
        studentName = stdName;
        registrationNumber = regNo;
        registeredCourses = regCourses;
    }

    // showing the set properties
    public void display(){
        System.out.println("The student name is: " + studentName);
        System.out.println("The student Registration Number is: " + registrationNumber);

        for(int i =0; i< registeredCourses.length; i++){
            System.out.println(registeredCourses[i] + " ");
        }
    }

    public void addCourse(String courseName){
        for(int i = 0; i < registeredCourses.length; i++){
            if(registeredCourses[registeredCourses.length-1] != null){
            registeredCourses[i] = courseName;
            }
            else{
                System.out.println("No space in the array!!");
            }
        }
    }

    public void deleteCourse(String courseName){
        
        int count = 0;
        // finding the course name in the array
        for(int i = 0; i < registeredCourses.length; i++){
            if(registeredCourses[i] == courseName){
            count++;
            // deleting the course name in the array
            for(int j = count+1; j < registeredCourses.length; j++){
                registeredCourses[i] = registeredCourses[i+1];
            }
            // printing the new array
            for(int j = count+1; j < registeredCourses.length; j++){
                System.out.print(registeredCourses[i] + " ");
            }
        }
            else{
                System.out.println("No space in the array!!");
            }
        }

    }
    
}
