package com.time.client;

import com.time.Watch;
import com.time.WatchMaterial;

class WatchClientArgs {
    public static void main(String[] args) {

        // com.time.Watch myRolex = new com.time.Watch(9, com.time.WatchMaterial.GOLD, "Self-Winding", false);
        //example so I dont have to keep switching tabs
        //probably better to use switch case, but I think they're ugly so here's this monstrosity
        if(args.length == 4){
            int convertedFaceSize = Integer.parseInt(args[0]);
            //added the toUpperCase because all caps at program run is not very intuitive
            WatchMaterial convertedMaterial = WatchMaterial.valueOf(args[1].toUpperCase());
            //movement is already a string
            String movement = args[2];
            //parse into primitive data type
            boolean smartwatch = Boolean.parseBoolean(args[3]);
            //instantiate
            Watch clientArgsWatch = new Watch(convertedFaceSize, convertedMaterial, movement, smartwatch);
            //this is like toString but prettier
            clientArgsWatch.describe();

        } else if(args.length == 3){
            //same as above but with one less arguments
            int convertedFaceSize = Integer.parseInt((args[0]));
            WatchMaterial convertedMaterial = WatchMaterial.valueOf(args[1].toUpperCase());
            String movement = args[2];


        } else if(args.length == 2){
            int convertedFaceSize = Integer.parseInt((args[0]));
            WatchMaterial convertedMaterial = WatchMaterial.valueOf(args[1].toUpperCase());
        } else if(args.length == 1){
            int convertedFaceSize = Integer.parseInt((args[0]));
            WatchMaterial convertedMaterial = WatchMaterial.valueOf(args[1].toUpperCase());
        } else {
            System.out.println("Usage: java <face size (in mm)> <material> <movement> <isSmartwatch> ");
            return;
        }
    }
}