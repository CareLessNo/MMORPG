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
 
  
package com.minecraft.moonlake.mmorpg.api.event.pet;

import com.minecraft.moonlake.mmorpg.api.pet.Pet;
import org.bukkit.event.HandlerList;

/**
 * Created by MoonLake on 2016/5/22.
 */
public class PetRemoveEvent extends MMORPGPetEvent {

    private final static HandlerList handlers = new HandlerList();

    public PetRemoveEvent(Pet pet) {

        super(pet);
    }

    @Override
    public HandlerList getHandlers() {

        return handlers;
    }

    public static HandlerList getHandlerList() {

        return handlers;
    }
}
