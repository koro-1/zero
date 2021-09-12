import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        char []ss=p.toCharArray();
         Arrays.sort(ss);
         p=new String(ss);
          String e="";
        /*System.out.println(p);*/
        for (int i = 0; i <s.length()-p.length()+1 ; i++) {

            e=s.substring(i,i+p.length());
            if (p.equals(sort(e))) list.add(i);
            System.out.println(e);
        }

  return list;
    }
    private  String sort(String s){
        char []ss=s.toCharArray();
        Arrays.sort(ss);
        s=new String(ss);
        return s;
    }

    public static void main(String[] args) {
       String s="abc";
        System.out.println(new findAnagrams().findAnagrams("cbaebabacd",s));
    }
}
