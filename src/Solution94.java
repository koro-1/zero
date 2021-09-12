import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution94 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      int []deep=new int [numCourses];
      Queue<Integer>queue=new LinkedList<>();
      List<List<Integer>>list=new ArrayList<>();
        for (int i = 0; i <numCourses ; i++) {
            list.add(new ArrayList<>());

        }
        for (int []a:prerequisites
             ) {
                 deep[a[0]]++;
                 list.get(a[1]).add(a[0]);

        }
        for (int i = 0; i <numCourses ; i++) {
            if (deep[i]==0) queue.add(i);
        }
        while (!queue.isEmpty())
        {
            int c=queue.poll();
            numCourses--;
            for (int d:list.get(c)
                 ) {
                    deep[d]--;
                    if (deep[d]==0) queue.add(d);
            }


        }










    return numCourses==0;
    }
}

