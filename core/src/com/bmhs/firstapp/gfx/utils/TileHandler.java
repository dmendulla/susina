package com.bmhs.firstapp.gfx.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.bmhs.firstapp.gfx.assets.Tile;
import com.bmhs.firstapp.gfx.assets.WorldTile;

public class TileHandler {
    public static TileHandler tileHandler = null;

    private int spriteOnSheetHeight, spriteOnSheetWidth;

    private String primaryColorSheetPath = "primaryColorSheet.png";

    private Array<WorldTile> worldTileArray;

    private TileHandler() {
        worldTileArray = new Array<>();

        spriteOnSheetHeight = Tile.ON_SCREEN_DEFAULT_HEIGHT;
        spriteOnSheetWidth = Tile.ON_SCREEN_DEFAULT_WIDTH;

        Texture tempTexture = new Texture(primaryColorSheetPath);

        TextureRegion temRegion = new TextureRegion(tempTexture, spriteOnSheetWidth * 2, spriteOnSheetHeight * 0, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile blackWorldTile = new WorldTile(temRegion, 0, "black");
        worldTileArray.add(blackWorldTile);

        temRegion = new TextureRegion(tempTexture, spriteOnSheetWidth * 1, spriteOnSheetHeight * 0, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile whiteWorldTile = new WorldTile(temRegion, 2, "white");
        worldTileArray.add(whiteWorldTile);

        temRegion = new TextureRegion(tempTexture, spriteOnSheetWidth * 0, spriteOnSheetHeight * 2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile redWorldTile = new WorldTile(temRegion, 2, "red");
        worldTileArray.add(redWorldTile);

        temRegion = new TextureRegion(tempTexture, spriteOnSheetWidth * 0, spriteOnSheetHeight * 5, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile greenWorldTile = new WorldTile(temRegion, 3, "green");
        worldTileArray.add(greenWorldTile);

        temRegion = new TextureRegion(tempTexture, spriteOnSheetWidth * 0, spriteOnSheetHeight * 8, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile blueWorldTile = new WorldTile(temRegion, 4, "blue");
        worldTileArray.add(blueWorldTile);
    }

    public Array<WorldTile> getWorldTileArray() {
        return worldTileArray;
    }

    public static TileHandler getTileHandler() {
        if (tileHandler == null) tileHandler = new TileHandler();
        return tileHandler;
    }
}
