 package tictactoe;

public class XOmain {

	public static void main(String[] args) {

		XOclass.initializeBoard(); // Method for initialize this char: '-' to the board.
		int movesLeft = 9;
		boolean gameFinished = false;
		boolean checking = false;
		XOclass.printBoard(); // Method for print the board.

		while (gameFinished == false) {

			for (int i = 0; gameFinished == false; i++) {
				System.out.println("\nPlayer " + XOclass.player + " enter an number: #" + (i + 1));
				XOclass.check[i] = XOclass.in.nextInt();

				for (int y = i - 1; y >= 0; y--) {

					if (XOclass.check[i] == XOclass.check[y]) {
						checking = true;
					}
				}

				if (XOclass.validMove(XOclass.check[i]) && checking == false) {
					if (XOclass.check[i] == 1) {
						XOclass.board[0][0] = XOclass.player;

					} else if (XOclass.check[i] == 2) {
						XOclass.board[0][1] = XOclass.player;

					} else if (XOclass.check[i] == 3) {
						XOclass.board[0][2] = XOclass.player;

					} else if (XOclass.check[i] == 4) {
						XOclass.board[1][0] = XOclass.player;

					} else if (XOclass.check[i] == 5) {
						XOclass.board[1][1] = XOclass.player;

					} else if (XOclass.check[i] == 6) {
						XOclass.board[1][2] = XOclass.player;

					} else if (XOclass.check[i] == 7) {
						XOclass.board[2][0] = XOclass.player;

					} else if (XOclass.check[i] == 8) {
						XOclass.board[2][1] = XOclass.player;

					} else if (XOclass.check[i] == 9) {
						XOclass.board[2][2] = XOclass.player;

					}
					if (XOclass.checkwins() == true) {
						XOclass.printBoard();
						System.out.println("\nPlayer " + XOclass.player + " you win");
						gameFinished = true;
						break;
					}
					movesLeft--;
					XOclass.printBoard();

					if (XOclass.player == 'X') {
						XOclass.player = 'O';
					} else {
						XOclass.player = 'X';
					}
					if (movesLeft == 0) {
						System.out.println("\nIt's a draw.");
						gameFinished = true;
					}

				} else {
					System.out.println("Invalid Input.Try again");
					System.out.println("------------------------");
					i--;
					checking = false;
					XOclass.printBoard();
				}

			}
		}
	}
}
