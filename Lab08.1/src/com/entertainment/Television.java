package com.entertainment;

/*
 * Business or system class that models the workings of a television set
 * this class will not have a main method
 */
public class Television {
    //FIELDS
    public static int instanceCount = 0;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public DisplayType display = DisplayType.LED;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    //properties or attributes - called instance variables or fields
    private String brand = "Toshiba"; //brand name
    private int volume = 50; //current volume
    private Boolean isMuted = false;
    private int oldVolume = 5;
    private Boolean isValidBrand;

    //Television HAS-A Tuner
    private final Tuner tuner = new Tuner(); // Instantiated internally, NOT exposed (no get and set tuner)

    public void changeChannel(String channel){
        tuner.setChannel(channel);
    }

    public String getCurrentChannel(){
        return tuner.getChannel();
    }

    public static boolean isValidBrand(String brand){
        for(String valid : VALID_BRANDS){
            if(brand.equals(valid)){
                return true;

            }
        }
        return false;

    }
    //CONSTRUCTORS
    public Television(){
        instanceCount++;
        //no-op
    }

    public Television(String brand){
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume){
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display){
        this(brand, volume);
        setDisplay(display);
    }

    //BUSINESS METHODS
    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV " + "To volume " + getVolume());
}
    public void turnOff(){
        System.out.println("Shutting down... Goodbye");
        System.out.println();
}

    public void mute(){
        if(!getMuted()){
            this.oldVolume = getVolume();
            setVolume(0);
            setMuted(true);


        }else {
            setVolume(this.oldVolume);
            setMuted(false);
        }
    }
    //functions or operations - called methods in java

    //ACCESSOR METHODS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
       boolean valid = isValidBrand(brand);
       if(valid) {
           this.brand = brand;
       } else {
            System.out.println("ERROR: Invalid input: " + brand + " brand must be Samsung. LG, Sony or Toshiba");
            System.out.println("Setting brand to \"Unknown\"");
            System.out.println();
            this.brand = "Unknown";
       }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME){
            this.oldVolume = volume;
            this.volume = volume;
            if(getMuted()){
                setMuted(false);
            }
        } else {
            System.out.printf("Invalid volume: %s. Must be between  %s and %s. \n",
                    volume, MIN_VOLUME, MAX_VOLUME);

            this.volume = MIN_VOLUME;
            System.out.println();
        }
        setMuted(false);
    }

    public static int getInstanceCount(){
        return instanceCount;
    }

    public Boolean getMuted() {
        return isMuted;
    }

    public int getOldVolume() {
        return oldVolume;
    }

    public void setMuted(Boolean muted) {
        isMuted = muted;
    }

    public void setOldVolume(int oldVolume) {
        this.oldVolume = oldVolume;
    }

    private boolean verifyInternetConnection(){
        return true;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }


    public String toString(){
        if(getMuted()){
      return "com.entertainment.Television: brand=" + getBrand() + "com.entertainment.DisplayType: " + getDisplay() + ", volume=  " + "muted";

        } else {
            return String.format("com.entertainment.Television: Brand=%s, volume=%s, display=%s channel=%s", getBrand(), getVolume(), getDisplay(), getCurrentChannel() );
            // return "com.entertainment.Television: brand=" + getBrand() + " com.entertainment.DisplayType: " + getDisplay() +  ", volume=  " + getVolume();
        }

    }
}