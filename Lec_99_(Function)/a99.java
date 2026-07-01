import java.util.function.Function;

public class a99{

    public static void main(String arr[]){

        Function<Integer , Integer> f = i -> i * i;

        System.out.println(f.apply(10));

        // -----------------------------------------

        Student99[] stu = {
            new Student99("Anshul" , 87),
            new Student99("Siddharth" , 89),
            new Student99("Aman" , 91),
            new Student99("Ayush", 89),
            new Student99("Rahul" , 87),
        };

        Function<Student99 , String> f2 = s -> {

            int marks = s.getMarks();

            if(marks >= 90){
                return "A";
            }
            else if(marks >= 70){
                return "B";
            }
            else if(marks >= 60){
                return "C";
            }
            else{
                return "D";
            }
        };

        for(Student99 s : stu){

            System.out.println(s.getName());
            System.out.println(s.getMarks());
            System.out.println(f2.apply(s));
            System.out.println();
            
        }
    }
}