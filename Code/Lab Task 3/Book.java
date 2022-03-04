public class Book {

    String author;
    String[] chapterName = new String[5];

    public Book(){
        //default cnstructor
    }

    public Book(String auth, String[] chpName){
        if((auth.length()==0) && (chpName.length==0)){
            System.out.println("author name & chapter name is empty!!");
        }
        else{
            author = auth;
            chapterName = chpName;
        }
    }

    public void display(){
        System.out.println("author name is: " + author);
        for(int i =0; i < chapterName.length; i++){
            System.out.println(chapterName[i] + " ");
        }
    }

    public void setValues(String auth, String[] chpName){
        author = auth;
        chapterName = chpName;
    }
    
    public boolean checkIfAuthorNameStartsWithA(){
        if(author.charAt(0) == 'A'){
            return true;
        }
        else{
            return false;
        }
    }

    //boolean return
    public boolean searchChapter(String chpName){
        for(int i =0; i < chapterName.length; i++){
            if(chapterName[i].equals(chpName)){
                return true;
            }
        }
        return false;
    }



}
