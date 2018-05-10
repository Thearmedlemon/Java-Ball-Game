import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class BrickBreak
{

	double arrowHeadX;
	double arrowHeadY;
	public void initialise()
	{


		boolean init = true;
		int y=1000;
		int x=800;
		int c;

		GameArena board = new GameArena(x, y, init);
		Button[] buttons = new Button[7];
		Text[] buttonlabels = new Text[7];
		Arrow pointer = new Arrow(375,900,425,800,3,"YELLOW",board);


		for (c=1;c<5;c++)
		{
			 buttons[c] = new Button(150*c, 100, 100, 100, "WHITE",c);
			 buttonlabels[c] = new Text(Integer.toString(c),(150*c)-15, 120, 50, "BLACK");



		board.addRectangle(buttons[c]);
		board.addText(buttonlabels[c]);

		arrowHeadX=pointer.getEndX();
		arrowHeadY=pointer.getEndY();
		pointer.setEnd(arrowHeadX-1, arrowHeadY-1);
		//moving the two lines that make up the point ^^


		board.update();

			

		}
	}



}
