package pongGame;

import java.awt.Color;

public class Paddle extends Sprite {
	
	final static Color PADDLE_COLOUR = Color.BLACK;
	final static int PADDLE_WIDTH = 10;
	final static int PADDLE_HEIGHT = 100;
	final static int DISTANCE_FROM_EDGE = 40;

	public Paddle(Player player, int panelWidth, int panelHeight) {
		this.setColour(PADDLE_COLOUR);
		this.setWidth(PADDLE_WIDTH);
		this.setHeight(PADDLE_HEIGHT);
		if (player == Player.One) {
			setInitialPosition(DISTANCE_FROM_EDGE, panelHeight/2 - (getHeight() / 2));
		}
		if (player == Player.Two) {
			setInitialPosition(panelWidth - DISTANCE_FROM_EDGE, panelHeight/2 - (getHeight() / 2));
		}
		resetToInitialPosition();
	}

}
