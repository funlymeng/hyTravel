package com.hy.hyTravel.common;

import java.util.Random;
import java.util.UUID;

public class MyUUID {

    public static String UUID32(){
        return UUID.randomUUID().toString().replace("-","");
    }

    public static String getNumber4(){
        Random random = new Random();
        return random.nextInt(9999-1000+1)+1000+"";
    }

    public static String getNumber6(){
        Random random = new Random();
        return random.nextInt(999999-100000+1)+100000+"";
    }

}
