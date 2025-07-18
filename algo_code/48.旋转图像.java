/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 *
 * https://leetcode.cn/problems/rotate-image/description/
 *
 * algorithms
 * Medium (78.52%)
 * Likes:    2081
 * Dislikes: 0
 * Total Accepted:    775.2K
 * Total Submissions: 986.3K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[7,4,1],[8,5,2],[9,6,3]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * 输出：[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * n == matrix.length == matrix[i].length
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 * 
 * 
 * 
 * 
 */

// @lc code=start
/**
 * [1,2,3]
 * [4,5,6]
 * [7,8,9]
 * 
 * 转置
 * [1,4,7]
 * [2,5,8]
 * [3,6,9]
 * 
 * 翻转
 * [7,4,1]
 * [8,5,2]
 * [9,6,3]
 */
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = m - 1;
            while (l < r) {
                int t = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = t;
                l++;
                r--;
            }
        }
    }
}
// @lc code=end

