package tictactoe;

import java.util.Scanner;

public class XOclass {

	public static Scanner in = new Scanner(System.in);
	public static char[][] board = new char[3][3];
	public static char player = 'X';
	public static int[] check = new int[9];
	
	

	public static void initializeBoard() { // Method for initialize this char: '-' to the board.
		for (int raw = 0; raw < 3; raw++) {
			for (int col = 0; col < 3; col++) {
				board[raw][col] = '-';
			}
		}
	}

	public static void printBoard() { // Method for print the board
		System.out.print("\t\t\t-------------");
		for (int row = 0; row < board.length; row++) {
			System.out.println("");
			System.out.print("\t\t\t| ");

			for (int col = 0; col < board.length; col++) {
				System.out.print(board[row][col] + " | ");
			}
			System.out.print("\n\t\t\t-------------");
		}
	}

	public static boolean validMove(int r) { // Method that are checking the input if is valid or not means between[1-9]
		if (r >= 1 && r <= 9)
			return true;
		else
			return false;
	}

	public static boolean checkwins() { // Method that check if there is a winner or not

		if (board[0][0] == player && board[0][1] == player && board[0][2] == player) {
			return true;
		}
		if (board[1][0] == player && board[1][1] == player && board[1][2] == player) {
			return true;
		}
		if (board[2][0] == player && board[2][1] == player && board[2][2] == player) {
			return true;
		}

		if (board[0][0] == player && board[1][0] == player && board[2][0] == player) {
			return true;
		}
		if (board[0][1] == player && board[1][1] == player && board[2][1] == player) {
			return true;
		}
		if (board[0][2] == player && board[1][2] == player && board[2][2] == player) {
			return true;
		}

		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		}
		if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		} else {
			return false;
		}
	}

	public static void checkRep() {		// Method for checking if is a duplicate input or case.

		for (int q = 0; q < check.length; q++) {

			for (int y = q - 1; y >= 0; y--) {

				if (check[q] == check[y]) {
					q--;
					System.out.println("invalid num");
				}
			}
		}
	}


}
