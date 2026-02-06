package Funky_Game;

public abstract class FunkyToken {
	public char token;
	public boolean active;
	private int currentRow;
	private int currentColumn;

	public FunkyToken(char token) {
		this.token = token;
		this.active = true;
	}

	public char getToken() {
		return token;
	}

	public boolean isActive() {
		return active;
	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getCurrentColumn() {
		return currentColumn;
	}

	public void setCurrentColumn(int currentColumn) {
		this.currentColumn = currentColumn;
	}

	public abstract void move(FunkyBoard board);

}
