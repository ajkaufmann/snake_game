
public class Game {
	GBoard gb;
	SBoard sb;
	
	public Game() {
		gb = new GBoard();
		sb = new SBoard();
	}
	
	public void launch() {
		// load top scores
		
		// show home page
		StdDraw.setCanvasSize(1000, 1000);
		StdDraw.setScale(0, 100);
		
		StdDraw.square(50, 50, 10);
		
		//Start Game Button Clicked
		gb.play();
	}
}
