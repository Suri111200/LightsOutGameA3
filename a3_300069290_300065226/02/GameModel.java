public class GameModel {

 // Your code here
	private int width;
	private int height;

	private boolean[][]gameBoard;

	private int numberOfSteps = 0;

	private Solution solution;

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
		numberOfSteps++;

		if (this.gameBoard[i][j])
			this.gameBoard[i][j] = false;
		else
			this.gameBoard[i][j] = true;

        if((i > 0) && (gameBoard[i-1][j])) {
            this.gameBoard[i-1][j] = false;
        }
        else
        	this.gameBoard[i-1][j] = true;
        
        if((i < height -1 ) && (gameBoard[i+1][j])) {
            this.gameBoard[i+1][j] = false;
        }
        else
        	this.gameBoard[i+1][j] = true;
        
        if((j > 0) && (gameBoard[i][j-1])) {
            this.gameBoard[i][j-1] = false;
        }
        else
        	this.gameBoard[i][j-1] = true;
        
        if((j < (width - 1)) && (gameBoard[i][j+1])) {
            this.gameBoard[i][j+1] = false;
        }
        else
        	this.gameBoard[i][j+1] = true;
	}

	public int getNumberOfSteps() {
		return numberOfSteps;
	}

	public boolean isFinished() {
		for (int i = 0; i < gameBoard.length; i++)
		{
			for (int j = 0; j < gameBoard[i].length; j++)
	  		{
	  			if (gameBoard[i][j] == false)
	  				return false;
			}
		}
		return true;
	}


	public void randomize () {
		int random = (int)(Math.random() * 2) + 1;
		boolean rand = false;

		for (int i = 0; i < gameBoard.length; i++)
		{
			for (int j = 0; j < gameBoard[i].length; j++)
	  		{
	  			random = (int)(Math.random() * 2) + 1;
	  			if (random == 1)
	  				gameBoard[i][j] = true;
	  			else
	  				gameBoard[i][j] = false;
			}
		}

		if (LightsOut.solve(this)==0)
			this.randomize();
	}

	public void setSolution() {
		solution = LightsOut.solveShortest(this);
	}

	public boolean solutionSelects(int i, int j) 
	{
		if (solution != null)
		{
			if (solution.get(i,j))
			{
				return true;
			}
		}
		else
			return false;
	}

}