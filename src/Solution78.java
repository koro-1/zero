class Solution78 {
    public String maximumNumber(String num, int[] change) {
           int sum=0,r=0;
        for (int i = 0; i <num.length() ; i++) {
             r=Math.max(num.charAt(i)-'0',change[num.charAt(i)-'0']);
             sum=10*sum+r;
        }

           return sum+"";
    }
}