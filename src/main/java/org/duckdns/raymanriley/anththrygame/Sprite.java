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

import org.duckdns.raymanriley.anththrygame.Geometry.Vector2;
import org.duckdns.raymanriley.anththrygame.Geometry.Rectangle;
import org.duckdns.raymanriley.anththrygame.Collisions.CollisionCell;
import org.duckdns.raymanriley.anththrygame.Collisions.Collision;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Riley Castelli
 * @version 2022.09.14
 * @since 2022.09.14
 */
public class Sprite {

    private final int S_WIDTH = 50;
    private final int S_HEIGHT = 50;

    private final Image sprite;
    private final List<CollisionCell> cells = new ArrayList<>();
    private final Rectangle boundBox;
    private Vector2 pos;
    private Vector2 velocity;

    public Sprite(Vector2 pos, String imagePath) {
        this.pos = new Vector2(pos);
        velocity = new Vector2(0., 0.);
        boundBox = new Rectangle(pos.getX(), pos.getY(),
                S_WIDTH, S_HEIGHT);
        sprite = new ImageIcon(imagePath).getImage();
    }

    public void addToCell(CollisionCell cell) {
        cells.add(cell);
    }

    public void removeAllCells() {
        cells.forEach(c -> {
            c.removeFromCell(this);
        });
        cells.clear();
    }

    public Vector2 getPos() {
        return pos;
    }

    public Rectangle getBoundBox() {
        return boundBox;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = new Vector2(velocity);
    }

    public void update(double time) {
        pos.setX(pos.getX() + velocity.getX() * time);
        pos.setY(pos.getY() + velocity.getY() * time);
        boundBox.setPos(pos);
    }

    public void handleCollision(Collision collision) {
        //TODO collision logic
    }
}
