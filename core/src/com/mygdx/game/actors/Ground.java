package com.mygdx.game.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.game.box2d.UserData;

public class Ground extends GameActor{
    public Ground(Body body) {
        super(body);
    }

    @Override
    public UserData getUserData() {
        return null;
    }
}
