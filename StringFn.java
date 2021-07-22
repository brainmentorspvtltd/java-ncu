public class StringFn {
   public static void main(String[] args) {
       String name = "Amit";
       String name2 = "AMIT";
       System.out.println(name == name2);
       System.out.println(name.equals(name2));
       System.out.println(name.equalsIgnoreCase(name2));
       System.out.println("ram".compareTo("amit"));
       System.out.println(name.endsWith("it"));
       System.out.println(name.startsWith("am"));
   }
}
