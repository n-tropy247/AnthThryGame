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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Riley Castelli
 * @version 2022.09.14
 * @since 2022.09.14
 */
public class Board extends JPanel {

    private final int B_WIDTH = 350, B_HEIGHT = 350;
    private final int X_INIT = -40, Y_INIT = -40;
    private final int DELAY_INIT = 100, PERIOD = 25;
    private ArrayList<Sprite> sprites = new ArrayList<>();

    private Timer timer;

    public Board() {
        initBoard();
    }

    private void initBoard() {
        setBackground(Color.GREEN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    }

    @Override
    public void paintComponent(Graphics g) {
    }
}
