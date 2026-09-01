package pongGame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.BasicStroke;

public class PongPanel extends JPanel implements ActionListener, KeyListener {
	
	final Color BACKGROUND_COLOUR = Color.PINK;
	private final static int TIMER_DELAY = 5;
	final int PANEL_WIDTH = 800;
	final int PANEL_HEIGHT = 600;
	public Ball ball;
	public Paddle paddle1;
	public Paddle paddle2;
	public GameState gameState = GameState.Initialising;
	
	public PongPanel() {	
		setBackground(BACKGROUND_COLOUR);
		update();	
	}
	
	public void createObjects() {
		ball = new Ball(PANEL_WIDTH, PANEL_HEIGHT);
		paddle1 = new Paddle(Player.One, PANEL_WIDTH, PANEL_HEIGHT);
		paddle2 = new Paddle(Player.Two, PANEL_WIDTH, PANEL_HEIGHT);
	}
	
	private void update() {
		switch(gameState) {
		case Initialising:{
			createObjects();
			gameState = GameState.Playing;
			break;
		}
		case Playing: {
			break;
			
		}
		case GameOver: {
			break;
		}
		}
	}
	
	private void paintSprite(Graphics g, Sprite sprite) {
	     g.setColor(sprite.getColour());
	     g.fillRect(sprite.getxPosition(), sprite.getyPosition(), sprite.getWidth(), sprite.getHeight());
	}
	
	private void paintDottedLine(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
		g2d.setStroke(dashed);
		g2d.setPaint(Color.BLACK);
		g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
		g2d.dispose();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintDottedLine(g);
	     if(gameState != GameState.Initialising) {
	         paintSprite(g, ball);
	         paintSprite(g, paddle1);
	         paintSprite(g, paddle2);
	     }
		//the below creates a white rectangle to check the graphics import is working
		//g.setColor(Color.WHITE);
		//g.fillRect(20, 20, 100, 100);
		}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		update();
		repaint();
		// TODO Auto-generated method stub
		
	}

		
	}

