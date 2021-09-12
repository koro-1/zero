class Solution66 {
    public boolean exist(char[][] board, String word) {
      int l=board.length;int f= board[0].length;
      boolean [][]visited=new boolean[l][f];
        for (int i = 0; i <l ; i++) {
            for (int j = 0; j <f ; j++) {

                 boolean flag=check(board,visited,i,j,word,0);
                 if (flag)return true;




            }


        }


        return false;


    }

    private boolean check(char[][] board, boolean[][] visited, int i, int j, String word, int i1) {
              boolean result=false;
        if (board[i][j]!=word.charAt(i1)) return false;
        if (i1==word.length()-1) return true;
        visited[i][j]=true;
        int [][]fangxiang={{0,1},{0,-1},{1,0},{-1,0}};
        for (int [] dir :fangxiang
             ) {

               int newi=i+dir[0],newj=j+dir[1];
                if (newi>=0&&newj>=0&&newi<board.length&&newj<board[0].length){
                    if (!visited[newi][newj]){



                        boolean flag=check(board,visited,newi,newj,word,i1+1);

                        if (flag){
                            result = true;
                            break;

                        }



                    }
                }
        }
         visited[i][j]=false;
        return result;







    }


}

