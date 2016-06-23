package com.company;

public class Main {
    int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
	    int[][] grid = {{1,2,5},{3,2,1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int[][] save = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                save[i][j] = Integer.MIN_VALUE;
            }
        }
        return minPathSum1(grid, save, grid.length, grid[0].length);
    }

    public static int minPathSum1(int[][] grid, int[][] save, int row, int column) {
        if(save[row-1][column-1] >= 0) {
            return save[row-1][column-1];
        }
        if(row == 1) {
            int sum = 0;
            for(int j = 0; j < column; j++) {
                sum += grid[0][j];
            }
            return sum;
        }
        else if(column == 1) {
            int sum = 0;
            for(int i = 0; i < row; i++) {
                sum += grid[i][0];
            }
            return sum;
        }
        else {
            int min =  Math.min(minPathSum1(grid, save, row, column-1) + grid[row-1][column-1],
                    minPathSum1(grid, save, row-1, column) + grid[row-1][column-1]);
            save[row - 1][column - 1] = min;
            return min;
        }
    }
}
