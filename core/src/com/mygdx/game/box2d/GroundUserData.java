package com.mygdx.game.box2d;

import com.mygdx.game.enums.UserDataType;

public class GroundUserData extends UserData{
    public GroundUserData() {
        super();
        userDataType = UserDataType.GROUND;
    }
}
