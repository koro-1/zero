public class findIntegers {

        public int findIntegers(int n) {

            int []pd=new int [n+1];
            // init

            pd[1]=2;
            pd[2]=3;
            if (n<=2) return pd[n];
            for(int i=3;i<n+1;i++){

                pd[i]=pd[i-1]+pd(i);



            }


       return pd[n];

    }

    private int pd(int i) {
         String s=Integer.toBinaryString(i);
         char []cr=s.toCharArray();

         int fast=1,slow=0;
         while (fast<cr.length){

             if (cr[fast]=='1'&&cr[slow]=='1') return 0;

             fast++;
             slow++;


         }



     return 1;
    }

    public static void main(String[] args) {
        System.out.println(new findIntegers().findIntegers(1000000000));
    }
}
