package Searching.Easy;
import java.util.Scanner;
public class Sqrt {
    static void main(String[] args) {
        System.out.print("Enter the number to find the square root : " );
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = mySqrt(n);
        System.out.println("The square root of " + n + " is " + ans );
    }
    static public int mySqrt(int x) {
        int ans = 0;
        if(x==0 || x==1) return x;
        int low = 1 , high = x/2 ;
        while(low<=high){
            int mid= low+(high - low)/2;
            long mul = (long)mid*mid;
            if(mul == x ){
                return mid;
            }
            else if(mul < x){
                ans = mid;
                low= mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
