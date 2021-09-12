import java.util.ArrayList;
import java.util.List;

class Solution77 {
    int data=0;
    public int getLucky(String s, int k) {
        long c=0l; int r=0,f,d=0;double e=0.0;  long sum=0;
        List<Integer>list=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {

          r=s.charAt(i)-'0'-48;
          list.add(r);



        }


       return  chaifen(k,list,0,true);
    }
    public  int chaifen(int index,List<Integer>list,int num,boolean flag){
        if (index==0) {
            data=(int)num;  return 0;}
        String s="";
       if (flag){
        for (Integer integer : list) {
            s = s + integer;
        }
        flag=false;
       }
       else s=num+"";

          //1 2 3 4 5 6 7
         int n=0;
        for (char c:s.toCharArray()
             ) {
              n=n+(c-'0');

        }
        chaifen(index-1,list,n,flag);


      return data;



    }


    public static void main(String[] args) {
        System.out.println(new Solution77().getLucky("fleyctuuajsr",5));
    }
}

