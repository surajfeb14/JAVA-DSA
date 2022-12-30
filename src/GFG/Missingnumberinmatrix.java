package GFG;

public class Missingnumberinmatrix {
    public static void main(String[] args) {
        int arr [][]={{4,9,2},{3,5,7},{0,1,6}},n=3;
        System.out.println(MissingNo(arr));
//        System.out.println(arr[0].length);
    }
    public static long  MissingNo(int[][] arr)
    {
        long res=0;

        int n=arr[0].length,rowSum=0,colSum=0,zi=0,zj=0,k=0,sum1=-1,sum2=-1;
        boolean fl=true;
        for (int i=0;i<n&&fl;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    zi=i;
                    zj=j;
                    fl=false;
                    break;
                }
            }
        }
        fl=true;
        for (int i=0;i<n;i++){
            rowSum=0;
            colSum=0;
            for(int j=0;j<n;j++){
                rowSum+=arr[i][j];
                colSum+=arr[j][i];
            }

                if(fl){
                    sum1=rowSum;
                    fl=false;
                }
                else {
                    if(zi==n-1&&zi==zj&&i!=n-1)
                        continue;
                    if((zi==zj&&rowSum==colSum)||sum1!=colSum||(zi==n-1&&zj==0))
                        sum2=colSum;
                    else
                        sum2 = rowSum;
                    res = Math.abs(sum1 - sum2);
                    arr[zi][zj] = (int) res;
                    if (chkSum(arr))
                        return res;
                    else
                        return -1L;
                }
        }
        return -1L;
}
static boolean chkSum(int[][] arr){

    int n=arr[0].length,rowSum=0,colSum=0,sum=0,d1sum=0,d2sum=0;
    for (int i=0;i<n;i++){
        rowSum=0;
        colSum=0;
        for(int j=0;j<n;j++){
            if(i==j)
                d1sum+=arr[i][j];
            rowSum+=arr[i][j];
            colSum+=arr[j][i];
        }
    }
    for(int i=0,j=n-1;i<n&&j>=0;i++,j--)
        d2sum+=arr[i][j];

    return rowSum==colSum&&colSum==d1sum&&d1sum == d2sum;
}
}
