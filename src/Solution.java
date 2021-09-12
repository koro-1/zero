import com.sun.org.apache.xpath.internal.objects.XString;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


class Solution {
    public int reverse(int x) {
       boolean flag=true;
        if(x<0) {

            x=-x;
            flag=false;

        }
         if (x==0) return 0;
        int []num=new int[32]; int i=0;
        while(x!=0){    //43261
           num[i]=x%10;

           x/=10; i++;
        }

        String index="";
        for (int j = 0; j <i ; j++) {
              index=index+num[j];
        }
        int v=0;
   try {
        v=Integer.parseInt(index,10);
       }
   catch (NumberFormatException e){
       return 1534236469;
   }



        if (!flag) v=-v;
    return v;


    }

   




    public static void main(String[] args) {

        System.out.println(new Solution().reverse(1534236469));
    }
    }

