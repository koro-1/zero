import java.util.Arrays;

public class sumOddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {
        int begin=0,lenth=arr.length;
        int []sums={}; int sum=0;
        while (begin<arr.length)
        {   while (lenth>0){
            sums = Arrays.copyOfRange(arr,begin,begin+lenth);

           if (sums.length%2==1)
           sum=sum+jisuan(sums);
           lenth--;}

          begin++;
            lenth=arr.length-begin;



        }




return sum;
    }
    private int jisuan(int []a){
        int sum=0;
        for (int i:a
             ) {
            sum=sum+i;

        }

        return sum;
    }

    public static void main(String[] args) {
        int []sums={1,2};
        System.out.println(new sumOddLengthSubarrays().sumOddLengthSubarrays(sums));
    }

}
