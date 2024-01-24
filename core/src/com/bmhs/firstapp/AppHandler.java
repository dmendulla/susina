package com.bmhs.firstapp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bmhs.firstapp.gfx.assets.Tile;
import com.bmhs.firstapp.gfx.utils.TileHandler;

public class AppHandler extends ApplicationAdapter {
	SpriteBatch batch;

	int x, y;


	int[][] worldIntArray = {
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 1, 3, 3, 3, 3, 3, 3, 3, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 1, 0, 0},
			{0, 0, 0, 0, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 1, 0, 0},
			{0, 0, 1, 1, 1, 2, 3, 3, 1, 1, 1, 1, 1, 1, 1, 0, 0},
			{0, 1, 3, 3, 1, 2, 3, 1, 4, 5, 5, 5, 0, 0, 0, 1, 0},
			{0, 1, 3, 2, 1, 2, 3, 1, 4, 5, 5, 5, 5, 5, 5, 1, 0},
			{0, 1, 2, 2, 1, 2, 3, 1, 4, 4, 4, 4, 4, 4, 4, 1, 0},
			{0, 1, 2, 2, 1, 2, 3, 3, 1, 1, 1, 1, 1, 1, 1, 0, 0},
			{0, 1, 2, 2, 1, 2, 2, 3, 3, 3, 3, 3, 3, 2, 1, 0, 0},
			{0, 1, 2, 2, 1, 2, 2, 2, 3, 3, 3, 3, 2, 2, 1, 0, 0},
			{0, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0, 0},
			{0, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0, 0},
			{0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 0, 0},
			{0, 0, 0, 0, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 0, 0},
			{0, 0, 0, 0, 1, 2, 2, 2, 1, 0, 1, 2, 2, 2, 1, 0, 0},
			{0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0},
	};


	/* int[][] worldIntArray = new int[12][20]; */
	@Override
	public void create () {
		batch = new SpriteBatch();

/*
		setRandomArray();
*/

		x = 0;
		y = 0;
	}
	/*
	private void setRandomArray() {
		for(int r = 0; r < worldIntArray.length; r++) {
			for(int c = 0; c < worldIntArray[r].length; c++) {
				worldIntArray[r][c] = MathUtils.random(4);
			}
		}
	}
*/
	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();


		for(int r = 0; r < worldIntArray.length; r++){
			for(int c = 0; c < worldIntArray[r].length; c++){
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(worldIntArray[r][c]).getTexture(), c * Tile.ON_SCREEN_DEFAULT_WIDTH, Gdx.graphics.getHeight() - Tile.ON_SCREEN_DEFAULT_HEIGHT - r * Tile.ON_SCREEN_DEFAULT_HEIGHT);
			}
		}


		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
