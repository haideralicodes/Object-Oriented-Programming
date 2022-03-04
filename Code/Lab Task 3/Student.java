import javax.security.auth.Subject;

public class Student {
    String name;
    double gpa;
    String[] subjects = new String[5];
    String email;

    public Student(){
        //default constructor
    }

    public Student(String n, double g, String[] subj, String e){
        //Four-Argument constructor
        name = n;
        gpa = g;
        subjects = subj;
        email = e;
    }

    public void setValues(String n, double g, String[] subj, String e){
        name = n;
        gpa = g;
        subjects = subj;
        email = e;
    }

    public boolean searchSubject(String subjectName){
        for(int i = 0; i<subjects.length; i++){
            if(subjectName.equalsIgnoreCase(subjects[i])){
                return true;
            }
        }        
            return false;

    }

    
    public boolean checkProbStatus(){
        if(gpa >= 2.0){
            return false;
        }
        else{
            return true;
        }
    }

    //boolean return
    public boolean validateEmail(){
        if(email.contains("@gmail.com")){
            return true;
        }
        else{
            return false;
        }
    }

}
