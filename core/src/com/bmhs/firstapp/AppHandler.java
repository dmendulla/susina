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
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 1, 2, 2, 1, 2, 2, 2, 1, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 0, 0, 0, 0},
			{0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0, 0, 0},
			{0, 0, 0, 1, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 0, 0, 0},
			{0, 0, 1, 0, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 0, 1, 0, 0},
			{0, 1, 3, 3, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 3, 3, 1, 0},
			{0, 1, 3, 3, 3, 0, 0, 0, 2, 2, 2, 2, 0, 0, 3, 3, 3, 3, 1, 0},
			{0, 1, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 1, 0},
			{0, 0, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};

	@Override
	public void create () {
		batch = new SpriteBatch();

		x = 0;
		y = 0;
	}

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
