class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;

        int[] freq = new int[total + 1];

        // Count frequency
        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }

        int[] ans = new int[2];

        // Find repeating and missing
        for (int i = 1; i <= total; i++) {
            if (freq[i] == 2) ans[0] = i;   // repeating
            else if (freq[i] == 0) ans[1] = i;  // missing
        }

        return ans;
        
    }
}