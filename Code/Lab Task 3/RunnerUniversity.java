public class RunnerUniversity {
    public static void main(String args[]){
        University u1 = new University();

        String[] departments = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        u1.setValues("comsats", "islamabad", "ali", departments);
        u1.display();
        u1.addDepartments("11");
        u1.checkIfLocatedInCapital();
        u1.searchDepartment("1");
        
        
    }
}
