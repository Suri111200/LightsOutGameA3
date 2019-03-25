// YOUR IMPORT HERE

import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class GridButton extends JButton {


    // YOUR VARIABLES HERE
    private int column;
    private int row;
    private int state;
    private BufferedImage img0;
    private BufferedImage img1;
    private BufferedImage img2;
    private BufferedImage img3;
    private ImageIcon icon0;
    private ImageIcon icon1;
    private ImageIcon icon2;
    private ImageIcon icon3;
    private JLabel lbl;

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
        this.column = column;
        this.row =row;
        this.lbl = new JLabel();


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
        
        BufferedImage img0 = ImageIO.read(new File("./Icons/Light-0.png"));
        icon0 = new ImageIcon(img0);
         
       
       

        BufferedImage img1 = ImageIO.read(new File("./Icons/Light-1.png"));
        icon1=new ImageIcon(img1);
        
       
        

        BufferedImage img2 = ImageIO.read(new File("./Icons/Light-2.png"));
        icon2=new ImageIcon(img2);
            
     

        BufferedImage img3 = ImageIO.read(new File("./Icons/Light-3.png"));
        icon3=new ImageIcon(img3);
            
        
     


        if(isOn == true){
                lbl.setIcon(icon0);
                state = 1; 
        }else{ 
                lbl.setIcon(icon1);
                state = 0;
        }
        if(isClicked == true){
            //0 means light off
            //1 means light on
            //2 means light on for solution
            //3 means light on for optimal solution
            if(state == 0 ){
                    lbl.setIcon(icon0);
                    state = 1;
            }
            if(state == 1){
                    lbl.setIcon(icon1);
                    state = 0; 
            }
            if(state == 2 ){
                lbl.setIcon(icon2);
                state = 1;
            }
            if(state == 3){
                lbl.setIcon(icon3);
                state = 1;
            }
        }

    }

    public JLabel getImageIcon(){
        return lbl;
    }
    /**
     * Getter method for the attribute row.
     * 
     * @return the value of the attribute row
     */

    public int getRow() {
        // YOUR CODE HERE
        return this.row;
    }

    /**
     * Getter method for the attribute column.
     * 
     * @return the value of the attribute column
     */

    public int getColumn() {
        // YOUR CODE HERE
        return this.column;
    }

    // YOUR OTHER METHODS HERE
}
