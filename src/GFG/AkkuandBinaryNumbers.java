package GFG;

import java.util.HashSet;

//Akku likes binary numbers and she likes playing with these numbers.
// Her teacher once gave her a question.For given value of  L and R, Akku have to
// find the count of number X, which have only three-set bits in it's binary representation
// such that "L ≤ X ≤ R".Akku is genius, she solved the problem easily. Can you do it ??
public class AkkuandBinaryNumbers {
    static HashSet<Long> lh = new HashSet<>();
    public static void main(String[] args) {
        long a=11,b=19;
        precompute();
        System.out.println(solve(a,b));
    }
    static void precompute(){
        for(long i=1;i<Long.MAX_VALUE;i++){
            long temp=i,c=0;
            while(temp>0){
//                if((temp&1)==1)
                    c+=temp&1;
                temp=temp>>1;
                if(c>3)
                    break;
            }
            if(c==3)
                lh.add(temp);
        }
    }
    static long solve(long L, long R){
        long count=0;
       for(;L<=R;L++){
           if(lh.contains(L))
               count++;
       }

        return count;
    }
}
