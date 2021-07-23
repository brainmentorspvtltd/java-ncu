import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id ");
		int id  = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		Employee ram; // ram is a reference variable
		ram = new Employee(id, name, salary);
		//System.out.println(ram.print());
		System.out.println(ram); // ram.toString();
		ram.setBonus(999);
		System.out.println(ram.getSalary());
		ram.setSalary(ram.getSalary()+ 10000);
		//System.out.println(ram.takeInput(id, name, salary)?ram.print():"Invalid Input");
		scanner.close();
		//ram.print();
//		ram.id =-1001;
//		ram.name = "Ram Kumar";
//		ram.salary = -99000;
//		System.out.println(ram.id);
//		System.out.println(ram.name);
//		System.out.println(ram.salary);
		//Employee shyam = new Employee();
		//shyam.takeInput(1002, "Shyam", 6767);
		//shyam.print();
//		shyam.id = 1002;
//		shyam.name = "Shyam";
//		shyam.salary = 9999;
//		System.out.println(shyam.id);
//		System.out.println(shyam.name);
//		System.out.println(shyam.salary);
		//System.out.println(ram);
		//System.out.println(ram.toString());
		//System.out.println(ram.hashCode());

	}

}
