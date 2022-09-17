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
import org.duckdns.raymanriley.anththrygame.Collisions.Collision;

/**
 * Contains virtual methods to provide easy do-nothing decisions.
 *
 * @author Riley Castelli
 * @version 2022.09.17
 * @since 2022.09.14
 */
public abstract class BaseState {

  protected AvatarEntity avatar;

  public BaseState(AvatarEntity avatar) {
    this.avatar = avatar;
  }

  public void update(double time) {}

  public void handleLeft() {}

  public void handleLeftRelease() {}

  public void handleRight() {}

  public void handleRightRelease() {}

  public void handleUp() {}

  public void handleUpRelease() {}

  public void handleDown() {}

  public void handleDownRelease() {}

  public void loadSprite() {}

  public void moveLeft() {
    avatar.setState(new LeftState(avatar));
  }

  public void moveUpLeft() {}

  public void moveIdleLeft() {
    // TODO face left state
  }

  public void handleCollision(Collision collision) {
    // TODO collision stuff
  }
}
