import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution58 {

    public List<List<String>> groupAnagrams(String[] strs) {
         char []cr;
        List<List<String>>list=new ArrayList<>();





        HashMap<String,List<String>>map=new HashMap<>();
        for (String str:strs
             ) {            //strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
              cr=str.toCharArray();
              Arrays.sort(cr);
              String s=new String(cr);

       List<String> list2  =   map.getOrDefault(s,new ArrayList<>());
            list2.add(str);
            map.put(s,list2);

        }
        list.addAll(map.values());



        return  list;
    }

    public static void main(String[] args) {
        String[]strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println( new Solution58().groupAnagrams(strs));
    }
}