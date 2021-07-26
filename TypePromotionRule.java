

class P{
//	int show(int x) {
//		System.out.println("int x");
//		return 0;
//	}
	
//	long show(long x) {
//		System.out.println("long x");
//		return 0;
//	}
	
	void show(short x) {
		System.out.println("short x");
		
	}
	
	void show(byte x) {
		System.out.println("byte x");
		
	}
	
//	void show(double x) {
//		System.out.println("double x");
//		
//	}
	
//	void show(Integer x) {
//		System.out.println("Integer x");
//		
//	}
	
	void show(Long x) {
		System.out.println("Long x");
		
	}
	
//	void show(int ...x) {
//		System.out.println("var args x");
//		
//	}
	
	void add(int ...x) {
		int sum = 0;
		for(int y : x) {
			sum+=y;
		}
		System.out.println(sum);
		
	}
}

public class TypePromotionRule {

	public static void main(String[] args) {
		P p = new P();
		//p.show(1);
		p.show((byte)1);
		p.add();
		p.add(1);
		p.add(1,2);
		p.add(1,2,3);
		p.add(1,2,3,4);

	}

}
