package com.logic.drop;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Principal extends Game {
    @Override
    public void create() {
        setScreen(new FirstScreen());
    }
}