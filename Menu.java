import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Menu extends JFrame implements ActionListener
{

  JFrame mainFrame;
  JButton testButton;

  public void stuffMaker()
	{
		int y=300;
		int x=800;
		int by=50;
		int bx=50;
		JFrame mainFrame = new JFrame("Main Menu");

		mainFrame.setSize(x,y);
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setOpaque(true);
		mainPanel.setBackground(Color.BLACK);


		testButton = new JButton();
		testButton.setOpaque(true);
		testButton.setBackground(Color.BLACK);
		testButton.setText("LEVEL 1");
		testButton.setForeground(Color.GREEN);
		testButton.addActionListener(this);


		JLabel Title = new JLabel("BLOCK BREAKER", SwingConstants.CENTER);
		//Title.setOpaque(true);
		Title.setForeground(Color.GREEN);
		Title.setFont(new Font("Consolas", Font.PLAIN,30));



		mainFrame.add(mainPanel);

		mainPanel.add(testButton, BorderLayout.CENTER);

		mainPanel.add(Title,BorderLayout.NORTH);

		mainFrame.setVisible(true);

	}


  public void actionPerformed(ActionEvent e)
	{
			if(e.getSource()==testButton)
			{
        Main.levelLauncher();

				//BrickBreak BB = new BrickBreak();

				//System.out.println("test");
				//BB.initialise();
				//close();
				//mainFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));

			}
	}
}
