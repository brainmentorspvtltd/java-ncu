public class ImmutableDemo {
    public static void main(String[] args) {
        //String sql ="select * from product";
        //StringBuilder sb = new StringBuilder("hello"); // Not Synchronized
        StringBuffer sb = new StringBuffer("hello"); // Len 5 // synchronized
        // Len (5) + Cap (16) = 21
        System.out.println(sb.length()); //5
        System.out.println(sb.capacity()); //21
        sb.append(" how are u i am fine thank u");
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // oldcap * 2 + 2 = newcap
        sb.append("lghdfjkghkdfhgkjdfhgjkhfdjkghjkdfhgjkdfhjkghdfjkghjkdfhgkjhdfhdfghfghfghfghfghgfhgf");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        // StringBuffer sb = new StringBuffer("select * from product"); // 16 RS
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // System.out.println(sb);
        // sb.append("type='mobile' and price>90000");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // String type = null;
        // if(type.equals("mobile")){
        //     sql = sql + " type ='mobile'";
        // }
        String name = "Amit";
        String name2 = "Amit";
        System.out.println(name == name2);
        name2 ="Amit Srivastava";
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2);

    }
}
