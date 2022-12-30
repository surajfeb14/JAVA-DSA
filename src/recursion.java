public class recursion {
    public static void main(String[] args) {

        System.out.println(f(1, 9));
    }
    static int f(int n, int p){
       if(p==0)
           return 1;
       int halfPower=f(n,p/2);
       int halfPowerSq=halfPower*halfPower;
       if(p%2!=0)
           halfPowerSq*=n;
       return halfPowerSq;
    }
}
