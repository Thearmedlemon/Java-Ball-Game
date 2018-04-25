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
		
		int y=1000;
		int x=800;
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
		JPanel mainPanel = new JPanel();
		mainFrame.add(mainPanel);
		JButton testButton = new JButton();
		mainPanel.setOpaque(true);
		mainPanel.setBackground(Color.BLACK);
		
	
	
		while (true)
		{
				//	board.update();	
		}
	}
}
