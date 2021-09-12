class Solution29 {
    public String longestPalindrome(String s) {
        if (s.length()<2)return s;

        int max=1,begin=0;
        char[]ar=  s.toCharArray();
        for (int i = 0; i <=s.length()-2 ; i++) {
            for (int j = i+1; j <=s.length()-1 ; j++) {
                if (j-i+1>max&&pd(ar,i,j))
                {
                    max=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+max);

    }
    public boolean pd(char[]cr,int left,int right)
    {
         while (left<right)
         {
             if (cr[left]!=cr[right])return  false;

            left++;
            right--;

         }
         return  true;

    }
}