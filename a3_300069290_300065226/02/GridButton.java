// YOUR IMPORT HERE

public class GridButton extends JButton {


    // YOUR VARIABLES HERE
    private boolean selected = false;
    


    /**
     * Constructor used for initializing a GridButton at a specific
     * Board location.
     * 
     * @param column
     *            the column of this Cell
     * @param row
     *            the row of this Cell
     */

    public GridButton(int column, int row) {

        // YOUR CODE HERE
    }

   /**
    * sets the icon of the button to reflect the
    * state specified by the parameters
    * @param isOn true if that location is ON
    * @param isClicked true if that location is
    * tapped in the model's current solution
    */ 
    public void setState(boolean isOn, boolean isClicked) {

        // YOUR CODE HERE

    }

 

    /**
     * Getter method for the attribute row.
     * 
     * @return the value of the attribute row
     */

    public int getRow() {
        // YOUR CODE HERE
    }

    /**
     * Getter method for the attribute column.
     * 
     * @return the value of the attribute column
     */

    public int getColumn() {
        // YOUR CODE HERE
    }

    // YOUR OTHER METHODS HERE
    private ImageIcon getImageIcon() {
        int id;
        if (selected) {
            id = NUM_COLOURS + 1;
        } else {
            id = type;
        }
        if (icons[id] == null) {
            String strId = Integer.toString(id);
            icons[id] = new ImageIcon(Cell.class.getResource("/data/ball-"
                + strId + ".png"));
        }
        return icons[id];
    }

}
