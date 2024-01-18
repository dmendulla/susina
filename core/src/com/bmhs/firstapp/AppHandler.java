package com.bmhs.firstapp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bmhs.firstapp.gfx.utils.TileHandler;

public class AppHandler extends ApplicationAdapter {
	SpriteBatch batch;

	int x, y;

	@Override
	public void create () {
		batch = new SpriteBatch();

		x = 0;
		y = 0;
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();

		for(int r = 0; r < Gdx.graphics.getHeight(); r+=64){
			for(int c = 0; c < Gdx.graphics.getWidth(); c+=64){
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(x++).getTexture(), c, r);
				if (x > 4) x = 0;
			}
		}


		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
