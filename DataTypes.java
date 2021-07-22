public  class DataTypes {
    public static strictfp void main(String[] args) {
        int a = 109;
        byte w = (byte)130;
        System.out.println(w);
       double e = 90.54354;
       float e1 = 90.44f;
       char b = 'न';
       System.out.println(b);
       String name = "Amit";
       System.out.println(name.toUpperCase());
       String msg  = "नमस्ते कैसी हो तुम";
        System.out.println(msg);
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb2 = sb;
        System.out.println(sb == sb2);
        sb.append("Hi");
        System.out.println(sb2);
        System.out.println(sb);





    }
}
