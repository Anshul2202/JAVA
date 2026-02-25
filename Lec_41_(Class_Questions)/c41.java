public class c41 {

    public static void main(String arr[]) {

        student s1 = new student();

        s1.setFirstName("Anshul");
        s1.setLastName("Gupta");
        s1.setMarks(87);

        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getMarks());
        System.out.println(s1.isPass());
        System.out.println(s1.getFullName());
    }
}
