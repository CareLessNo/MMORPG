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
 
  
package com.minecraft.moonlake.mmorpg.api.system;

import com.minecraft.moonlake.mmorpg.api.player.bossbar.MagicBar;

/**
 * Created by MoonLake on 2016/5/26.
 */
public interface MagicSystem extends MagicBar {

    /**
     * 获取此玩家的魔法条对象
     *
     * @return 魔法条对象
     */
    MagicBar getMagicBar();

    /**
     * 更新此玩家的魔法条的值
     */
    void update();
}
