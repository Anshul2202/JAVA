class a12 {

    public static void main(String arr[]) {

        // ---------- String -------------

        String name = "Anshul";
        System.out.println(name);

        // Sring concatination.........

        String fullName = name + " " + "Gupta";
        System.out.println(fullName);

        // Strings are immutable....

        String str1 = "abc";
        str1 = str1 + "efg";

        System.out.println(str1);

        // Here the compiler shows no error because it created a new string by the name
        // str1 and deleted the old string str1
    }
}