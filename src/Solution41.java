import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Solution41 {
    public List<Integer> deleteAndEarn(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
          int sum=0;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
       for (int i=0;i<=list.size()-1;i++)
       {  list.remove(list.indexOf(i+1)); list.remove(list.indexOf(i+1));
           for (int a:nums
                ) {

               if (a==list.indexOf(i)){
                   sum=sum+a;
               }
           }

       }




        list.add(3);
         return list;
    }

    public static void main(String[] args) {
        int []num={3,8,3,2,4};
        System.out.println(new Solution41().deleteAndEarn(num));
    }
}