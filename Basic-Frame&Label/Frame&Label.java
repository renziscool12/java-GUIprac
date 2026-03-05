import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        JLabel label = new JLabel(); // creates a label
        Border border = BorderFactory.createLineBorder(Color.pink, 6); // creates a border with line color and thickness

        ImageIcon image2 = new ImageIcon(GUI.class.getResource("/Jalgay.jpg"));

        label.setText("Top 1 bading in University of Mindanao"); // sets text of label
        label.setIcon(image2); // sets the image of the label

        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of image icon
        label.setForeground(Color.pink); // set text color to green
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 30)); // set font of text
        label.setIconTextGap(10); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // sets border of label to the border variable created above
        label.setVerticalAlignment(JLabel.CENTER); // sets vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // sets horizontal position of icon + text within label

        JFrame frame = new JFrame("Nah I'd kaba"); // creates a frame and creates a title for the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setVisible(true); // makes frame visible
        frame.add(label); // adds label to the frame
        frame.pack(); // sizes the frame so that all its contents are at or above their preferred
                      // sizes

        ImageIcon image = new ImageIcon(GUI.class.getResource("/ewwr.jpg"));
        frame.setIconImage(image.getImage()); // sets the image icon of the frame
    }
}
