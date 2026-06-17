import java.io.*;

public class a83 {
    
    public static void main(String arr[]) throws IOException{

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        // -------------------------------------------------
        // String Input

        String line = br.readLine();

        System.out.println(line);

        // -------------------------------------------------
        // Integer Input

        String strInt = br.readLine();

        int intVal = Integer.parseInt(strInt);

        System.out.println(intVal);

        // -------------------------------------------------

        // Store in Array

        String[] strArr = br.readLine().split(" ");

        int[] intArr = new int[strArr.length];

        for(int i = 0; i < strArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
            System.out.println(intArr[i]);
        }


    }
}
