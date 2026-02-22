class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

    int m = matrix.length;
    int n = matrix[0].length;

    List<Integer> ans = new ArrayList<>();

    int srow = 0, erow = m - 1;
    int scol = 0, ecol = n - 1;

    while (srow <= erow && scol <= ecol) {

        // Top row
        for (int i = scol; i <= ecol; i++) {
            ans.add(matrix[srow][i]);
        }
        srow++;

        // Right column
        for (int j = srow; j <= erow; j++) {
            ans.add(matrix[j][ecol]);
        }
        ecol--;

        //  Bottom row (only if row remains)
        if (srow <= erow) {
            for (int i = ecol; i >= scol; i--) {
                ans.add(matrix[erow][i]);
            }
            erow--;
        }

        // Left column (only if column remains)
        if (scol <= ecol) {
            for (int j = erow; j >= srow; j--) {
                ans.add(matrix[j][scol]);
            }
            scol++;
        }
    }

    return ans;
}
}