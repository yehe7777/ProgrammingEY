package ch02;

import java.awt.Image;

public class Piece {
	
	public static final int COLOR_WHITE = 0;
	public static final int COLOR_BLACK = 1;
	
	public static final int TYPE_ROOK = 1;
	public static final int TYPE_KNIGHT = 2;
	public static final int TYPE_BISHOP = 3;
	public static final int TYPE_QUEEN = 4;
	public static final int TYPE_KING = 5;
	public static final int TYPE_PAWN = 6;
	
	private Image img;
	private int x;
	private int y;
	private int color;
	private int type;

	public Piece(Image img, int x, int y, int color, int type) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.color = color;
		this.type = type;
	}

	public Image getImage() {
		return img;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return img.getHeight(null);
	}

	public int getHeight() {
		return img.getHeight(null);
	}

	public int getColor() {
		return this.color;
	}
	
	@Override
	public String toString() {
		String strColor = (this.color==COLOR_WHITE?"white":"black");
		String strType = "unknown";
		switch (this.type) {
			case TYPE_BISHOP: strType = "B";break;
			case TYPE_KING: strType = "K";break;
			case TYPE_KNIGHT: strType = "N";break;
			case TYPE_PAWN: strType = "P";break;
			case TYPE_QUEEN: strType = "Q";break;
			case TYPE_ROOK: strType = "R";break;
		}
		return strColor+" "+strType+" "+x+"/"+y;
	}

}
