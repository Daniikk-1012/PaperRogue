package com.wgsoft.game.paperrogue.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;


public class OptionScreen implements Screen {
    private Stage stage;
    public OptionScreen() {

    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        if((float)width/height > 800f/480f){
            ((ScreenViewport)stage.getViewport()).setUnitsPerPixel(480f/height);
        }else{
            ((ScreenViewport)stage.getViewport()).setUnitsPerPixel(800f/width);
        }
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        Gdx.input.setInputProcessor(null);
    }

    @Override
    public void dispose() {

    }
}