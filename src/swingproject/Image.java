package swingproject;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Image {
 public static void main(String args[]) {
	 
  JFrame frame = new JFrame();
  ImageIcon icon = new ImageIcon("../EMPng.png");
  JLabel label = new JLabel(icon);
  
  frame.add(label);
  
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);
  frame.setSize(400, 400);
 }
}