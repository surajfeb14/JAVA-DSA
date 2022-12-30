package GFG;

public class BalancedString {
    public static void main(String[] args) {
        int n=37;
        System.out.println(BalancedString(n));
    }
    static String BalancedString(int N) {
        int t=N,sum=0,rem=N%26;
        String str= "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        while(t>0){
            sum+=t%10;
            t/=10;
        }
        if(N>=26){
            result+=str;
            for(int i=1;i<N/26;i++)
                result+=str;
        }
        if(N%2==0){
            result+=str.substring(0,(rem)/2)+str.substring(26-(rem)/2);
        }else{
            if(sum%2==0){
                result+=str.substring(0,(rem+1)/2)+str.substring(26-(rem-1)/2);
            }else{
                result+=str.substring(0,(rem-1)/2)+str.substring(26-(rem+1)/2);
            }
        }
        return result;
    }
}

