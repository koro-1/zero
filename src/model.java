import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class model {
    public int countAndSay(int n) {  //4 14
             if(n<10){
           int a=n; int num=1;int key=1;
          while (a!=0){

              n= (int) (a%10+Math.pow(10,key)*num);
              a/=10;

          }
              return Integer.parseInt(n+"");
             }



        return 0;




    }
        public  int aa(int n){

            if (n<10)return countAndSay(n);
            int a=0;
            HashMap<Character,Integer>map=new HashMap<>();


                a=n;
                 char[]b= (a+"").toCharArray();
                for (int j = 0,num=1; j <b.length-1 ; j++) {
                    if (b[j] == b[j + 1]) {
                        num++;     // 1223
                        if (j + 1 == b.length - 1) map.put(b[j], num);

                    }  //1223
                    else {
                        map.put(b[j], num);
                        num = 1;
                        if (j + 1 == b.length-1)
                            map.put(b[j + 1], 1);
                    }


                } String s="";
            Iterator iter = map.entrySet().iterator();
                while (iter.hasNext()) {
   Map.Entry entry = (Map.Entry) iter.next();
        Object key = entry.getKey();
        Object val = entry.getValue();
               s=s+""+val+key;

                       }


            return  Integer.parseInt(s);

        }

    public static void main(String[] args) {
        /*new model().aa(new model().aa(new model().aa(new model().aa(1)) ) )*/
        System.out.println(new model().aa(1223223333) );
    }

}
