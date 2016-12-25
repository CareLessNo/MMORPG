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
 
  
package com.minecraft.moonlake.mmorpg.config;

import com.minecraft.moonlake.data.Conversions;
import com.minecraft.moonlake.mmorpg.api.MMORPG;
import com.minecraft.moonlake.mmorpg.api.config.MMORPGConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MoonLake on 2016/5/22.
 */
public class MMORPGConfigUtil implements MMORPGConfig {

    private final MMORPG main;

    public MMORPGConfigUtil(MMORPG main) {

        this.main = main;
    }

    /**
     * 获取配置文件基础数据
     *
     * @param key 键
     * @return 基础数据
     */
    @Override
    public BaseConfig get(String key) {

        return new BaseConfigUtil(main.getMain().getConfig().get(key));
    }


    public static class BaseConfigUtil implements BaseConfig {

        private Object obj;

        public BaseConfigUtil(Object obj) {

            this.obj = obj;
        }

        /**
         * 将数据转换到字符串
         *
         * @return 字符串
         */
        @Override
        public String asString() {

            return obj != null ? obj.toString() : "";
        }

        /**
         * 将数据转换到整数
         *
         * @return 整数
         */
        @Override
        public int asInt() {

            return obj != null ? Conversions.toInt(obj) : 0;
        }

        /**
         * 将数据转换到双精度浮点数
         *
         * @return 双精度浮点数
         */
        @Override
        public double asDouble() {

            return obj != null ? Conversions.toDouble(obj) : 0d;
        }

        /**
         * 将数据转换到单精度浮点数
         *
         * @return 单精度浮点数
         */
        @Override
        public float asFloat() {

            return obj != null ? Conversions.toFloat(obj) : 0f;
        }

        /**
         * 将数据转换到长整数
         *
         * @return 长整数
         */
        @Override
        public long asLong() {

            return obj != null ? Conversions.toLong(obj) : 0L;
        }

        /**
         * 将数据转换到短整数
         *
         * @return 短整数
         */
        @Override
        public short asShort() {

            return obj != null ? Conversions.toShort(obj) : 0;
        }

        /**
         * 将数据转换到字符串集合
         *
         * @return 字符串集合
         */
        @Override
        public List<String> asStringList() {

            return obj != null && obj instanceof List ? (List)obj : new ArrayList<>();
        }

        /**
         * 将数据转换到字符
         *
         * @return 字符
         */
        @Override
        public char asChar() {

            return obj != null && obj instanceof Character ? (char)obj : '\0';
        }

        /**
         * 将数据转换到布尔值
         *
         * @return 布尔值
         */
        @Override
        public boolean asBoolean() {

            return obj != null && obj instanceof Boolean ? (Boolean)obj : Boolean.FALSE;
        }

        /**
         * 将数据转换到字节
         *
         * @return 字节
         */
        @Override
        public byte asByte() {

            return obj != null ? Conversions.toByte(obj) : 0;
        }
    }
}
