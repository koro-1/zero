import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution56 {
    List<List<Integer>>list=new ArrayList<>();
    public void rotate(int[][] matrix) {
        /* matrix.length;*/
         int num=0; int len=matrix.length;

        for (int i = 0; i <len ; i++) {
            list.add(new ArrayList<>());

        }
        for (int i = 0; i <len; i++) {
            for (int j = 0; j <len ; j++) {

                 list.get(num%(len)).add( matrix[i][j]);
                   num++;
            }
        }

        for (int i = 0; i <len ; i++) {
            daozhilist(list.get(i));

        }  num=0;
        for (int i = 0; i <len; i++) {
            for (int j = 0; j <len ; j++) {
              matrix[i][j]=list.get(i).get(num%(len));


                num++;
            }
        }


    }
   public void daozhilist(List<Integer>list){

       int r=list.size()-1,l=0,temp=0,temp2=0;
       while (l<r){
             temp2=list.get(r);
             temp=list.get(l);
             list.set(r,temp);
             list.set(l,temp2);
         l++;
        r--;




       }


   }

   /* public static void main(String[] args) {
         int[]a={1,2,3};
        List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3));
        System.out.println(list);
        new Solution56().daozhilist(list);
        System.out.println(list);
    }*/
    public static void main(String[] args) {
         int[][] ccc=new int[3][3];

          int b=1;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3 ; j++) {
                ccc[i][j]=b++;
            }
        }   new Solution56().rotate(ccc);
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3 ; j++) {

                System.out.println(ccc[i][j]);
            }
        }


    }
}