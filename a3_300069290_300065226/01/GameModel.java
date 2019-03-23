public class GameModel {

 // Your code here
	private int width;
	private int height;

	private boolean[][]gameBoard;

	public GameModel(int width, int height){
		this.width = width;
		this.height = height;

		gameBoard = new boolean[height][width];
	}

	public int getHeight(){
		
		return height;
	}

	public int getWidth(){

		return width;

	}

	public boolean isON(int i, int j){

		return gameBoard[i][j];
	}

	public void reset(){
		gameBoard = new boolean[height][width];
	}

	public void set(int i, int j, boolean value){
		gameBoard[j][i] = value;
	}

	public String toString(){

		String toreturn = "[[";
        for (int i = 0; i < gameBoard.length; i++)
        {
            for (int j = 0; j < gameBoard[i].length; j++)
            {
                toreturn += gameBoard[i][j];
               // toreturn += selHolder[i][j];
                if (j != gameBoard[i].length-1)
                    toreturn += ", ";
            } 
            if (i != gameBoard.length-1)
                toreturn += "],\n";
        }
        toreturn += "]]";

        return toreturn;
	}

	public void click (int i, int j) 
	{
		if (this.board[i][j] == true)
			this.board[i][j] = false;
		else
			this.board[i][j] = true;

		
	}
}
