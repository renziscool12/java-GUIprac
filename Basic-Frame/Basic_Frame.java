package yes2;
import java.awt.Color;

import javax.swing.*;

public class GUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // creates a frame

        frame.setSize(420, 420); // sets the size
        frame.setTitle("Bayot Si Jal"); // sets the title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setVisible(true); // makes frame visible
        
        ImageIcon image = new ImageIcon("ewwr.jpg"); // 	create an image icon
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(0, 223, 255));
        
        // OTHERS: 
        
        //frame.getContentPane().setBackground(Color.CYAN); // change color of background
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // wont exit
    }
}

