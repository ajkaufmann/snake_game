import java.util.LinkedList;

public class Snake implements Drawable {
	LinkedList<Block> list;
	
	public void draw() {
		for(Block b : list) {
			b.draw();
		}
	}
	
	public void update() {
		for(Block b : list) {
			// update each block's location
		}
	}
	
	public void grow() {
		
	}
}
