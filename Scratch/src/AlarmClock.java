/*
 * Class definition to model the workings of an alarm clock
 * This class does not have a main method
 * most classes dont
 * This is often called a business class or a system class
 * static means shared
 */
class AlarmClock {
    //static methods can live up here too. does not execute in a specific method
    //static methods can not use instance variables or regular instance methods
    //class-level (static) or shared variables - only one copy of each
    public static final int MAX_INTERVAL = 20;
    public static final int MIN_INTERVAL = 1;
    // properties of an alarm clock "fields" or instance variables
    private int snoozeInterval = 5; //default value if client does not specify one instead of 0
    private int repeat; //number of times it goes off before giving up



    //blank constructor that allows us to set the snooze interval later
    public AlarmClock(){
        //no-op
    }

    //constructors - special methods that are called when the client says new
    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval);

    }

    public AlarmClock(int snoozeInterval, int repeat){
        this(snoozeInterval);  //delegate to one arg ctor for snooze interval
        setRepeat(repeat); //handle repeat here by delegating to setRepeat method
    }

    //functions or methods in other languages - called methods in java
    //business or action method
   public void snooze(){
        System.out.println("snoozing for " + snoozeInterval + " minutes.");

    }

    //accessor methods (getter/setter methods)
    //provide controlled access to the objects internal data


    public int getSnoozeInterval() {
        return snoozeInterval;
    }
    //TODO: implement business rule: incoming value must be [1,20] (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if(snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL){
            this.snoozeInterval = snoozeInterval;
        }else{
            System.out.println("Invalid snooze interval: " + snoozeInterval +
                    " snooze interval must be between " + MIN_INTERVAL + " and " + "20.");
        }

    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString(){
       return "AlarmClock: My snooze interval is " + snoozeInterval;
     }
}