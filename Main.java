import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main
{
	public static void main(String[] args)
	{
		
		int y=300;
		int x=800;
		int by=50;
		int bx=50;
		JFrame mainFrame = new JFrame("Main Menu");
		mainFrame.setVisible(true);
		mainFrame.setSize(x,y);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*GameArena board = new GameArena(x, y, init);
		Button[] buttons = new Button[7];
		Text[] buttonlabels = new Text[7];
		for (x=1;x<6;x++){
			 buttons[x] = new Button(150*x, 100, 100, 100, "WHITE",x);
			 buttonlabels[x] = new Text(Integer.toString(x),(150*x)-15, 120, 50, "BLACK");
			 
		board.addRectangle(buttons[x]);
		board.addText(buttonlabels[x]);
		*/
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainFrame.add(mainPanel);
		JButton testButton = new JButton();
		testButton.setOpaque(true);
		JLabel Title = new JLabel("MEME");
		Title.setOpaque(true);
		Title.setForeground(Color.GREEN);
		testButton.setBackground(Color.WHITE);
		
		mainPanel.setOpaque(true);
		mainPanel.setBackground(Color.BLACK);
		
		mainPanel.add(testButton, BorderLayout.PAGE_START);
		
		mainPanel.add(Title,BorderLayout.PAGE_END);
		
		BrickBreak BB = new BrickBreak();
		BB.initialise();
	
		while (true)
		{
				//	board.update();	
		}
	}
}
