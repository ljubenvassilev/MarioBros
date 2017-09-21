package com.ljubo87bg.mariobros.sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;
import com.ljubo87bg.mariobros.MarioBros;

/**
 * Created by Ljubo on 15.9.2017 г..
 */

public class Brick extends InteractiveTileObject {
    public Brick(World world, TiledMap map, Rectangle bounds) {
        super(world, map, bounds);
        fixture.setUserData(this);
        setCategoryFilter(MarioBros.BRICK_BIT);
    }

    @Override
    public void onHeadHit() {
        setCategoryFilter(MarioBros.DESTROYED_BIT);
        getCell().setTile(null);
    }
}
