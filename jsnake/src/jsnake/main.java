package jsnake;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class main {

	private static AppWindow mainWindow;
	public static KeyListenerTester inputHandler = new KeyListenerTester();
	

	
	public static void main(String[] args)
	{		
		Player player = new Player();
		player.setPosition(new Vector2D(100,50));
		
		
		
		mainWindow = new AppWindow();
		mainWindow.addKeyListener(inputHandler);
	
		
		TimerTask loop = new TimerTask()
		{
			public void run()
			{
				if( inputHandler.keyRight == true)
					player.setPosition(new Vector2D(player.getPosition().x+1,player.getPosition().y));
				if( inputHandler.keyLeft == true)
					player.setPosition(new Vector2D(player.getPosition().x-1,player.getPosition().y));
				if( inputHandler.keyDown == true)
					player.setPosition(new Vector2D(player.getPosition().x,player.getPosition().y+1));
				if( inputHandler.keyUp == true)
					player.setPosition(new Vector2D(player.getPosition().x,player.getPosition().y-1));
				mainWindow.updatePlayer(player);
				mainWindow.repaint();
			}
			
		};
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(loop, 0, 1);
	}

}
