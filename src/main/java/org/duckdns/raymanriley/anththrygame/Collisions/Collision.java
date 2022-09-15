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

/**
 *
 * @author Riley Castelli
 * @version 2022.09.14
 * @since 2022.09.14
 */
public class Collision {

    public enum Direction {
        Left, Right, Up, Down
    }

    private final Direction dir;

    public Collision(Direction dir) {
        this.dir = dir;
    }

    public Direction getDir() {
        return dir;
    }

    public Direction getInverseDir() {
        switch (dir) {
            case Left:
                return Direction.Right;
            case Right:
                return Direction.Left;
            case Up:
                return Direction.Down;
            default:
                return Direction.Up;
        }
    }

}
