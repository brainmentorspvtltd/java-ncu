
public class IfElseSwitchCase {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//if(true) {
		if(a>b) {
			
		}
		else {
			
		}
		//int day = 1;
		//int meal = 1;
		//byte meal = 1;
		//long meal = 1;
		//float meal = 1.0f;
		//String meal = "pizza"; // String support from Java 7 onwards
		char meal = 'P';
		switch(meal) {
		default:
			System.out.println("");
			break;
		//case "pizza":
		case 'P':
			System.out.println("Pizza");
			break;
		case 'D':	
		//case "drink":
			System.out.println("Drinks");
			break;
		
		}

	}

}
