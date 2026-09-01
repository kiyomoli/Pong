package pongGame;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	public Main() {
		
		final String WINDOW_TITLE = "Pong Game";
		final int WINDOW_WIDTH = 800;
		final int WINDOW_HEIGHT = 600;

    	setTitle(WINDOW_TITLE);
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	setResizable(false);
    	add(new PongPanel());
    	setVisible(true); //false used if an application opens a window that the end user shouldn't see
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
}

	public static void main(String[] args) {

		//need to do the below so the code runs predictably and safely
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	 
            public void run() {
   
                   new Main();
   
            }
   
          });
        
	}

}
