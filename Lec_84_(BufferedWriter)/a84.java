import java.io.*;

public class a84 {
    
    public static void main(String arr[]) throws IOException{

        FileWriter fr = new FileWriter("newFile.txt");

        BufferedWriter bw = new BufferedWriter(fr);

        bw.write("I am anshul!");
        bw.newLine();

        bw.write("I am learning java");

        String str = "This line is a test line";

        bw.newLine();
        bw.write(str , 5 , 4);

        bw.close();

    }
}
