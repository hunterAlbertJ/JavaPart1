/*
 *
 * Test class focused on validation logic of snoozeInterval in setter.
 * Boundary value testing (BVT) for a range of values 1-20 we need to test
 * 0,1 and 20, 21
  */
class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        //check the boundaries for valid values
        clock.setSnoozeInterval(1); // no error message and 1 should "stick"
        System.out.println("Snooze interval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20); //no error message and the 20 should "stick"
        System.out.println("Snooze interval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0); //error message and the 0 should not be applied.
        System.out.println("Snooze interval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21); //error message and the 21 should not be applied
        System.out.println("Snooze interval: " + clock.getSnoozeInterval());


    }
}