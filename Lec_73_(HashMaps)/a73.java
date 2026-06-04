import java.util.*;

public class a73{

    public static void main(String arr[]){
        
        Map<String , String> company = new HashMap<>();
 
        // put
        company.put("Founder" , "Anshul");
        company.put("Co-Founder" , "Siddharth");
        company.put("HR" , "Ayush");
        company.put("Manager" , "Rahul");

        // for(String key : company.keySet()){
        //     System.out.println(key + " - " + company.get(key));
        // }

        // remove
        company.remove("Manager");

        // for(String key : company.keySet()){
        //     System.out.println(key + " - " + company.get(key));
        // }

        
        // replace
        company.replace("HR" , "Rahul");

        // for(String key : company.keySet()){
        //     System.out.println(key + " - " + company.get(key));
        // }

        company.replace("HR" , "Rahul" , "Ayush");

        // for(String key : company.keySet()){
        //     System.out.println(key + " - " + company.get(key));
        // }

        // -------------------------------------------------------------------------- // 

        company.put("Manager" , "Rahul");

        for(String key : company.keySet()){
            System.out.println(key + " - " + company.get(key));
        }


    }
}