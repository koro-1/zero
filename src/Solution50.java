import java.util.ArrayList;
import java.util.List;

class Solution50 {
    int c=0;int d=-1;
    public String convert(String s, int numRows) {
        if (s.length()<=2||numRows==1)return s;
        List<List<String>>list=new ArrayList<>();
        String []str=new String[numRows];
        StringBuilder stringBuilder=new StringBuilder();
        String ss= new String();
        for (int i = 0; i <str.length ; i++) {
            str[i]="";

        }
        for (int i = 0; i <s.length() ; i++) {  //"abcde"
            if (i%(numRows-1)==0){
                d*=-1;
            }

            str[c]= str[c] +s.charAt(i)  ;
            c=d+c;





        }
        for (int i = 0; i <=numRows-1 ; i++) {
            stringBuilder.append(str[i]);
        }
        return stringBuilder.toString();





    }
    public static void main(String[] args) {
        System.out.println(new Solution50().convert("PA",2));
      /*  StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("asdk");
        stringBuilder.append("666");
        System.out.println( stringBuilder.toString());;*/

    }
} 