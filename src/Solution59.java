class Solution59 {
     int num=0;
    public int uniquePaths(int m, int n) {



     return  digui(m,n,m+n);
    }

    public  int digui(int m, int n,int step){  //3 2

       if (step==0)
           return num;


        num++;

        digui(m-1,n,step-1);

        digui(m,n-1,step-1);

         return  num;
    }

    public static void main(String[] args) {
        System.out.println(new Solution59().uniquePaths(3,7));
    }


}