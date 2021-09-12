class Solution14{
    public int[] countBits(int n) {
         int[] data=new int[n+1];
        for (int i = 0; i <=n ; i++) {
               data[i]=util(i);

        }

        return data ;
    }
    public  int util(int n){
          int num=0;
          while (n>0){
              if (n%2==1) num++;


              n/=2;
          }

        return  num;
    }

}