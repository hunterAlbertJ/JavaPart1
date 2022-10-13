package it.snip;

public class Scissors {
    /*
     *This is a static initializer block
     * this block is executed when the JVM ClassLoader loads it.snip.Scissors.class into the JVM
     */
    static {
        System.out.println("it.snip.Scissors.class loaded into memory");

    }
    public static void staticMethod(){
        System.out.println("staticMethod() has been called");
    }


    //fields or instance variables
    private String color;
    private double bladeLength;
    private int sharpness = 5; // constrain [1-10]
    private boolean isLefty = false;

    //constructors - special methods that get called when the client says "new"

    public Scissors(String color, double bladeLength, int sharpness){
        setColor(color);
        setBladeLength(bladeLength);
        setSharpness(sharpness);
    }

    public Scissors(String color, double bladeLength, int sharpness, boolean isLefty) {
        //delegate to each setter for any validation conversion
        this(color, bladeLength, sharpness); // delegate to 3 arg constructor for color, bladelength and sharpness
                                            // deal with is lefty by delegating to it setter
        setLefty(isLefty);
    }
    public Scissors(){

    }

    //business or action methods
    public void cut(){
        System.out.println("snip snip");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }

    public boolean isLefty() {
        return isLefty;
    }

    public void setLefty(boolean lefty) {
        isLefty = lefty;
    }

    @Override
    public String toString() {
        return "it.snip.Scissors{" +
                "color='" + getColor() + '\'' +
                ", bladeLength=" + getBladeLength() +
                ", sharpness=" + getSharpness() +
                ", isLefty=" + isLefty();
    }
}