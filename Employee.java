
//public class Employee extends Object{
public class Employee{
	// Instance Variables
	// Data Hiding
	private int id;
	private String name;
	private double salary;
	private String companyName;
	private String panNo;
	private String email;
	private String phone;
	private String address;
	private String dept;
	private String managerName;
	private String title;
	private String location;
	private double bonus;
	
	// Default Constructor (No Arg Cons)
	public Employee(){
		companyName = "Brain Mentors";
	}
	// Parameterized Constructor
	public Employee(int id, String name, double salary) {
		// Employee() - Not this way constructor 
		this(); // Calling Default Constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	
	
//	public Employee(int id, String name, double salary, String panNo, String email, String phone, String address, String city) {
//		
//	}
	
	/*
	public boolean takeInput(int id, String name, double salary) {
		// this keyword 
		// Store the current calling object reference
		if(id>0 && salary>0) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	
		return true;
		}
		return false;
//		else {
//			//System.out.println("Invalid Data");
//			return false;
//		}
	}*/
	
	
	
	
//	@Override
//	public String toString() {
//		return "Id "+id+ " Name  "+name + " Salary "+salary + " Company Name "+companyName;
//		//System.out.println("Id "+id+" Name "+name+ " Salary "+salary);
//	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getBonus() {
		return getSalary() * 0.20; // computed field
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	// By Default every class has default constructor
	/*
	 * public Employee(){}
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + getName() + ", salary=" + salary + ", companyName=" + companyName + "]";
	}
}
