import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Input {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Age");
        int age = Integer.parseInt(br.readLine());
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Salary");
        double salary = s.nextDouble();

    //throws Exception{
        Scanner scanner = new Scanner("Hello How are You \n I am Fine Thank U\n");
        // int wordCount = 0;
        // while(scanner.hasNext()){
        //     scanner.next();
        //     wordCount++;
        //    // System.out.println(scanner.next());
        // }
        // System.out.println("Word Count is "+wordCount);
        int lineCounter = 0;
        while(scanner.hasNextLine()){
            lineCounter++;
            System.out.println(scanner.nextLine());
        }
        System.out.println(lineCounter);

        /*System.out.println("Enter the name");
        Scanner scanner = new Scanner(System.in);
        //String name = scanner.next();
        String name = scanner.nextLine();
        System.out.println(name);
        scanner.close(); */
        //int singleByte = System.in.read();
        //System.out.println(singleByte);
        // Command Line Args
        // System.in
    }
}
