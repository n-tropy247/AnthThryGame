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
package org.duckdns.raymanriley.anththrygame.Geometry;

/**
 *
 * @author Riley Castelli
 * @version 2022.09.14
 * @since 2022.09.14
 */
public class Rectangle {

    private final Vector2 bounds;
    private final Vector2 pos;

    public Rectangle(double x, double y, double width, double height) {
        pos = new Vector2(x, y);
        bounds = new Vector2(width, height);
    }

    public Rectangle(Vector2 pos, double width, double height) {
        this.pos = new Vector2(pos);
        bounds = new Vector2(width, height);
    }

    public Vector2 getPos() {
        return pos;
    }

    public Vector2 getBounds() {
        return bounds;
    }

    public void setPos(Vector2 pos) {
        this.pos.setX(pos.getX());
        this.pos.setY(pos.getY());
    }

    public boolean intersects(Rectangle r) {
        Vector2 aPos = this.getPos();
        Vector2 aBounds = this.getBounds();
        Vector2 bPos = r.getPos();
        Vector2 bBounds = this.getBounds();

        //calculate zone of intersection
        double x1 = Math.max(aPos.getX(), bPos.getX());
        double x2 = Math.min(aPos.getX() + aBounds.getX(), bPos.getX()
                + bBounds.getX());
        double y1 = Math.max(aPos.getY(), bPos.getY());
        double y2 = Math.min(aPos.getY() + aBounds.getY(), bPos.getY()
                + bBounds.getY());

        return x2 >= x1 && y2 >= y1;
    }
}
