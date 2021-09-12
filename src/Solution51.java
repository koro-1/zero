class Solution51 {
    boolean flag = false,f2=true;
    public int myAtoi(String s) {
        s = s.trim(); int fh=1,r=0,sum=0;
        char []chars=s.toCharArray();
        int i=0; int n=0;
        if (s.length()==0)return 0;
        if (chars[0]=='-') fh=-1;
        if (chars[0]=='-'||chars[0]=='+')i++;
        while (i<=chars.length-1&&Character.isDigit(chars[i])){




            if ((sum>(Integer.MAX_VALUE/10))   ||(sum==(Integer.MAX_VALUE/10))&&chars[i]>'7')
                return  fh==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            sum=sum*10+chars[i]-'0';  i++;
        }

        return sum*fh;





    }








    public static void main(String[] args) {
        String s = new String("2147483646");

        System.out.println(new Solution51().myAtoi(s));
    }
}