package jsnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppWindow extends JFrame
{
	
	private JPanel playerPanel;
	

	
	public void updatePlayer(Player player)
	{
		playerPanel.setBounds(player.getPosition().x - player.getSize().x,
							  player.getPosition().y - player.getSize().y,
							  player.getSize().x, player.getSize().y);
		
	}
	
	public AppWindow()
	{
		setLayout(null);
		setSize(new Dimension(800,600));
		setVisible(true);
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		playerPanel = new JPanel();
		playerPanel.setEnabled(true);
		playerPanel.setBackground(Color.WHITE);
		playerPanel.setVisible(true);
		playerPanel.setBounds(400-32, 300-32, 32, 32);
		
		add(playerPanel);
		
		repaint();
	}
}
