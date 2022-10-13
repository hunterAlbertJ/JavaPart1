package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Client side main class class with the main method
 * it will test drive a few instances of com.entertainment.Television
 */
class TelevisionClient {
    public static void main(String[] args) {
        System.out.println("Instance count: " + Television.getInstanceCount());

        Television myTelevision = new Television();
        myTelevision.setBrand("Visio");
        myTelevision.setVolume(15);
        myTelevision.turnOn();
        myTelevision.turnOff();

        Television mySecondTelevision = new Television("Sony");
        myTelevision.setVolume(Television.MIN_VOLUME);

        Television twoArgTele = new Television("LG", Television.MAX_VOLUME);

        Television defaultTelevision = new Television("Sony", 1000);
        defaultTelevision.turnOn();
        defaultTelevision.turnOff();

        System.out.println(myTelevision.toString());
        System.out.println(mySecondTelevision.toString());
        System.out.println(defaultTelevision.toString());
        System.out.println(twoArgTele.toString());
        System.out.println();

        Television threeArgTele = new Television("Samsung", VolumeLevel.LOUD.getVolume(), DisplayType.CRT);
        System.out.println(threeArgTele.toString());
        System.out.println("Instance count: " + Television.getInstanceCount());

    }


}
