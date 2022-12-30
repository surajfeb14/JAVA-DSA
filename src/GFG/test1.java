package GFG;


import java.util.HashMap;

public class test1 {

    public static void main(String[] args) {
        int n=6;
        long arr[]={0,0,-5,5,0,0};
        System.out.println(findSubarray(arr,n));
}
    public static long findSubarray(long[] arr ,int n)
    {
        //Your code here
        long sum=0;int num=0,subzero=0;boolean fl=false;

            for(int i=0;i<n;i++){
                if(arr[i]==0) {
                    subzero++;
                    continue;
                }
                if(subzero>0){
                    num+=(subzero*(subzero+1))/2;
                    subzero=0;
                }
                if(i!=n-1){
                    for(int j=i+1;j<n;j++){
                        if(arr[j]==0)
                            break;
                        sum+=arr[i]+arr[j];
                        fl=true;
                    }
                    if(sum==0 && fl){
                        num++;
                        fl=false;
                    }
                }
            }

        try{
            int a=0;
        }finally{
            if(subzero>0){
                num+=(subzero*(subzero+1))/2;
                subzero=0;
            }
        }


        return num;
    }

}
