package io.chinesevinaigrette.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class Display extends JPanel {
	private static final long serialVersionUID = 6122624631349738056L;

	public static final int WIDTH = 1000;
	public static final int HEIGHT = 600;

	private static final int FPS = 60;
	private static final int TILE_NUM = 8;

	private Terrain terrain;
	private Player player;

	private Timer timer;
	private boolean isAnimating;
	private double animPlayerI;
	private double animPlayerJ;

	public Display(Terrain t, Player p) {
		this.setBackground(Color.CYAN);

		terrain = t;
		player = p;

		timer = new Timer();
		isAnimating = false;
	}

	private void draw(Graphics g, double playerI, double playerJ) {
		// Draw tiles
		Tile[][] tileArray = terrain.getTerrain();
		for (int i = 0; i < tileArray.length; i++)
			for (int j = 0; j < tileArray[0].length; j++) {
				double tileWidth = Math.min(WIDTH, HEIGHT) / TILE_NUM;

				double playerTileX = (WIDTH - tileWidth) / 2;
				double playerTileY = (HEIGHT - tileWidth) / 2;

				double x = playerTileX - (playerI - i) * tileWidth;
				double y = playerTileY - (playerJ - j) * tileWidth;

				tileArray[i][j].draw(g, (int) x, (int) y, (int) tileWidth + 1, (int) tileWidth + 1);
			}

		// Draw player
		player.draw(g, WIDTH / 2, HEIGHT / 2, 20);

		// Draw coordinate text
		g.setColor(Color.WHITE);
		g.fillRect(0, (HEIGHT - 1) - 30, 100, HEIGHT - 1);
		g.setColor(Color.BLACK);
		g.drawString(String.format("Pos: (%s, %s)", player.getI(), player.getJ()), 10, HEIGHT - 10);
	}

	public void animatePlayerMove(double i1, double j1, double i2, double j2) {
		animPlayerI = player.getI();
		animPlayerJ = player.getJ();
		isAnimating = true;

		long timeDurationMillis = 100;
		int frameDuration = (int) (FPS * (timeDurationMillis / 1000D));

		for (int frame = 1; frame <= frameDuration; frame++) {
			final double progress = ((double) frame / frameDuration);

			TimerTask drawFrameTask = new TimerTask() {
				public void run() {
					animPlayerI = i1 + progress * (i2 - i1);
					animPlayerJ = j1 + progress * (j2 - j1);
					repaint();
				}
			};

			timer.schedule(drawFrameTask, (long) (progress * timeDurationMillis));
		}

		timer.schedule(new TimerTask() {
			public void run() {
				isAnimating = false;
			}
		}, timeDurationMillis + 50);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (isAnimating)
			this.draw(g, animPlayerI, animPlayerJ);
		else
			this.draw(g, player.getI(), player.getJ());
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(WIDTH, HEIGHT);
	}

	public boolean isAnimating() {
		return isAnimating;
	}
}
