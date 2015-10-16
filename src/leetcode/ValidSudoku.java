package leetcode;

import java.util.HashSet;

public class ValidSudoku {
	// http://www.cnblogs.com/yuzhangcmu/p/4067608.html

	public boolean isValidSudoku(char[][] board) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return false;
		}

		int rows = board.length;
		int cols = board[0].length;

		// exam the rows;
		for (int i = 0; i < rows; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for (int j = 0; j < cols; j++) {
				char c = board[i][j];
				if (c != '.') {
					if (set.contains(c)) {
						return false;
					}
					set.add(c);
				}
			}
		}

		// exam the cols;
		for (int i = 0; i < cols; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for (int j = 0; j < rows; j++) {
				char c = board[j][i];
				if (c != '.') {
					if (set.contains(c)) {
						return false;
					}
					set.add(c);
				}
			}
		}

		// exam the square;
		for (int i = 0; i < rows; i += 3) {
			for (int j = 0; j < cols; j += 3) {
				HashSet<Character> set = new HashSet<Character>();
				for (int k = 0; k < 9; k++) {
					char c = board[i + k / 3][j + k % 3];
					if (c == '.')
						continue;

					if (set.contains(c)) {
						return false;
					}
					set.add(c);
				}

			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
