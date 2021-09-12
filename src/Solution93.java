import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution93 {
    public List<Integer> getRow(int rowIndex) {
        Map<Integer ,List<Integer>> lists=new HashMap<>();
           int numRows=25; int n=1;
        int [][]data =new int[numRows][numRows];
        for (int i = 0; i <numRows ; i++) {
            data[i][i]=1;
            data[i][0]=1;
        }
        for (int i = 2; i <numRows ; i++) {
            List<Integer> list= new ArrayList<>();
            for (int j = 1; j <=i-1 ; j++) {
                data[i][j]=data[i-1][j]+data[i-1][j-1];
            }
        }
        for (int []a:data
        ) {   List<Integer> list= new ArrayList<>();
            for (int i = 0; i <data[0].length ; i++) {

                if (a[i]!=0)  list.add(a[i]) ;

            }
            lists.put(n++,list);
        }





        return lists.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(new Solution93().getRow(25));
    }
}


