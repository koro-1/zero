public class compareVersion {
    private  int compareVersion(String version1,String version2)
    {

        String[] v1 = version1.split("\\ ");
        String[] v2 = version2.split("\\*");
        for (int i = 0; i < v1.length || i < v2.length; ++i) {
            int x = 0, y = 0;
            if (i < v1.length) {
                x = Integer.parseInt(v1[i]);
                //asd
            }
            if (i < v2.length) {
                y = Integer.parseInt(v2[i]);
            }
            if (x > y) {
                return 1;
            }
            if (x < y) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        new compareVersion().compareVersion("1 0 12","1*0&" +
                "11");


    }
}
