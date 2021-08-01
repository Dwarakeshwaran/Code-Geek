package dwarki.exercise.java.leetcode.arrays;

public class NumberOfIslands {

	public static void main(String[] args) {

		char[][] grid = { { '1', '0' }, {'0', '1' } };

		System.out.println(largestIsland(grid));

	}

	public static int largestIsland(char[][] grid) {

		int islandCount = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == '1') {

					islandCount++;
					change1sTo0s(grid, i, j);

				}
			}
		}
		return islandCount;
	}

	// Depth First Search Algorithm
	public static void change1sTo0s(char[][] grid, int row, int col) {

		if (row < 0 || col < 0 || row > grid.length - 1 || col > grid.length - 1 || grid[row][col] == '0')
			return;

		grid[row][col] = '0';

		change1sTo0s(grid, row - 1, col);// left
		change1sTo0s(grid, row + 1, col);// right
		change1sTo0s(grid, row, col - 1);// top
		change1sTo0s(grid, row, col + 1);// bottom

	}

}
