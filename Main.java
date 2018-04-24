public class Main
{
	public static void main(String[] args)
	{
		int y=1000;
		int x=1000;
		boolean init = true;
		GameArena board = new GameArena(x, y, init);
		Button button1 = new Button(100, 100, 100, 100, "WHITE",1);
		board.addRectangle(button1);
		
		while (true)
		{
					board.update();	
		}
	}
}
