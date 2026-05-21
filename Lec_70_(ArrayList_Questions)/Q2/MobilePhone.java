import java.util.*;

public class MobilePhone {

    public void modifyContacts(ArrayList<Contacts> list, int index, Contacts c) {
        list.set(index, c);
        System.out.println("Your new updates Contact List is : ");
        printList(list);
    }

    public int findIndex(ArrayList<Contacts> list, Contacts c) {
        System.out.println("The index is : " + list.indexOf(c));
        return list.indexOf(c);
    }

    public void printList(ArrayList<Contacts> list) {
        for (Contacts c : list) {
            System.out.println(c.getName() + " " + c.getNumber());
        }
    }

}
