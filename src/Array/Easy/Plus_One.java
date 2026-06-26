/*66. Plus One
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's. */


package Array.Easy;
import java.util.Arrays;
import java.util.Scanner;

public class Plus_One {
    static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] digits = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0 ; i<n ; i++){
            digits[i]= in.nextInt();
        }
        System.out.println("Input : ");
        System.out.println(Arrays.toString(digits));
        int []output = plusOne(digits) ;
        System.out.println("Output : ");
        System.out.println(Arrays.toString(output));
    }
    static public int[] plusOne(int[] digits) {
        int n = digits.length;
        int rem=0,carry=1;
        for(int i=n-1 ; i>=0 ; i--){
            rem=digits[i]+carry;
            digits[i]=rem%10;
            carry=rem/10;
            if(carry==0) return digits;
        }
        if(carry > 0){
            n+=1;
        }
        int []ans = new int[n];
        for(int i=n-1 ; i>0 ; i--){
            ans[i]=digits[i-1];
        }
        ans[0]=carry;
        return ans;
    }
}
