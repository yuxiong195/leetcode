package 模拟and打印矩阵;

import java.util.ArrayList;
import java.util.List;

public class LC54 {
    int[][] moveUnit = new int[][]{
            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
    };
    int m;
    int n;
    boolean[][] used;
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        m = matrix.length;
        if(m == 0) return ans;
        n = matrix[0].length;
        if(n == 0) return ans;
        used = new boolean[m][n];

        int dirIndex = 0;
        int i = 0;
        int j = 0;
        int cnt = 0;

        while (cnt < m*n) {
            ans.add(matrix[i][j]);
            cnt++;
            used[i][j] = true;

            i += moveUnit[dirIndex][0];
            j += moveUnit[dirIndex][1];

            if (!isValid(i, j)) {
                i -= moveUnit[dirIndex][0];
                j -= moveUnit[dirIndex][1];
                dirIndex = (dirIndex + 1) % 4; // dirIndex取余进行循环
                i += moveUnit[dirIndex][0];
                j += moveUnit[dirIndex][1];
            }
        }

        return ans;

    }

    public boolean isValid(int i, int j) {
        if (i < m && i >= 0 && j < n && j>= 0 && !used[i][j]) {
            return true;
        }
        return false;
    }
}