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
 
  
package com.minecraft.moonlake.mmorpg.api.mob.type;

import com.minecraft.moonlake.mmorpg.api.mob.MobManager;
import com.minecraft.moonlake.mmorpg.api.mob.MobType;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Zombie;

/**
 * Created by MoonLake on 2016/7/1.
 */
public class MobZombiePigBaby extends MobZombiePig {

    private MobChicken knight;

    public MobZombiePigBaby(org.bukkit.entity.Entity entity) {

        super(MobType.ZOMBIE_PIG_BABY, entity);

        ((Zombie)asLiving()).setBaby(true);
    }

    /**
     * 获取此怪物僵尸是否为猪人僵尸
     *
     * @return true 则是猪人僵尸 else 不是
     */
    public boolean isPig() {

        return true;
    }

    /**
     * 获取此怪物小僵尸是否为鸡骑士
     *
     * @return true 则是鸡骑士 else 不是
     */
    public boolean isKnight() {

        return getVehicle() != null && getVehicle() instanceof Chicken;
    }

    /**
     * 设置此怪物小僵尸骑士的鸡骑士
     *
     * @param flag 是否有鸡骑士
     */
    public void setKnight(boolean flag) {

        if(flag && !isKnight()) {

            knight = MobManager.spawn(MobChicken.class, getLocation());

            if(knight != null && !knight.isDead()) {

                setVehicle(knight);
            }
        }
        if(!flag && isKnight()) {

            getKnight().remove();
        }
    }

    /**
     * 获取此怪物小僵尸的鸡骑士
     *
     * @return 鸡骑士 没有则返回 null
     */
    public MobChicken getKnight() {

        return knight;
    }

    /**
     * 将此怪物进行清除
     *
     * @return 是否死亡
     */
    @Override
    public boolean remove() {

        if(isKnight()) {

            getKnight().remove();
        }
        return super.remove();
    }
}
