package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece( Board board) {	
		this.board = board;
		position = null; // Java por padr�o, j� deixa em null
		
	}
	
	protected Board getBoard() {
		
		return board;
	}
			
}