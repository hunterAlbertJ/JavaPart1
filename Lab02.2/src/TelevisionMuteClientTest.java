class TelevisionMuteClientTest {
    public static void main(String[] args) {
        Television muteTest = new Television("Samsung", 32);
        //passes initial value of 32 to constructor
        System.out.print (muteTest.getVolume() == 32);
        System.out.println(": Volume should be 32 (original value)");
        //setting value to 40
        muteTest.setVolume(40);

        System.out.println((muteTest.getVolume() == 40) + ": Volume should be 40");

        muteTest.mute();

        System.out.println((muteTest.getMuted() == true) + (": Should mute") );
        System.out.println((muteTest.getVolume() == 0) + (": Volume should be 0"));
        System.out.println((muteTest.getMuted() == true) + ": Should mute");

        muteTest.setVolume(20);

        System.out.println((muteTest.getVolume() == 20) + ": should un-mute and change value to 20");
        System.out.println((muteTest.getMuted() == false) + ": Should return false");
        System.out.println((muteTest.getVolume() == 20 ) + ": should return volume of 20");

    }
}