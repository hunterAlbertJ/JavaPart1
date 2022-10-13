package com.entertainment.client;

enum VolumeLevel {
    //passes given int value to com.entertainment.client.VolumeLevel method
    OFF(0),
    SOFT(25),
    MEDIUM(50),
    LOUD(75),
    MAX(100);

    private int volume;

    //called with classloader
    VolumeLevel(int volume){
        //assigns the volume argument passed to the method to that individual enum's volume field
        this.volume = volume;
    }

    //getter and setter methods that allow us to access the volume field safely
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}