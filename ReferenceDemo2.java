import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
class Song{
    String name;
    double price;
    String artistName;
    String albumName;
}
public class ReferenceDemo2 {
    public static void main(String[] args) {
        //int e = 111;
        //Integer ee = 111; // Integer Literal
        //Integer ff = 111;
        LinkedList<Song> songList = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int n = 1000;
        linkedList.add(n); // AutoBoxing
        Float q1;
        Double g1;
        Boolean f3 ;
        Character b2;
        Integer ee = 130;
        Integer ff = 130;
        System.out.println(ee == ff);
        float r = ee.floatValue();
        long f2 = ee.longValue();
        int w = Integer.parseInt("434");
        //Integer w = new Integer(1000);

        BigInteger b = new BigInteger("543543543534534534543534543");
        BigInteger b2 = new BigInteger("64565442343243243243243243");
        BigInteger b3 = b.add(b2);
        System.out.println(b3);
       // BigDecimal b3 = new BigDecimal("5345345435345.34434");
    }
}
