import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Arrays;
import java.util.HashMap;

public class Solusion {
    public int firstUniqChar(String s) {
       /* char[] chars = s.toCharArray();
      char[] chars2 =s.toCharArray();
      HashMap<Character,Integer>map=new HashMap<>(chars.length-1);
        Arrays.sort(chars); int num=1;
        if (s.length()==1)return  0;
      for (int i = 0; i <chars.length-1 ; i++) {
                                     //aabb
          if (chars[i]!=chars[i+1]) {
              map.put(chars[i],num);
               num=0;
               if (i+1==chars.length-1&&chars[i]!=chars[i+1]){
                   map.put(chars[i+1],1);
               }

          }
          if (i+1==chars.length-1&&chars[i]==chars[i+1]){
              map.put(chars[i],num+1);
          }
          num++;
      }
      for (int i = 0; i <chars2.length ; i++) {
          if( map.get(chars2[i])==1) return  i;
      }



      return  -1;*/
        System.out.println(s.charAt(3));

return 0;

    }

    public static void main(String[] args) {
        new Solusion().firstUniqChar("aabbcasd");
    }
    }


