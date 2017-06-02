package io.chinesevinaigrette.game;

import java.awt.Color;
import java.awt.Graphics;

import io.chinesevinaigrette.game.Tile.Type;

public class Player {

	private Terrain world;

	private int i;
	private int j;

	public Player(Terrain world) {
		this.world = world;
		i = 0;
		j = 0;
	}

	public void draw(Graphics g, int cx, int cy, int r) {
		g.setColor(Color.ORANGE);
		g.fillRect(cx - r, cy - r, 2 * r, 2 * r);
		g.setColor(Color.BLACK);
		g.drawRect(cx - r, cy - r, 2 * r, 2 * r);
	}

	public void move(int di, int dj) {
		int targetI = this.i + di;
		int targetJ = this.j + dj;

		if ((targetI < 0 || targetI > world.getTerrain().length - 1)
				|| (targetJ < 0 || targetJ > world.getTerrain()[0].length - 1))
			return;
		if (world.getTerrain()[targetI][targetJ].getType() == Type.WATER)
			return;

		this.i = targetI;
		this.j = targetJ;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
}
