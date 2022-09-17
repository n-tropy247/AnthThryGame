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
package org.duckdns.raymanriley.anththrygame.Collisions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.duckdns.raymanriley.anththrygame.Geometry.Rectangle;
import org.duckdns.raymanriley.anththrygame.Sprite;
import org.duckdns.raymanriley.anththrygame.Geometry.Vector2;

/**
 * Unit to break up game space into cells for broad-phase collision detection.
 *
 * @author Riley Castelli
 * @version 2022.09.17
 * @since 2022.09.14
 */
public class CollisionCell {

  private final Rectangle cell;

  private final List<Sprite> sprites = new ArrayList<>();

  public CollisionCell(Vector2 pos, double width, double height) {
    cell = new Rectangle(pos, width, height);
  }

  public List<Sprite> getSprites() {
    return Collections.unmodifiableList(sprites);
  }

  public Vector2 getPos() {
    return cell.getPos();
  }

  public Vector2 getBounds() {
    return cell.getBounds();
  }

  public void addSprite(Sprite sprite) {
    sprites.add(sprite);
    sprite.addToCell(this);
  }

  public void removeFromCell(Sprite sprite) {
    if (sprites.contains(sprite)) {
      sprites.remove(sprite);
    }
  }
}
