import java.io.*;

public class b83 {
    
    public static void main(String arr[]) throws IOException{

        FileReader fr = new FileReader("D:\\JAVA\\Core & Advance Java\\Lec_83_(BufferedReader)\\test.txt");

        BufferedReader br = new BufferedReader(fr);

        // Read String type Data from a file

        String str = br.readLine();

        while(str != null){
            System.out.println(str);
            str = br.readLine();
        }

        // Read Integer type data from a file

        String[] strArr = br.readLine().split(" ");

        int[] intArr = new int[strArr.length];

        for(int i = 0; i < strArr.length; i++){

            intArr[i] = Integer.parseInt(strArr[i]);
            System.out.println(intArr[i]);
        }

        
    }

}
