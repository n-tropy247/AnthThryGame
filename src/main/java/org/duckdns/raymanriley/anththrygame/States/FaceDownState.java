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
package org.duckdns.raymanriley.anththrygame.States;

import org.duckdns.raymanriley.anththrygame.AvatarEntity;
import org.duckdns.raymanriley.anththrygame.Geometry.Vector2;

/**
 *
 * @author Riley Castelli
 * @version 2022.09.14
 * @since 2022.09.14
 */
public class FaceDownState extends BaseState {

    public FaceDownState(AvatarEntity avatar) {
        super(avatar);
        avatar.setVelocity(new Vector2(0, 0));
        avatar.setMoving(false);
    }

    @Override
    public void handleLeft() {
        super.moveLeft();
    }

    @Override
    public void handleRight() {
        //TODO move right
    }

    @Override
    public void handleUp() {
        //TODO move up
    }

    @Override
    public void handleDown() {
        //TODO move down
    }

    @Override
    public void update(double time) {
        avatar.setVelocity(new Vector2(0, 0));
    }
    
    @Override
    public void loadSprite() {
        avatar.loadSprite(AvatarEntity.Face.Down);
    }
}
