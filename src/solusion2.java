import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class solusion2 {
    public int strStr(String haystack, String needle) {
            String temp;
         int length=needle.length();
      int len = haystack.length();
        for (int i = 0; i <=len-length; i++) {
           temp =haystack.substring(i,i+length);

            while (temp.equals(needle)) return i;
        }
             return 0;

     }

    public static void main(String[] args) {




        System.out.println(  new solusion2().strStr("hello","ll"));

    }

}
