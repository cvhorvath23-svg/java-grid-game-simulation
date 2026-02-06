package Funky_Game;

import java.util.Random;

public class MoveOneToken extends FunkyToken {
	public MoveOneToken(char token) {
		super(token);
	}

	public void move(FunkyBoard board) {
		Random random = new Random();
		int[] directions = { -1, 0, 1 };

		while (true) {

			int newRow = getCurrentRow() + directions[random.nextInt(3)];
			int newCol = getCurrentColumn() + directions[random.nextInt(3)];

			if (isValidMove(board, newRow, newCol)) {
				if (board.getBoard()[newRow][newCol] != null) {
				}
				board.placeToken(this, newRow, newCol);
				board.placeToken(null, getCurrentRow(), getCurrentColumn());
				setCurrentRow(newRow);
				setCurrentColumn(newCol);
				break;
			}
		}
	}

	private boolean isValidMove(FunkyBoard board, int row, int column) {
		return row > 0 && row < board.getRows() && column > 0 && column < board.getColumns();
	}

}
