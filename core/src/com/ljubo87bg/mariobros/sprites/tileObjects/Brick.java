package com.ljubo87bg.mariobros.sprites.tileObjects;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.maps.MapObject;
import com.ljubo87bg.mariobros.MarioBros;
import com.ljubo87bg.mariobros.scenes.Hud;
import com.ljubo87bg.mariobros.screens.PlayScreen;
import com.ljubo87bg.mariobros.sprites.Mario;

/**
 * Created by Ljubo on 15.9.2017 г..
 */

public class Brick extends InteractiveTileObject {

    public Brick(PlayScreen screen, MapObject object) {
        super(screen, object);
        fixture.setUserData(this);
        setCategoryFilter(MarioBros.BRICK_BIT);
    }

    @Override
    public void onHeadHit(Mario mario) {
        if (mario.isBig()) {
            setCategoryFilter(MarioBros.DESTROYED_BIT);
            getCell().setTile(null);
            Hud.addScore(200);
            MarioBros.manager.get("audio/sounds/breakblock.wav", Sound.class).play();
        } else {
            MarioBros.manager.get("audio/sounds/bump.wav", Sound.class).play();
        }
    }
}
