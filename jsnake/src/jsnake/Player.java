package jsnake;

public class Player
{
	private Vector2D size;
	private Vector2D position;
	public Vector2D getSize() {
		return size;
	}
	public void setSize(Vector2D size) {
		this.size = size;
	}
	public Vector2D getPosition() {
		return position;
	}
	public void setPosition(Vector2D position) {
		this.position = position;
	}
	
	public Player()
	{
		setSize(new Vector2D(16,16));
		setPosition(new Vector2D(400,300));
	}
	
	
}
