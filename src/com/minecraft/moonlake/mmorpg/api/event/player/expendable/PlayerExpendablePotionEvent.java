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
 
  
package com.minecraft.moonlake.mmorpg.api.event.player.expendable;

import com.minecraft.moonlake.mmorpg.api.player.MMORPGPlayer;
import com.minecraft.moonlake.mmorpg.api.item.expendable.potion.Potion;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Created by MoonLake on 2016/6/15.
 */
public class PlayerExpendablePotionEvent extends PlayerExpendableEvent implements Cancellable {

    private final static HandlerList handlers = new HandlerList();
    private boolean cancel = false;

    public PlayerExpendablePotionEvent(MMORPGPlayer mmorpgPlayer, Potion potion) {

        super(mmorpgPlayer, potion);
    }

    /**
     * 获取玩家的消耗品药水对象
     *
     * @return 消耗品药水
     */
    public Potion getExpendable() {

        return (Potion) super.getExpendable();
    }

    @Override
    public boolean isCancelled() {

        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {

        this.cancel = cancel;
    }

    @Override
    public HandlerList getHandlers() {

        return handlers;
    }

    public static HandlerList getHandlerList() {

        return handlers;
    }
}
