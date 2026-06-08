public class a75 {
    
    public static void main(String arr[]){

        Student s1 = new Student("Anshul" , "1");
        Student s2 = new Student("Siddharth" , "2");
        Student s3 = new Student("Siddharth" , "2");
        Student s4 = s1;

        // equals()

        System.out.println(s1.equals(s2));  // false
        System.out.println(s2.equals(s3));  // false
        System.out.println(s1.equals(s4));  // true

        // hashCode()

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }
}
