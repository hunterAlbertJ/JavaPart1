class VolumeLevelClientValidation {
    public static void main(String[] args) {
        //Ensure all requirements are met in the VolumePresets doc
        //instantiate method with all args and pass VolumeLevel.Loud to the method
        //use getVolume getter to retrieve field value
        Television presetVolumeTv = new Television("Samsung", VolumeLevel.LOUD.getVolume(), DisplayType.LED);
        if(presetVolumeTv.getVolume() == 75){
            System.out.println("Passed: Passing enum field value to method");
        } else {
            System.out.println("Failed: Passing enum field value to method");
        }
        //new functionality of setting the volume of the tv after instantiation
        presetVolumeTv.setVolume(VolumeLevel.MEDIUM.getVolume());

        if(presetVolumeTv.getVolume() == 50){
            System.out.println("Passed: Changing volume level after instantiation");
        } else{
            System.out.println("Failed: Changing volume level after instantiation");
        }

    }
}