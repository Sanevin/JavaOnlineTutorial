package javaLessonSwing;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

//awt is abstract window toolkit
//Extends JFrame so it can create frames
@SuppressWarnings("serial")
public class JavaLessonTwenty extends JFrame{

	public static void main(String[] args) {
		
		new JavaLessonTwenty();

	}
	public JavaLessonTwenty(){
		
		//sets size, in pixels, of the window
		this.setSize(400, 400);
		
		//centers the window
		//this.setLocationRelativeTo(null);
		
		// enables you to ask questions of the OS
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		// hold the width and height of the screen
		Dimension dim = tk.getScreenSize();
		
		//xPos for the frame to display
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height /2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
		
		// ability to not resize
		this.setResizable(false);
		
		//telling the window to terminate when you close it.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("Testing Frame");
		
		//Frame is the window itself, and a panel is going to surround all of the components
		JPanel thePanel = new JPanel();
		JLabel label1 = new JLabel("Tell me something");
		//change the text of the label after it is created
		
		label1.setText("New Text");
		
		//create mouseover text
		
		label1.setToolTipText("Doesn't do anything");
		
		//creating buttons
		
		JButton button1 = new JButton("Send");
		
		//hiding button borders (ugly)
		//button1.setBorderPainted(false);
		
		// gets rid of background for the button (makes it not look like a button)
		//button1.setContentAreaFilled(false);
		
		//
		button1.setText("New Button");
		
		button1.setToolTipText("It's a button");
		
		thePanel.add(button1);
		
		//Text field
		JTextField textField1 = new JTextField("Type here", 15);
		
		//change size of text field
		textField1.setColumns(10);
		
		//change text in text field
		textField1.setText("Type Again");
		
		//tooltip
		textField1.setToolTipText("It's a field");
		
		thePanel.add(textField1);
		
		//Adding a text area (Large text field) (two ints, size in pixels)
		JTextArea textArea1 = new JTextArea(15, 20);
		
		textArea1.setText("Just a whole bunch of text that is important to test line wrapping\n");
		
		//enables text wrapping
		textArea1.setLineWrap(true);
		
		//makes sure that words stay together while line wrapping
		textArea1.setWrapStyleWord(true);
		
		//counts number of new lines (\n)
		int numOfLines = textArea1.getLineCount();
		
		textArea1.append(" number of lines: " + numOfLines);
		
		//creating a scroll pane
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		thePanel.add(scrollbar1);
		
		thePanel.add(label1);
		this.add(thePanel);
		
		
		//diplays the window
		this.setVisible(true);
		
		//gets mouse focus instantly
		textField1.requestFocus();
		
	}

}
