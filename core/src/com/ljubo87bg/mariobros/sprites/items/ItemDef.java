package com.ljubo87bg.mariobros.sprites.items;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Ljubo on 6.10.2017 г..
 */

public class ItemDef {
    public Vector2 position;
    public Class<?> type;

    public ItemDef(Vector2 position, Class<?> type){
        this.position = position;
        this.type = type;
    }
}
