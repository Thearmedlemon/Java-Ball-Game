public class Main
{
	public static void main(String[] args)
	{
		int y=1000;
		int x=1000;
		boolean init = true;
		GameArena board = new GameArena(x, y, init);
		Button[] buttons = new Button[7];
		Text[] buttonlabels = new Text[7];
		for (x=1;x<6;x++){
			 buttons[x] = new Button(150*x, 100, 100, 100, "WHITE",x);
			 buttonlabels[x] = new Text(Integer.toString(x),(150*x)-15, 120, 50, "BLACK");
		board.addRectangle(buttons[x]);
		board.addText(buttonlabels[x]);
	}
	
		while (true)
		{
					board.update();	
		}
	}
}
