import java.util.*;

class Solution32 {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<String, List<String>>();
        for (String s:strs
             ) {
          char []a=  s.toCharArray();
            Arrays.sort(a);
          String  key=new String(a);
             List<String>list=map.getOrDefault(s,new ArrayList<>()
             );
             list.add(s);
             map.put(key,list);

        }
        return new ArrayList<List<String>>(map.values());
    }

}