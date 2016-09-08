package javaLessonSwing;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

import java.awt.event.*;

// interfaces and GUI event handling

@SuppressWarnings("serial")
public class JavaLessonTwentyOne extends JFrame {
	
	JButton button1 = new JButton("Click here");
	JTextField textField1 = new JTextField("", 15);
	JTextArea textArea1 = new JTextArea(15, 20);
	int buttonClicked;
	
	public static void main(String[] args){
		
		new JavaLessonTwentyOne();
		
	}
	
	public JavaLessonTwentyOne(){
		
		this.setSize(400, 400);
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension dim = tk.getScreenSize();
		
		//xPos for the frame to display
				int xPos = (dim.width / 2) - (this.getWidth() / 2);
				int yPos = (dim.height /2) - (this.getHeight() / 2);
				
				this.setLocation(xPos, yPos);
				
				// ability to not resize
				this.setResizable(false);
				
				//telling the window to terminate when you close it.
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				this.setTitle("Second Testing Frame");
				
				
				//Frame is the window itself, and a panel is going to surround all of the components
				JPanel thePanel = new JPanel();
				
				
				//button1 = new JButton("Click here");
				
				ListenForButton lForButton = new ListenForButton();
				
				button1.addActionListener(lForButton);
				
				//hiding button borders (ugly)
				//button1.setBorderPainted(false);
				
				// gets rid of background for the button (makes it not look like a button)
				//button1.setContentAreaFilled(false);
				
				thePanel.add(button1);
				
				//Text field
				//JTextField textField1 = new JTextField("", 15);
				
				ListenForKeys lForKeys = new ListenForKeys();
				
				textField1.addKeyListener(lForKeys);
				
				thePanel.add(textField1);
				
				//Adding a text area (Large text field) (two ints, size in pixels)
				//JTextArea textArea1 = new JTextArea(15, 20);
				
				textArea1.setText("Tracking Events \n");
				
				//enables text wrapping
				textArea1.setLineWrap(true);
				
				//makes sure that words stay together while line wrapping
				textArea1.setWrapStyleWord(true);
			
				
				//creating a scroll pane
				JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				thePanel.add(scrollbar1);
				
				
				this.add(thePanel);
				
				ListenForWindow lForWindow = new ListenForWindow();
				
				this.addWindowListener(lForWindow);
				
				
				//displays the window
				this.setVisible(true);
				
				//tracking mouse movements
				ListenForMouse lForMouse = new ListenForMouse();
				thePanel.addMouseListener(lForMouse);
		
	}
	
	//implement listeners
	private class ListenForButton implements ActionListener {
		
		public void actionPerformed(ActionEvent e){
			
			if (e.getSource() == button1){
				
				buttonClicked++;
				
				textArea1.append("Button clicked " + buttonClicked + " times\n");
				// Could also do
				/*
				 * return information about the button itself
				 * e.getSource().toString();
				 * 
				 */
				
			}
		}
		
	}
	private class ListenForKeys implements KeyListener{

		// when a key a pressed
		public void keyPressed(KeyEvent e) {
			textArea1.append("Key Hit " + e.getKeyChar() + "\n");
			
		}

		// when a key is pressed and released
		public void keyReleased(KeyEvent arg0) {
			
		}

		// whenever a key is hit
		public void keyTyped(KeyEvent arg0) {
			
		}
		
	}
	private class ListenForWindow implements WindowListener{

		@Override // when a window is the active window
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea1.append("Window is active");
			
		}

		//when a window is closed using the dispose function
		//this.dispose();
		
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// called when window is closed from the menu
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// called when window is no longer the active window
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea1.append("Window is not active");
			
		}

		// window is unminimized
		public void windowDeiconified(WindowEvent arg0) {
			textArea1.append("Window in normal state");
			
		}

		// window is minimized
		public void windowIconified(WindowEvent arg0) {
			textArea1.append("Window is minimized");
			
		}

		// when the window is first created
		public void windowOpened(WindowEvent e) {
			textArea1.append("Window is created");
			
		}
		
	}
	private class ListenForMouse implements MouseListener{

		// called whenever the mouse is clicked
		public void mouseClicked(MouseEvent e) {
			// get mouse position in the panel
			textArea1.append("Mouse Panel pos: " + e.getX() + " " + e.getY() + "\n");
			// get mouse position on the screen
			textArea1.append("Mouse Screen pos: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
			// get which mouse button was clicked
			textArea1.append("Mouse Button: " + e.getButton() + " " + e.getButton() + "\n");
			// get how many clicks
			textArea1.append("Mouse Clicks: " + e.getClickCount() + " " + e.getClickCount() + "\n");
		}

		@Override // mouse entered the mouse listener area
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// mouse left the mouse listener area
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
