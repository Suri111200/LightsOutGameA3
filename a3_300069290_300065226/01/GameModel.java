public class GameModel {

 // Your code here
	private int width;
	private int height;

	
	hi

	private int height;
	private int width;

	private boolean[][]gameBoard;

	public GameModel(int width, int height){
		this.width = width;
		this.height = height;

		gameBoard = new boolean[width][height]
	}

	public int getHeight(){
		
		return height;
	}

	public int getWidth(){

		return height;

	}

	public boolean isON(int i, int j){

		return gameBoard[i][j];
	}

}
