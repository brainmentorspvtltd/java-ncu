class Parent{
	int x;
	int y;
	Parent(){
		x = 1;
		y = 2;
	}
	void show() {
		System.out.println("Parent Show Call");
	}
}
class Child extends Parent{
	
	int z ;
	int x;
	Child(){
		// super();
		z = 3;
		x = 10;
		y = 20;
	}
	@Override
	void show() {
		System.out.println("Child Show call");
	}
}
public class Binding {

	public static void main(String[] args) {
		Parent child = new Child(); // Upcasting
		System.out.println(child.x); // variables are bind with class type not with object
		System.out.println(child.y);
		//System.out.println(child.z);
		// method are bind with object not with class type
		child.show(); // Check in parent ,if it is there then look up in child overriding 
	//if overriding present so call overridden version , otherwise call parent version
		
		

	}

}
