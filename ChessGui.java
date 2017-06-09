package ch02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * all x and y coordinates point to the upper left position of a component all
 * lists are treated as 0 being the bottom and size-1 being the top piece
 * 
 */
public class ChessGui extends JPanel {

	private static final long serialVersionUID = -2778738670336170588L;
	
	private static final int BOARD_START_X = 301;
	private static final int BOARD_START_Y = 51;

	private static final int TILE_OFFSET_X = 50;
	private static final int TILE_OFFSET_Y = 50;

	private Image imgBackground;

	// The game state variable is used for keeping track whom's turn it is
	private int gameState = GAME_STATE_WHITE;
	static final int GAME_STATE_WHITE = 0;
	static final int GAME_STATE_BLACK = 1;

	// 0 = bottom, size = top
	private List<Piece> pieces = new ArrayList<Piece>();
	private JLabel lblGameState;

	public ChessGui() {
		this.setLayout(null);

		// background
		URL urlBackgroundImg = getClass().getResource("/ch02/img/bo.png");
		this.imgBackground = new ImageIcon(urlBackgroundImg).getImage();

		// create and place pieces
		// rook, knight, bishop, queen, king, bishop, knight, and rook
		createAndAddPiece(Piece.COLOR_WHITE, Piece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 0,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Piece.COLOR_WHITE, Piece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 1,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Piece.COLOR_WHITE, Piece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 2,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Piece.COLOR_WHITE, Piece.TYPE_KING, BOARD_START_X + TILE_OFFSET_X * 3,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Piece.COLOR_WHITE, Piece.TYPE_QUEEN, BOARD_START_X + TILE_OFFSET_X * 4,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Piece.COLOR_WHITE, Piece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 5,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Piece.COLOR_WHITE, Piece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 6,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Piece.COLOR_WHITE, Piece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 7,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		// pawns
		for (int i = 0; i < 8; i++) {
			createAndAddPiece(Piece.COLOR_WHITE, Piece.TYPE_PAWN, BOARD_START_X + TILE_OFFSET_X * i,
					BOARD_START_Y + TILE_OFFSET_Y * 6);
		}

		createAndAddPiece(Piece.COLOR_BLACK, Piece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 0,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Piece.COLOR_BLACK, Piece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 1,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Piece.COLOR_BLACK, Piece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 2,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Piece.COLOR_BLACK, Piece.TYPE_QUEEN, BOARD_START_X + TILE_OFFSET_X * 3,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Piece.COLOR_BLACK, Piece.TYPE_KING, BOARD_START_X + TILE_OFFSET_X * 4,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Piece.COLOR_BLACK, Piece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 5,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Piece.COLOR_BLACK, Piece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 6,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Piece.COLOR_BLACK, Piece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 7,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		for (int i = 0; i < 8; i++) {
			createAndAddPiece(Piece.COLOR_BLACK, Piece.TYPE_PAWN, BOARD_START_X + TILE_OFFSET_X * i,
					BOARD_START_Y + TILE_OFFSET_Y * 1);
		}

		// add listeners to enable drag and drop
		//
		PiecesDragAndDropListener listener = new PiecesDragAndDropListener(this.pieces,
				this);
		this.addMouseListener(listener);
		this.addMouseMotionListener(listener);

		// button to change game state
		JButton btnChangeGameState = new JButton("change");
		btnChangeGameState
				.addActionListener(new ChangeGameStateButtonActionListener(this));
		btnChangeGameState.setBounds(0, 0, 80, 30);
		this.add(btnChangeGameState);

		// label to display game state
		String labelText = this.getGameStateAsText();
		this.lblGameState = new JLabel(labelText);
		lblGameState.setBounds(0, 30, 80, 30);
		lblGameState.setForeground(Color.WHITE);
		this.add(lblGameState);

		// create application frame and set visible
		//
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(this);
		f.setSize(imgBackground.getWidth(null), imgBackground.getHeight(null));
	}

	/**
	 * @return textual description of current game state
	 */
	private String getGameStateAsText() {
		return (this.gameState == GAME_STATE_BLACK ? "black" : "white");
	}

	/**
	 * create a game piece
	 * 
	 * @param color color constant
	 * @param type type constant
	 * @param x x position of upper left corner
	 * @param y y position of upper left corner
	 */
	private void createAndAddPiece(int color, int type, int x, int y) {
		Image img = this.getImageForPiece(color, type);
		Piece piece = new Piece(img, x, y, color, type);
		this.pieces.add(piece);
	}

	/**
	 * load image for given color and type. This method translates the color and
	 * type information into a filename and loads that particular file.
	 * 
	 * @param color color constant
	 * @param type type constant
	 * @return image
	 */
	private Image getImageForPiece(int color, int type) {

		String filename = "";

		filename += (color == Piece.COLOR_WHITE ? "w" : "b");
		switch (type) {
			case Piece.TYPE_BISHOP:
				filename += "b";
				break;
			case Piece.TYPE_KING:
				filename += "k";
				break;
			case Piece.TYPE_KNIGHT:
				filename += "n";
				break;
			case Piece.TYPE_PAWN:
				filename += "p";
				break;
			case Piece.TYPE_QUEEN:
				filename += "q";
				break;
			case Piece.TYPE_ROOK:
				filename += "r";
				break;
		}
		filename += ".png";

		URL urlPieceImg = getClass().getResource("/ch02/img/" + filename);
		return new ImageIcon(urlPieceImg).getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(this.imgBackground, 0, 0, null);

		for (Piece piece : this.pieces) {
			g.drawImage(piece.getImage(), piece.getX(), piece.getY(), null);
		}
	}

	public static void main(String[] args) {
		new ChessGui();
	}

	/**
	 * switches between the different game states 
	 */
	public void changeGameState() {
		switch (this.gameState) {
			case GAME_STATE_BLACK:
				this.gameState = GAME_STATE_WHITE;
				break;
			case GAME_STATE_WHITE:
				this.gameState = GAME_STATE_BLACK;
				break;
			default:
				throw new IllegalStateException("unknown game state:" + this.gameState);
		}
		this.lblGameState.setText(this.getGameStateAsText());
	}

	/**
	 * @return current game state
	 */
	public int getGameState() {
		return this.gameState;
	}

}
