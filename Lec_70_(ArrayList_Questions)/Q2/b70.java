import java.util.ArrayList;

public class b70 {
    
    public static void main(String arr[]){

        ArrayList<Contacts> contactList = new ArrayList<>();

         contactList.add(Contacts.createContact("Anshul" , "757104365"));
         contactList.add(Contacts.createContact("Shreya", "9715890943"));
         contactList.add(Contacts.createContact("Siddharth", "9415158743"));
         contactList.add(Contacts.createContact("Rahul", "9843673235"));
         contactList.add(Contacts.createContact("Ayush" , "8754328954"));


        MobilePhone m1 = new MobilePhone();

        m1.printList(contactList);
        
        Contacts newContact1 = Contacts.createContact("Aman", "8756349078");
        m1.modifyContacts(contactList, 4, newContact1);

        m1.findIndex(contactList, newContact1);
        
    }
}
