/*
 * Client-side main class (class with main method)
 * create a few alarm clock objects and give it a test drive
 *
 */
class AlarmClockClient {
    //starting point or entry point for every java application

    public static void main(String[] args) {
        //create an instance of alarm clock (alarm clock object) and set its pproperties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(AlarmClock.MAX_INTERVAL); // Longest it can possibly be
        //individually setting snooze interval
        //make clock 1 snooze
        clock1.snooze();

        //create another AlarmClock and set its properties also
        //snooze interval repeat constructor

        AlarmClock clock2 = new AlarmClock(10, 10);


        //make clock2 snooze
        clock2.snooze();

        AlarmClock clock3 = new AlarmClock();
        //make alarm clock 3 snooze
        clock3.snooze();

        System.out.println();
        //show their toString method in action
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3.toString());
    }
}