public class b103 {

    public static void main(String arr[]) {

        // .replaceAll()
        String s1 = "abc9677823xyz";

        String s2 = s1.replaceAll("\\d", "");
        System.out.println(s2);

        System.out.println(s1.replaceAll("\\d", "*"));

        System.out.println(s1.replaceAll("\\d+", "*"));

        System.out.println(s1.replaceAll("[a-z]", ""));

        // .split()
        String s3 = "Java Python C++";

        String[] strArr = s3.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        String s4 = "Anshul99Siddharth99Rahul";

        String[] strArr2 = s4.split("\\d+");
        System.out.println(strArr2[0]);
        System.out.println(strArr2[1]);
        System.out.println(strArr2[2]);
    }
}
