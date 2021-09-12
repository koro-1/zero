import java.util.Arrays;

public class trest {
   /* public static void main(String[] args) {
        long a=231456566;long sum=0;long b=a;long c=0;
        while (b>0){
            c=b%10;
            sum=sum+c;
            System.out.println(c);
            b=b/10;
        }
        System.out.println("和为"+sum);




    }*/
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(person1, person2)->{
            if (person1[0] == person2[0]){
                return person1[1]-person2[1];
            }else {
                return person2[0]-person1[0];
            }
        });
       /* int[][] res = new int[people.length][2];
        for (int i = 0; i < people.length; i++) {
            if (people[i][1]>=i){
                res[i] = people[i];
            }else {
                int target = people[i][1];
                for (int j = i; j > target; j--) {
                    res[j] = res[j-1];
                }
                res[target] = people[i];
            }
        }*/
        return people;
    }

    public static void main(String[] args) {
        int [][]people={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        new trest().reconstructQueue(people);
        for (int []a:people
             ) {
            System.out.println(a[0] );
            System.out.println(a[1]);
        }
    }
}
