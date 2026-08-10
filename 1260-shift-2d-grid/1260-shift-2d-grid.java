class Solution {// MATRIX  2D
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;    // Number of rows
        int col = grid[0].length; // Number of columns
        int total = row * col;      // Total number of elements in the 2D grid
        
        // Effective shift: shifting total times results in the same grid
        int shift = k % total;
        
        // Initialize the result list of lists
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            result.add(new ArrayList<>());
        }
        
        // Fill the new grid by mapping 2D coordinates to 1D index positions
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Compute current target 1D index
                int targetIndex = i * col + j;
                
                // Calculate the original 1D index that shifted into this position
                int originalIndex = (targetIndex - shift + total) % total;
                
                // Convert original 1D index back to 2D coordinates (row and col)
                int origRow = originalIndex / col;
                int origCol = originalIndex % col;
                
                // Add the shifted value into the corresponding row of result
                result.get(i).add(grid[origRow][origCol]);
            }
        }
        
        return result;
    }
}