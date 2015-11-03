package jsnake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerTester extends JFrame implements KeyListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	JLabel label;
	
	public boolean keyRight;
	public boolean keyLeft;
	public boolean keyUp;
	public boolean keyDown;
	
	public KeyListenerTester() 
	{
		
		this.keyRight = false;
		this.keyDown = false;
		this.keyUp = false;
		this.keyLeft = false;
		
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

    	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.keyRight = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.keyLeft = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.keyUp = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.keyDown = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.keyRight = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.keyLeft = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.keyUp = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.keyDown = false;
        }
    }

   
}