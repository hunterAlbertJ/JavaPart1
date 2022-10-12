class ScissorsClient {
    public static void main(String[] args) {

        Scissors.staticMethod();

        Scissors s1 = new Scissors();
        s1.setColor("red");
        s1.setBladeLength(1.75);
        s1.setSharpness(2);
        s1.setLefty(true);
        System.out.println(s1);

        Scissors s2 = new Scissors("orange", 7.5, 10);
        System.out.println(s2);



    }
}