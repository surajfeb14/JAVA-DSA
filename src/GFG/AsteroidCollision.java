package GFG;
//We are given an integer array asteroids of size N representing asteroids in a row.
//        For each asteroid, the absolute value represents its size, and the sign represents its direction
//        (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
//        Find out the state of the asteroids after all collisions. If two asteroids meet,
//        the smaller one will explode. If both are of same size, both will explode.
//        Two asteroids moving in the same direction will never meet.

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int arr[]={10 ,-10, 11, 2, 3, 4, -1, -1, 5, -10, 12, 3},n=12;
        int[] result = asteroidCollision(n,arr);
        for (int j : result)
            System.out.println(j + " ");
    }
    public static int[] asteroidCollision(int n, int[] arr) {
        Stack<Integer> st = new Stack();
            for (int i: arr){
                if(i>0)
                    st.push(i);
                else{
                    while(!st.isEmpty()&&st.peek()>0&&st.peek()<Math.abs(i))
                        st.pop();
                    if(st.isEmpty()||st.peek()<0)
                        st.push(i);
                    else if(i+st.peek()==0)
                        st.pop();
                }
            }
            int[] res = new int[st.size()];
            int i=st.size();
            while(!st.isEmpty())
                res[--i]=st.pop();
            return res;
    }
}
