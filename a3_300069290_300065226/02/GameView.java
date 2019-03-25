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
        Container cbLayOut = setLayOut(new GridLayOut(gameModel.getHeight(), gameModel.getWidth()));
        this.model = gameModel;

        Container otherButtonsLayout = setLayOut(new GridLayOut(4, 1));

        JButton reset;
        reset = new JButton("Reset");
        reset.setActionCommand("reset")
        reset.addActionListener(gameController);
        otherButtonsLayout.add(reset);

        JButton random;
        random = new JButton("Random");
        random.setActionCommand('random');
        random.addActionListener(gameController);
        otherButtonsLayout.add(random);

        JCheckBox solution;
        solution = new JCheckBox("Solution");
        solution.setActionCommand('solution');
        solution.addActionListener(gameController);
        otherButtonsLayout.add(solution);
        

        JButton quit;
        quit = new JButton("Quit");
        quit.setActionCommand('quit');
        quit.addActionListener(gameController);
        otherButtonsLayout.add(quit);
        

        for(int i=0; i<gameModel.getHeight(); i++){
            for(int j=0; j<gameModel.getWidth(); j++){
                gridButton = new GridButton(i,j);
                gridButton.setState(gameModel.isON(i,j) ,false);
                cbLayOut.add(gridButton.getImageIcon()); 
            }
        }


        add (cbLayOut);
        add(otherButtonsLayout);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        pack();


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
