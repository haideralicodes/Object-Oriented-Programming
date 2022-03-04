public class University {

    String uniName;
    String location;
    String rectorName;
    String[] departments = new String[20];

    
    public University(){
        //no-argument constructor
    }

    public University(String uName, String rectName){
        //two-arguments constructor
        uniName = uName;
        location = ulocation;
    }

    public University(String uName, String ulocation, String rectName, String[] dep){
        uniName = uName;
        location = ulocation;
        rectName = rectName;
        
        if(dep.length<=departments.length){
            for(int i=0;i<dep.length;i++){
                departments[i] = dep[i];
            }
        }
        else{
            for(int i=0; i<departments.length;i++){
                departments[i] = dep[i];
            }
        }
    }

    //methods
    public void display(){
        System.out.println("uni name is: " + uniName);
        System.out.println("uni location is: " + location);
        System.out.println("uni rector name is: " + rectName);
      
        //for printing departments name
        for(int i=0;i<departments.length;i++){
            if(departments[i]!= null){
                System.out.println(departments[i]);
                }
            } 
        }

public void setValues(String uName, String ulocation, String rectName, String[] dep){
            uniName = uName;
            location = ulocation;
            rectName = rectName;
            
            if(dep.length<=departments.length){
                for(int i=0;i<dep.length;i++){
                    departments[i] = dep[i];
                }
            }
            else{
                for(int i=0; i<departments.length;i++){
                    departments[i] = dep[i];
                }
            }
        }

    public void addDepartments(String depName){
        if(departments[departments.length-1] != null){
            System.out.println("The department list is already filled! we cannot add "+ depName); 
        }
        else{
            for(int i= 0; i < departments.length; i++){
                if(departments[i]==null){
                    departments[i] = depName;
                    break;
            }        
        }
    }
}

    public boolean checkIfLocatedInCapital(){
        if(location.equals("Islamabad")){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean searchDepartment(String dept){
        for(int i =0; i < departments.length; i++){
            if(departments[i].equalsIgnoreCase(dept)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

