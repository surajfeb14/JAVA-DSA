public class Test1 {
    public static void main(String[] args) {
        int n = 3, m = 3,ty = 0,i = 0, j = 1;
        int mat[][]={{5, 9, 7},
                    {6, 4, 5},
                    {8, 1, 2}};
        System.out.println(hopscotch(n,m,mat,ty,i,j));
    }
    static int hopscotch(int n, int m, int mat[][], int ty, int i, int j)
    {
        int sum=0;
        int dx0o[]={0,1,1,1,0,-1};
        int dy0o[]={1,1,0,-1,-1,0};

        int dx0e[]={-1,-1,-1,0,1,0};
        int dy0e[]={0,-1,1,-1,0,1};

        int dx1e[]={-2,-2,-2,-1,-1,0,0,1,1,1,1,2};
        int dy1e[]={-1,0,1,-2,2,-2,2,-2,-1,1,2,0};

        int dx1o[]={-1,-1,-2,-1,-1,0,0,1,1,2,2,2};
        int dy1o[]={-2,-1,0,1,2,-2,2,-2,2,-1,0,1};
        if(ty==0){
            if(j%2!=0){
                for(int a=0;a<6;a++){
                    int x=dx0o[a]+i;
                    int y=dy0o[a]+j;
                    if(x>=0&&x<n&&y>=0&&y<m){
                        sum+=mat[x][y];
                    }
                }
            }else{
                for(int a=0;a<6;a++){
                    int x=dx0e[a]+i;
                    int y=dy0e[a]+j;
                    if(x>=0&&x<n&&y>=0&&y<m){
                        sum+=mat[x][y];
                    }
                }
            }
        }else{
            if(j%2!=0){
                for(int a=0;a<6;a++){
                    int x=dx1o[a]+i;
                    int y=dy1o[a]+j;
                    if(x>=0&&x<n&&y>=0&&y<m){
                        sum+=mat[x][y];
                    }
                }
            }else{
                for(int a=0;a<6;a++){
                    int x=dx1e[a]+i;
                    int y=dy1e[a]+j;
                    if(x>=0&&x<n&&y>=0&&y<m){
                        sum+=mat[x][y];
                    }
                }
            }
        }
        return sum;
    }
}
