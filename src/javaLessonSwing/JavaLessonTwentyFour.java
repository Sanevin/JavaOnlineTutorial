package javaLessonSwing;
import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")
// combo boxes
public class JavaLessonTwentyFour extends JFrame{
	
	JComboBox favoriteShows;
	JButton button1;
	String infoOnComponent = "";

	public static void main(String[] args) {
		
		new JavaLessonTwentyFour();

	}
	
	public JavaLessonTwentyFour(){
		
		this.setSize(400, 400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Fourth Frame");
		
		JPanel thePanel = new JPanel();
		
		String[] shows = {"Breaking Bad", "Life on Mars", "Doctor Who"};
		
		favoriteShows = new JComboBox(shows);
		
		favoriteShows.addItem("Pushing Daisies");
		
		thePanel.add(favoriteShows);
		
		button1 = new JButton("Get Answer");
		
		ListenForButtons lForButton = new ListenForButtons();
		
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		this.add(thePanel);
		
		this.setVisible(true);
		
		favoriteShows.insertItemAt("Dexter", 1);
		
		favoriteShows.setMaximumRowCount(3);
		
		favoriteShows.removeItem("Dexter");
		
		favoriteShows.removeItemAt(1);
		
	}
	private class ListenForButtons implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == button1){
				
				favoriteShows.setEditable(true);
				
				infoOnComponent += "Item at 0: " + favoriteShows.getItemAt(0) + "\n";
				
				infoOnComponent += "Num Of Shows: " + favoriteShows.getItemCount() + "\n";
				
				infoOnComponent += "Selected ID: " + favoriteShows.getSelectedIndex() + "\n";
				
				infoOnComponent += "Selected Value: " + favoriteShows.getSelectedItem() + "\n";
				
				infoOnComponent += "Are Editable: " + favoriteShows.isEditable() + "\n";
				
				JOptionPane.showMessageDialog(JavaLessonTwentyFour.this,  infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				infoOnComponent = "";
				
			}
			
		}
		
	}

}
