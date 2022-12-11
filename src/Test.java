import java.util.Arrays;

class Solution {
    static String buildLowestNumber(String str, int N) {

        char chr[] = str.toCharArray();
        for(int i=0;i<N;i++){
            int max=0;
            for(int j=1;j<chr.length;j++){
                if(chr[j]>chr[j-1]){
                    max=j;
                }
            }
            chr[max]=' ';
        }

        str=new String(chr).replace(" ","").trim();
        if(Integer.parseInt(str)==0){
            str="0";
        }
        return new String(str);
    }
}
public class Test {

    public static void main(String[] args) {
        String num="143729";
        System.out.println(new Solution().buildLowestNumber(num,2));

    }
}
