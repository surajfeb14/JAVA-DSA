package GFG;
//Given an array, Arr[] of size N represents N house built along a straight line with equal distance between adjacent houses. Each house has a certain number of wine and they want to buy/sell those wines to other houses. Transporting one bottle of wine from one house to an adjacent house results in one unit of work. The task is to find the minimum number of work is required to fulfill all the demands of those N houses.
//
//        if arr[i] < 0, then ith house wants to sell arr[i] number of a wine bottle to other houses.
//        if arr[i] > 0, then ith house wants to buy arr[i] number of a wine bottle from other houses.
//        Note: One have to print the minimum number such that, all the house can buy/sell wine to each other.
//        It is guaranteed that sum of all the elements of the array will be 0.
public class WineBuyingandSelling {
    public static void main(String[] args) {
        int arr[]={-6,7,-5,-4,8},n=5;
    }
    long wineSelling(int arr[],int n){
        long sum=0;
        int i=0,j=0;
        int brr[]=new int[n];

//
        for(int k=0;k<n;k++){
            if(i!=j)
                break;
            if(arr[k]<0)
                j=k;
            else if(arr[k]>0) 
                i=k;
        }






        return sum;

    }
}
