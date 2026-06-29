/*
## 59. Spiral Matrix II

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.



Example 1:


Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]


Constraints:

1 <= n <= 20
 */
package Array.Medium;
import java.util.Arrays;
import java.util.Scanner;
public class Spiral_Matrix_II {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the positive integer : ");
        int n = in.nextInt();
        int[][] ans = generateMatrix(n);
        System.out.print("Output : "+Arrays.deepToString(ans));
    }

    static public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int i = 1;
        while (i <= n * n) {
            if (top <= bottom && left <= right) {
                for (int j = left; j <= right; j++) {
                    ans[top][j] = i++;
                }
                top += 1;
            }
            if (top <= bottom && left <= right) {
                for (int j = top; j <= bottom; j++) {
                    ans[j][right] = i++;
                }
                right -= 1;
            }
            if (top <= bottom && left <= right) {
                for (int j = right; j >= left; j--) {
                    ans[bottom][j] = i++;
                }
                bottom -= 1;
            }
            if (top <= bottom && left <= right) {
                for (int j = bottom; j >= top; j--) {
                    ans[j][left] = i++;
                }
                left += 1;
            }
        }
        return ans;
    }
}