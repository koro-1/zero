public class chalkReplacer {
    public int chalkReplacer(int[] chalk, int k) {
         int i=0;
        long sum=0;
        if (chalk.length<=1) return 0;
        for ( i = 0; k>=sum ; i++) {
            i=i%chalk.length;
            sum+=chalk[i];


        }
       return i-1;






    }

    public static void main(String[] args) {
        int  []num={3,4,1,2};
        System.out.println(new chalkReplacer().chalkReplacer(num,25));
    }
}
