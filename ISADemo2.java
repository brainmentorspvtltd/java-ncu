

class A{
	int x ;
	A(){
		 x= 10;
		System.out.println("A Cons Call Default");
	}
	A(int x){
		this.x = x;
		System.out.println("A Param Cons Call");
	}
}
class B extends A{
	int x;
	B(){
		x = 20;
		System.out.println("B Default Cons Call");
	}
	B(int x){
		super(3);
		this.x = x;
		System.out.println("B Param Cons Call");
	}
}
class C extends B{
	int x;
	C(){
		x = 30;
		System.out.println("C Default Cons Call");
	}
	C(int x){
		super(2);
		this.x = x;
		System.out.println("C Param Cons Call");
		int result = x + this.x + ((B)this).x + ((A)this).x;
		System.out.println(" Result is "+result);
	}
	
}

public class ISADemo2 {

	public static void main(String[] args) {
		C c  = new C(1);

	}

}
