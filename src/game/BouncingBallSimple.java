package game;

import java.awt.*;
import java.util.Formatter;
import javax.swing.*;


public class BouncingBallSimple extends JPanel {
	
	// Container box's width and height  
	private static final int BOX_WIDTH = 640;  
	private static final int BOX_HEIGHT = 480;  
	
	// Ball's properties  
	private float ballRadius = 200; // Ball's radius  
	private float ballX = ballRadius + 50; // Ball's center (x, y)  
	private float ballY = ballRadius + 20; 
	private float ballSpeedX = 3; // Ball's speed for x and y  
	private float ballSpeedY = 2;  
	private static final int UPDATE_RATE = 30; // Number of refresh per second  
	
	/** Constructor to create the UI components and init game objects. */ 
	
	public BouncingBallSimple() {  this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));  // Start the ball bouncing (in its own thread)  
	Thread gameThread = new Thread() {  
		public void run() {  
			while (true) { // Execute one update step  
		// Calculate the ball's new position 
				ballX += ballSpeedX;
			}
		};
	}

	public static void main(String[] args) {
	
	}

}
