/*
 * Copyright (C) 2022 Riley Castelli
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.duckdns.raymanriley.anththrygame;

import org.duckdns.raymanriley.anththrygame.Collisions.Collision;
import org.duckdns.raymanriley.anththrygame.Geometry.Vector2;
import org.duckdns.raymanriley.anththrygame.States.*;

/**
 *
 * @author Riley Castelli
 * @version 2022.09.14
 * @since 2022.09.14
 */
public class AvatarEntity {
    
    public enum Face {
        Left, Right, Up, Down, LeftUp, LeftDown, RightUp, RightDown
    }

    private BaseState state;

    private Sprite sprite;
    
    private boolean isMoving;

    public AvatarEntity(Vector2 pos, Sprite sprite) {
        state = new FaceDownState(this);
        isMoving = false;
        this.sprite = sprite;
    }

    public void update(double time) {
        sprite.update(time);
    }

    public void handleLeft() {
        state.handleLeft();
    }

    public void handleLeftRelease() {
        state.handleLeftRelease();
    }

    public void handleRight() {
        state.handleRight();
    }

    public void handleRightRelease() {
        state.handleRightRelease();
    }

    public void handleUp() {
        state.handleUp();
    }

    public void handleUpRelease() {
        state.handleUpRelease();
    }

    public void handleDown() {
        state.handleDown();
    }

    public void handleDownRelease() {
        state.handleDownRelease();
    }

    public void setState(BaseState state) {
        this.state = state;
    }

    public void setVelocity(Vector2 velocity) {
        sprite.setVelocity(velocity);
    }
    
    public void setMoving(boolean moving) {
        isMoving = moving;
    }
    
    public void loadSprite(Face dir) {
        switch(dir) {
            //TODO create sprite factory
        }
    }

    public void handleCollision(Collision collision) {
        sprite.handleCollision(collision);
        state.handleCollision(collision);
    }
}
