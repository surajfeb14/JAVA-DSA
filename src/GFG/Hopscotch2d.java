package GFG;
import java.io.*;
import java.util.*;
public class Hopscotch2d{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String[] arr = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int[][] mat = new int[n][m];
            for(int i = 0;i < n;i++){
                String[] a = in.readLine().trim().split("\\s+");
                for(int j = 0;j < m;j++)
                    mat[i][j] = Integer.parseInt(a[j]);
            }
            String[] a1 = in.readLine().trim().split("\\s+");
            int ty = Integer.parseInt(a1[0]);
            int i = Integer.parseInt(a1[1]);
            int j = Integer.parseInt(a1[2]);

            Solution ob = new Solution();
            System.out.println(ob.hopscotch(n, m, mat, ty, i, j));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int hopscotch(int n, int m, int[][] mat, int ty, int i, int j)
    {
        int sum=0;
        int[] dx0o ={0,1,1,1,0,-1};
        int[] dy0o ={1,1,0,-1,-1,0};

        int[] dx0e ={-1,-1,-1,0,1,0};
        int[] dy0e ={0,-1,1,-1,0,1};

        int[] dx1e ={-2,-2,-2,-1,-1,0,0,1,1,1,1,2};
        int[] dy1e ={-1,0,1,-2,2,-2,2,-2,-1,1,2,0};

        int[] dx1o ={-1,-1,-2,-1,-1,0,0,1,1,2,2,2};
        int[] dy1o ={-2,-1,0,1,2,-2,2,-2,2,-1,0,1};
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
                for(int a=0;a<12;a++){
                    int x=dx1o[a]+i;
                    int y=dy1o[a]+j;
                    if(x>=0&&x<n&&y>=0&&y<m){
                        sum+=mat[x][y];
                    }
                }
            }else{
                for(int a=0;a<12;a++){
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



