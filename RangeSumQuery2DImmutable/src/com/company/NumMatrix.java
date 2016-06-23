package com.company;

public class NumMatrix {


    public static void main(String[] args) {
	// write your code here
    }

    int save[];
    int width;

    public NumMatrix(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        width = matrix[0].length;
        int height = matrix.length;
        save = new int[width * height + 1];
        save[0] = 0;
        int sum = 0;
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                sum += matrix[i][j];
                save[i * width + j + 1] = sum;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1; i <= row2; i++) {
            sum += save[i * width + col2 + 1] - save[col1 + i * width];
        }
        return sum;
    }
}
