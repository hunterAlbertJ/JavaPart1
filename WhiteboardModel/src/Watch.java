import java.time.LocalTime;

class Watch {
    //static fields that allow us to have data validation in the setters
    public static int MIN_FACESIZE = 30;
    public static int MAX_FACESIZE = 50;


    //These values are placeholders and/or if a watch is instantiated without any arguments
    private int faceSize = MIN_FACESIZE;
    private WatchMaterial material = WatchMaterial.PLASTIC;
    private String movement = "Digital";
    private Boolean smartwatch = false;
    private Double accuracy = 0.0;

    //counter for amount of watches in collection
    public static int watchCount = 0;

    public Watch(){
        //no-op
        watchCount++;
    }

    public Watch(int faceSize, WatchMaterial material, String movement){
        this();
        setMovement(movement);
        setMaterial(material);
        setFaceSize(faceSize);

    }

    public Watch(int faceSize, WatchMaterial material, String movement, Boolean smartwatch){
        this(faceSize, material, movement);
        setSmartwatch(smartwatch);
    }

    public Watch(int faceSize, WatchMaterial material, String movement, Boolean smartwatch, Double accuracy){
        this(faceSize, material, movement, smartwatch);
        setAccuracy(accuracy);
    }

    void tellTime(){
        LocalTime time = LocalTime.now();
        System.out.println("The current time is " + time);
    }
    void describe(){
        System.out.println("This watch is...");
        if(getSmartwatch()){
            System.out.println("A smartwatch");
        }else{
            System.out.println("Not a smartwatch");
        }
        System.out.println("That is made of " + getMaterial());
        System.out.println("With a " + getMovement() + " movement");
        System.out.println("A face size of " + getFaceSize() + " millimeters");
        System.out.println("That looses + / - " + getAccuracy() + " seconds a day");
        System.out.println("amount of watches: " + getWatchCount());
    }

    public int getFaceSize() {
        return faceSize;
    }

    public void setFaceSize(int faceSize) {
        if(faceSize >= MIN_FACESIZE && faceSize < MAX_FACESIZE){
            this.faceSize = faceSize;

        } else {
            System.out.println("ERROR: Incorrect face size " + faceSize + ". Must set face size between " + MIN_FACESIZE
            + " and " + MAX_FACESIZE + " inclusive. ");
        }
    }

    public WatchMaterial getMaterial() {
        return material;
    }

    public void setMaterial(WatchMaterial material) {
        if(material.toString().equals("Aluminum") || material.toString().equals("Steel") || material.toString().equals("Silver") || material.toString().equals("Gold")){
            this.material = material;

        } else {
            System.out.println(material.toString().getClass());
            System.out.println("Error! invalid material " + material + ". Material must be Gold, Silver, Steel or Aluminum.");
        }
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public Boolean getSmartwatch() {
        return smartwatch;
    }

    public void setSmartwatch(Boolean smartwatch) {

        this.smartwatch = smartwatch;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        if(accuracy > 10.0){
            System.out.println("Error! something is wrong with your watch if it is off by +-10 seconds a day or more.");
        } else {
            this.accuracy = accuracy;
        }
    }

    void service(){
        System.out.println("You get the watch serviced");
    }

    void wearWatch(){
        System.out.println("You try on the watch. nice");
    }

    void putAway(){
        System.out.println("You put the watch away");
    }

    public static int getWatchCount() {
        return watchCount;
    }

    @Override
    public String toString(){
        return "Watch: " + "smartwatch: " + getSmartwatch() + " material: " + getMaterial() + " movement: " + getMovement() +  "facesize: " +getFaceSize() + "  accuracy: " + getAccuracy();

    }


}

