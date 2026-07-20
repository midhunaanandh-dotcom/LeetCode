class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long actual_sum = 0;
        long actual_squares = 0;

        long n = grid.length * grid.length;

        long predicted_sum = n*(n+1)/2;
        long predicted_squares = n*(n+1)*(2*n + 1)/6;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                actual_sum += grid[i][j];
                actual_squares += (grid[i][j])*(grid[i][j]);
            }
        }

        long diff_sum = actual_sum - predicted_sum;
        long diff_squares = actual_squares - predicted_squares; 

        long sum_a_b = diff_squares/diff_sum;
        long b = (diff_sum + sum_a_b)/2;
        long a = b - diff_sum;

        return new int[] {(int) b, (int) a};
    }
}