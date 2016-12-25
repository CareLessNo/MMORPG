/*
 * Copyright (C) 2016 The MoonLake Authors
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
 
  
package com.minecraft.moonlake.mmorpg.api.gui.player;

import com.minecraft.moonlake.mmorpg.api.gui.MMORPGGUI;
import com.minecraft.moonlake.mmorpg.api.gui.MMORPGGUIS;
import com.minecraft.moonlake.mmorpg.api.player.MMORPGPlayer;

/**
 * Created by MoonLake on 2016/7/26.
 */
public abstract class MMORPGPlayerGUI extends MMORPGGUIS {

    private final MMORPGPlayer owner;

    public MMORPGPlayerGUI(MMORPGGUI gui, MMORPGPlayer owner) {

        super(gui);

        this.owner = owner;
    }

    public final MMORPGPlayer getOwner() {

        return owner;
    }

    /**
     * 将此 MMORPG GUI 打开给此玩家
     */
    public void openGUI() {

        openGUI(getOwner());
    }
}
