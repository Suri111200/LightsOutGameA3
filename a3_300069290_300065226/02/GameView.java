import javax.swing.*;

// your other import here if needed

/**
 * The class <b>GameView</b> provides the current view of the entire Game. It extends
 * <b>JFrame</b> and lays out a matrix of <b>GridButton</b> (the actual game) and 
 * two instances of JButton. The action listener for the buttons is the controller.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public class GameView extends JFrame {

    // your variables here
    private JLabel input;
    private GameModel model;

    /**
     * Constructor used for initializing the Frame
     * 
     * @param gameModel
     *            the model of the game (already initialized)
     * @param gameController
     *            the controller
     */

    public GameView(GameModel gameModel, GameController gameController) {

        // YOUR CODE HERE
        Container cbLayOut = setLayOut(new GridLayOut(gameModel.getWidth(), gameModel.getHeight()));
        this.model = gameModel;

        for (int i = 0; i < model.getWidth(); i++)
        {
            for (int j = 0; j < model.getHeight(); j++)
            {
              JCheckBox cb = new JCheckBox;
              cb.setSelected(false); 
              cb.setIcon(new ImageIcon("Icons/02.png"));
              cb.setSelectedIcon(new ImageIcon("Icons/01.png"))  
            }
        }


    }

    /**
     * updates the status of the board's GridButton instances based 
     * on the current game model, then redraws the view
     */

    public void update(){

        // YOUR CODE HERE
        input.setText(model.toString());
    }

    /**
     * returns true if the ``solution'' checkbox
     * is checked
     *
     * @return the status of the ``solution'' checkbox
     */

    public boolean solutionShown(){

        // YOUR CODE HERE

    }

}
