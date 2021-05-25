package swingproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SwingProject {
	public static void main(String[] args) {
		 System.out.println("Hello world");
		 Abc obj = new Abc();
	}
}

 class Abc extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField AB, BC, CD, DE;
	JLabel d1, r, d2, d3, at, ax, ay;
	JButton b, img;

	public Abc() {
		
		d1 = new JLabel("d1");
		AB = new JTextField(5);
		r = new JLabel("r");
		BC = new JTextField(5);
		d2 = new JLabel("d2");
		CD = new JTextField(5);
		d3 = new JLabel("d3");
		DE = new JTextField(5);
		b = new JButton("Check");
		at = new JLabel("The Centroid of the Figure lies at(x, y): ");
		ax = new JLabel("");
		ay = new JLabel("");
		img = new JButton("Click here to view the diagram!");
		add(d1);
		add(AB);
		add(r);
		add(BC);
		add(d2);
		add(CD);
		add(d3);
		add(DE);
		add(b);
		add(ax);
		add(ay);
		add(img);
		
		img.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Image();
				dispose();
			}
		}
				
		  
		);

		
		b.addActionListener(ae -> {
			int len_AB = Integer.parseInt(AB.getText());	 
			int rad_BC = Integer.parseInt(BC.getText());
			int len_CD = Integer.parseInt(CD.getText());
			int len_DE = Integer.parseInt(DE.getText());
			
			//start
			
			double len_BC, x_cent_BC, x_cent_CD, y_cent_CD, x_cent_DE, y_cent_DE, x_cent_AB, y_cent_AB;
			double len_x_AB, len_y_AB, len_x_BC, len_y_BC, len_x_CD, len_y_CD, y_cent_BC;
			
			len_BC = 3.14 * rad_BC;

					x_cent_AB = len_AB/2;
					y_cent_AB = 2*rad_BC;

					if (x_cent_AB == len_CD)
					    x_cent_AB = 0;
					else
					    x_cent_AB = x_cent_AB - len_CD;


					x_cent_BC = -(((2*rad_BC)/3.14) + len_CD);
					y_cent_BC = rad_BC;

					x_cent_CD = -(len_CD/2);
					y_cent_CD = 0;

					x_cent_DE = len_DE * 0.3536;
					y_cent_DE = x_cent_DE;

					len_x_AB = len_AB * x_cent_AB;
					len_y_AB = len_AB * y_cent_AB;

					len_x_BC = len_BC * x_cent_BC;
					len_y_BC = len_BC * y_cent_BC;

					len_x_CD = len_CD * x_cent_CD;
					len_y_CD = 0;

					double len_x_DE = len_DE * x_cent_DE;
					double len_y_DE = len_DE * y_cent_DE;

					double sum_len = len_AB + len_BC + len_CD + len_DE;
					double sum_len_x = len_x_AB + len_x_BC + len_x_CD + len_x_DE;
					double sum_len_y = len_y_AB + len_y_BC + len_y_CD + len_y_DE;

					double res_x_cent = sum_len_x / sum_len;
					double res_y_cent = sum_len_y / sum_len;
			        
			
			//end
					 ax.setText(res_x_cent + ", ");
					 ay.setText(res_y_cent + "");
		}
				
				
		);
		
		
	
		getContentPane().setBackground(new java.awt.Color(204, 92, 84));
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

	
}