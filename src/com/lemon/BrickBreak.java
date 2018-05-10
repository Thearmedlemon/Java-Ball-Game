package com.lemon;

import com.lemon.providedstuff.Arrow;
import com.lemon.providedstuff.Button;
import com.lemon.providedstuff.Text;

public class BrickBreak
{

	private double arrowHeadX;
	private double arrowHeadY;


	private int y = 1000;
	private int x = 800;
	private int c;
	private GameArena board = new GameArena(x, y, true);

	public void initialise() {





		Button[] buttons = new Button[7];
		Text[] buttonlabels = new Text[7];
		Arrow pointer = new Arrow(375,900,425,800,3,"YELLOW",board);


		for (c = 1; c < 5; c++) {
			buttons[c] = new Button(150 * c, 100, 100, 100, "WHITE", c);
			buttonlabels[c] = new Text(Integer.toString(c), (150 * c) - 15, 120, 50, "BLACK");


			board.addRectangle(buttons[c]);
			board.addText(buttonlabels[c]);

			arrowHeadX = pointer.getEndX();
			arrowHeadY = pointer.getEndY();

			//moving the two lines that make up the point ^^


			board.update();


		}

		while (true) {
			System.out.println("123");
		}
	}

	//	write a method for moving the arrow
	public void ArrowAim() {
		if (board.upPressed()) {
			System.out.println("123");
		}
	}


}
