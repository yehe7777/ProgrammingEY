package io.chinesevinaigrette.game;

public class Terrain {
	private Tile[][] terrain;

	public Terrain() {
		terrain = new Tile[100][100];

		for (int i = 0; i < terrain.length; i++)
			for (int j = 0; j < terrain[0].length; j++)
				terrain[i][j] = new Tile();
	}

	public Tile[][] getTerrain() {
		return terrain;
	}

	public void setTerrain(Tile[][] newTerrain) {
		this.terrain = newTerrain;
	}

}
