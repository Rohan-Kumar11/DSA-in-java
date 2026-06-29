/*
## 54. Spiral Matrix

Given an m x n matrix, return all elements of the matrix in spiral order.



Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */
package Array.Medium;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Spiral_Matrix {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = in.nextInt();
        System.out.print("Enter the number of columns :");
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.print("matrix : ");
        System.out.println(Arrays.deepToString(matrix));
        List<Integer> ans = spiralOrder(matrix);
        System.out.println("output : "+ans);
    }

    static public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();;
        int top=0,bottom=m-1;
        int left=0,right=n-1;
        while(ans.size()!=m*n){
            if(top<=bottom && left<=right){
                for(int j=left ; j<=right ; j++){
                    ans.add(matrix[top][j]);
                }
                top+=1;}
            if(top<=bottom && left<=right){
                for(int j=top ; j<=bottom ; j++){
                    ans.add(matrix[j][right]);
                }
                right-=1;}
            if(top<=bottom && left<=right){
                for(int j=right ; j>=left ; j--){
                    ans.add(matrix[bottom][j]);
                }
                bottom-=1;}
            if(top<=bottom && left<=right){
                for(int j=bottom ; j>=top ; j--){
                    ans.add(matrix[j][left]);
                }
                left+=1;}
        }
        return ans;
    }
}
