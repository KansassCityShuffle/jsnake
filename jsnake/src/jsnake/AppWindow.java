package jsnake;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import javax.imageio.*;  

public class AppWindow extends JFrame
{
	
	private ImagePanel playerPanel;
	

	
	public void updatePlayer(Player player)
	{
		playerPanel.setBounds(player.getPosition().x - player.getSize().x,
							  player.getPosition().y - player.getSize().y,
							  player.getSize().x, player.getSize().y);
		
	}
	
	public AppWindow() throws IOException
	{
		setLayout(null);
		setSize(new Dimension(800,600));
		setVisible(true);
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		Image playerTexture = ImageIO.read(getClass().getResource("fisher.png"));
		
		playerPanel = new ImagePanel(playerTexture);
		playerPanel.setEnabled(true);
		playerPanel.setBackground(Color.BLACK);
		playerPanel.setVisible(true);
		playerPanel.setBounds(400-32, 300-32, 32, 32);
		
		add(playerPanel);
		
		repaint();
	}
}
