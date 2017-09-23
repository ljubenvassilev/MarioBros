package com.ljubo87bg.mariobros.sprites;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;
import com.ljubo87bg.mariobros.MarioBros;
import com.ljubo87bg.mariobros.scenes.Hud;
import com.ljubo87bg.mariobros.screens.PlayScreen;

/**
 * Created by Ljubo on 15.9.2017 г..
 */

public class Brick extends InteractiveTileObject {

    public Brick(PlayScreen screen, Rectangle bounds) {
        super(screen, bounds);
        fixture.setUserData(this);
        setCategoryFilter(MarioBros.BRICK_BIT);
    }

    @Override
    public void onHeadHit() {
        setCategoryFilter(MarioBros.DESTROYED_BIT);
        getCell().setTile(null);
        Hud.addScore(200);
        MarioBros.manager.get("audio/sounds/breakblock.wav", Sound.class).play();
    }
}
