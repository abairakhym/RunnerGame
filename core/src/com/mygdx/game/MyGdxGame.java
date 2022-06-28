package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.screens.GameScreen;

public class MyGdxGame extends Game {
	ShapeRenderer shape;
	@Override
	public void create () {
		setScreen(new GameScreen());
		shape = new ShapeRenderer();
	}
}
