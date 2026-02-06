package Funky_Game;

public class FunkyBoard {
	private FunkyToken[][] board;

	public FunkyBoard(int size) {
		board = new FunkyToken[size][size];
		initializeBoard();
	}

	public FunkyToken[][] getBoard() {
		return board;
	}

	public int getRows() {
		return board.length;
	}

	public int getColumns() {
		return board[0].length;
	}

	public void initializeBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = null;
			}
		}
	}

	public void displayBoard() {
		for (FunkyToken[] row : board) {
			System.out.print("|");
			for (FunkyToken token : row) {
				if (token != null) {
					System.out.print(token.getToken() + "|");
				} else {
					System.out.print("-|");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void placeToken(FunkyToken token, int row, int column) {
		board[row][column] = token;
	}

	public FunkyToken getWinner() {
		int activeCount = 0;
		FunkyToken winner = null;

		for (FunkyToken[] row : board) {
			for (FunkyToken token : row) {
				if (token != null && token.isActive()) {
					activeCount++;
					winner = token;
				}
			}
		}

		return activeCount == 1 ? winner : null;
	}
}