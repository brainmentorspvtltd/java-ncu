import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
		int x = 100;
		// while(true)
//		while(x<=1000) {
//			System.out.println(x);
//			x++;
//		}
		outer:
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++) {
				if(i==j) {
					break outer; 
					//continue outer;
				}
				System.out.println(i + " "+j);
				
			}
		}
		
		
		int arr [] = {10,20,30,40,50};
//		for(int i = 0 ;i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		// Enhance For Loop (Java 1.5)
//		for(int i : arr) {
//			System.out.println(i);
//		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.forEach((element)->System.out.println(element));
//		for(Integer i : list) {
//			System.out.println(i); 
//			
//		}
//		for(int i : list) {
//			System.out.println(i);
//		}
		
		
		
		

	}

}
