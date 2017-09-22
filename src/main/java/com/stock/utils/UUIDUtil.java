package com.stock.utils;

import java.util.UUID;

/**
 * Created by 筱湮 on 2017/5/3.
 */
public class UUIDUtil {

    public static String getUUID(){

        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();

        return id;
    }
}
