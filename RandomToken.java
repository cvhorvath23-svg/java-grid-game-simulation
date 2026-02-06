package Funky_Game;

import java.util.Random;

public class RandomToken extends FunkyToken {
	public RandomToken(char token) {
		super(token);
	}

	public void move(FunkyBoard board) {
		Random random = new Random();

		while (true) {
			int newRow = random.nextInt(board.getRows());
			int newCol = random.nextInt(board.getColumns());

			board.placeToken(this, newRow, newCol);
			board.placeToken(null, getCurrentRow(), getCurrentColumn());
			setCurrentRow(newRow);
			setCurrentColumn(newCol);
			break;

		}

	}

}
