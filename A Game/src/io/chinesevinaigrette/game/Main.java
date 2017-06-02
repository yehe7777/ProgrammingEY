package io.chinesevinaigrette.game;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import io.chinesevinaigrette.game.Tile.Type;

public class Main {

	private JFrame window;
	private Display display;

	private Terrain terrain;
	private Player player;

	public void run() {
		// TODO
	}

	public Main() {
		terrain = new Terrain();
		terrain.getTerrain()[0][0].setType(Type.GRASS);
		player = new Player(terrain);

		window = new JFrame("The Chinese Vinaigrette");
		display = new Display(terrain, player);
		window.add(display);
		window.pack();

		GraphicsEnvironment localGE = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Rectangle effectiveScreen = localGE.getMaximumWindowBounds();
		window.setLocation((effectiveScreen.width - window.getWidth()) / 2,
				(effectiveScreen.height - window.getHeight()) / 2);

		window.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent evt) {
				if (display.isAnimating())
					return;

				double i1 = player.getI();
				double j1 = player.getJ();

				switch (evt.getKeyCode()) {
				case KeyEvent.VK_UP:
					player.move(0, -1);
					break;
				case KeyEvent.VK_DOWN:
					player.move(0, 1);
					break;
				case KeyEvent.VK_LEFT:
					player.move(-1, 0);
					break;
				case KeyEvent.VK_RIGHT:
					player.move(1, 0);
					break;
				}

				if (player.getI() != i1 || player.getJ() != j1)
					display.animatePlayerMove(i1, j1, player.getI(), player.getJ());
			}

			public void keyReleased(KeyEvent evt) {
			}

			public void keyTyped(KeyEvent evt) {
			}
		});

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		(new Main()).run();
	}

}
