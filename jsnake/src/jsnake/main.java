package jsnake;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class main {

	private static AppWindow mainWindow;
	
	

	
	public static void main(String[] args) throws IOException
	{		
		Player player = new Player();
		player.setPosition(new Vector2D(100,50));
		
		mainWindow = new AppWindow();
		
		
		TimerTask loop = new TimerTask()
		{
			public void run()
			{
				player.setPosition(new Vector2D(player.getPosition().x+1,player.getPosition().y));
				mainWindow.updatePlayer(player);
			}
			
		};
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(loop, 0, 100);
	}

}
