package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // O java, j� considera como null
	}
	
	protected Board getBoard() {
		return board;
	}
	
	
}
