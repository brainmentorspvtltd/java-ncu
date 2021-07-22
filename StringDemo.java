import java.io.File;
public class StringDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String name = "Amit".intern(); // "Amit".intern()
        String name2= "Amit".intern();
        //String msg = "Welcome User"; // 1L
        System.out.println(name == name2); // true
        String name3 = new String("Amit").intern();
        System.out.println(name == name3); // true
        System.out.println(name.equals(name3));
        //File file = new File("abcd.txt");

    }
}
