public class Student {
    
    private String Name;
    private String Id;

    public Student(String name , String Id){
        this.Name = name;
        this.Id = Id;
    }

    public String getName(){
        return Name;
    }

    public String getId(){
        return Id;
    }
}
