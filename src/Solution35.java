class Solution35 {
    public int climbStairs(int n) {
        int []memo=new int[n+2];





        return  cli(n,memo);

    }
    public int cli(int n,int []memo){





        memo[1]=1;memo[2]=2;

        for(int i=3;i<=n;i++){

            memo[i]=memo[i-1]+memo[i-2];}



        return memo[n];

    }

    public static void main(String[] args) {
        System.out.println(new Solution35().climbStairs(5));
    }
}