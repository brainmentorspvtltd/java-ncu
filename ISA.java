
 abstract class Account{
	double balance;
	String name;
	String type;
	Account(){
		type = "Account";
		System.out.println("Account Class Parent Default Constructor Call");
	}
	Account(String name, String type){
		this();
		System.out.println("Account Class Param Cons Call");
		this.name = name;
		this.type = type;
	}
	void deposit() {
		System.out.println("Account class Deposit Call");
	}
	
	abstract void roi();
//	void roi() {
//		System.out.println("ROI 4%");
//	}
}
class SavingAccount extends Account{
	String type ;
	int limitOfTrans;
	
	SavingAccount(){
		super("Amit", "Account"); // explicit call
		// implicit super call to parent default constructor
		//super(); // Calling Parent Class Constructor
		type = "Saving";
		System.out.println("Saving Account Default Constructor Call");
	}
	SavingAccount(int limitOfTrans){
		// super or this constructor call , it must on first line
		this(); // It is calling same class default constructor
		 //super(); // calling parent class default constructor
		System.out.println("SavingAccount Param Cons Call");
		this.limitOfTrans = limitOfTrans;
	}
	void doorToDoorService() {
		System.out.println("SA Door To Door Service");
	}
	@Override
	void roi() {
		//super.roi();
		System.out.println("ROI of Saving Account is 5%");
	}
	void print() {
		System.out.println(type + " "+super.type); // this.type
	}
}
class CurrentAccount extends Account{
	void odLimit() {
		System.out.println("CA OD Limit");
	}
	@Override
	void roi() {
		System.out.println("ROI 6% pay");
	}
}


public class ISA {
	
	void accountCaller(Account account){
		System.out.println("**************************************");
		account.deposit();
		account.roi();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		if(account instanceof SavingAccount) {
			SavingAccount sa = (SavingAccount) account; // account casted to SavingAccount (Downcasting)
			sa.doorToDoorService();
			sa.print();
		}
		else
		if(account instanceof CurrentAccount) {
			((CurrentAccount) account).odLimit(); // Downcasting
		}
	}

	public static void main(String[] args) {
		ISA isa = new ISA();
		//isa.accountCaller(new Account());
		isa.accountCaller(new SavingAccount());
		isa.accountCaller(new CurrentAccount());
//		Account account = new CurrentAccount();
//		account.deposit();
//		account.roi();
//		account.doorToDoorService();
//		account.print();
		
//		SavingAccount sa = new SavingAccount(5); // calling child Param Cons Call
//		// Calling Default Constructor of Saving Account
//		sa.deposit();
//		sa.roi();
//		sa.doorToDoorService();
//		sa.print();
//		System.out.println("*************************************");
//		CurrentAccount ca = new CurrentAccount();
//		ca.deposit();
//		ca.roi();
//		ca.odLimit();

	}

}
