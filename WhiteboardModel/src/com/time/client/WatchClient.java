package com.time.client;

import com.time.Watch;
import com.time.WatchMaterial;

class WatchClient {
    public static void main(String[] args) {
//        com.time.Watch mySmartWatch = new com.time.Watch(42, "aluminum", "digital", true, 0.0);
//
//        mySmartWatch.describe();
//
//        System.out.println();
//        System.out.println(mySmartWatch.toString());

        Watch myRolex = new Watch(9, WatchMaterial.GOLD, "Self-Winding", false);
        myRolex.toString();
        myRolex.describe();

        System.out.println();
        System.out.println(myRolex.toString());

        myRolex.tellTime();

//        com.time.Watch myRolex = new com.time.Watch();
//        myRolex.smartwatch = false;
//        myRolex.faceSize = 49;
//        myRolex.accuracy = 3.0;
//        myRolex.material = "silver";
//        myRolex.movement = "self winding";
//        myRolex.describe();
    }
}