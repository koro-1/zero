import java.util.HashMap;

class Solution17 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        if (s.length()==0) return 0;
        map.put(s.charAt(0),0);
        int max=1,temp=1,z=0;
        for (int i = 1; i <s.length(); i++) {

            if (!map.containsKey(s.charAt(i))){  temp++;map.put(s.charAt(i),i); }
            else {    temp=0;
            z= map.get(s.charAt(i))+1;
                map.clear();

                for (int j=z;j<=i;j++)
                { map.put(s.charAt(j),j);

                temp++;}



            }

            max=Math.max(temp,max);

        }




        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution17().lengthOfLongestSubstring("a"));
    }
}