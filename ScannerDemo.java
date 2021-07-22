import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Rollno");
        int rollNo = scanner.nextInt(); // space or enter
        System.out.println("Enter the Full Name ");
        scanner.nextLine(); // eat the \n coming from the rollNo
        String name = scanner.nextLine(); // enter \n
        System.out.println("Enter the College Name");
        String collegeName = scanner.next();
        System.out.println("Enter the Fees");
        double fees = scanner.nextDouble();
        System.out.println("rollNo "+rollNo);
        System.out.println("Name "+name);
        System.out.println("Fees "+fees);
        System.out.println("CollegeName"+collegeName);
        //scanner.close(); //when buffer closed it close the input stream
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the city");
        String city = scanner2.next();
        System.out.println("City "+city);
        scanner2.close();
        scanner.close();
    }
}
