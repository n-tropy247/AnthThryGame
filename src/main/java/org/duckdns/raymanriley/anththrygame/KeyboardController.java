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

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Tracks keyboard state changes and commands entity.
 *
 * @author Riley Castelli
 * @version 2022.09.17
 * @since 2022.09.14
 */
public class KeyboardController extends KeyAdapter {

  private final AvatarEntity avatar;

  public KeyboardController(AvatarEntity avatar) {
    this.avatar = avatar;
  }

  @Override
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_A -> avatar.handleLeft();
      case KeyEvent.VK_D -> avatar.handleRight();
      case KeyEvent.VK_S -> avatar.handleDown();
      case KeyEvent.VK_W -> avatar.handleUp();
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_A -> avatar.handleLeftRelease();
      case KeyEvent.VK_D -> avatar.handleRightRelease();
      case KeyEvent.VK_S -> avatar.handleDownRelease();
      case KeyEvent.VK_W -> avatar.handleUpRelease();
    }
  }
}
