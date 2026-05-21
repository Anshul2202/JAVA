public class Contacts {
    
    private String name;
    private String phoneNo;

    public Contacts(String name , String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return phoneNo;
    }
}
