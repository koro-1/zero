public class solusion3 {
    public String longestCommonPrefix(String[] strs) {
        String pre =strs[0];
    int j=0,k=0;
        if (pre.equals(""))return "";
        for (int i = 1; i < strs.length; i++) {
                                               //str23  str563  str2356


                 for ( j = 0; j <strs[0].length() ; j++) {

                     if ((strs[i].indexOf(pre)!=0)){


                     pre=pre.substring(0,strs[0].length()-k-1);
                     k++;}
                     else break;



                 }


             }





        return pre;
    }


    public static void main(String[] args) {
        String[]ars={"flower","flow","flight"};
        System.out.println(new  solusion3().longestCommonPrefix(ars));

    }
}

