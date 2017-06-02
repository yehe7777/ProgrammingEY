package io.chinesevinaigrette.game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Tile {
	private static final boolean DRAW_GRIDLINES = false;

	public enum Type {
		GRASS, WATER
	}

	private Type type;
	private Color color;

	public Tile() {
		if (Math.random() < 0.2)
			type = Type.WATER;
		else
			type = Type.GRASS;

		fixColor();
	}

	public void draw(Graphics g, int x, int y, int w, int h) {
		g.setColor(color);
		g.fillRect(x, y, w, h);

		if (DRAW_GRIDLINES) {
			g.setColor(Color.BLACK);
			g.drawRect(x, y, w, h);
		}
	}

	private void fixColor() {
		switch (type) {
		case WATER:
			color = Color.CYAN;
			break;
		case GRASS:
			color = new Color(0.0f, 0.40f + 0.40f * (new Random()).nextFloat(), 0.0f, 0.75f);
			break;
		default:
			color = Color.YELLOW;
		}
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
		fixColor();
	}

}
