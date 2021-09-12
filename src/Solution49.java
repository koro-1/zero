import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution49 {
    public int countPalindromicSubsequence(String s) {
        int sum = 0;
        for (char a = 'a'; a <= 'z'; a++) {
            int l = 0, r = s.length() - 1;
            while (s.charAt(l) != a && l < s.length() - 1) {
                l++;
            }
            while (s.charAt(r) != a && r > 0) {
                r--;      //abcba
            }
            if ((r - l) < 2) {
                continue;
            } else {
                Set<Character> set = new HashSet<>();
                for (int k = l + 1; k < r; k++) {
                    set.add(s.charAt(k));
                }
                sum += set.size();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(2);set.add(3);set.add(2);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = it.next()+"";
            System.out.println(str);
        }
    }
}

