/*
 *Class which contains several function (methods) to do some calculations
 *
 */
class Calculator {

    /**
     * returns a random int between min and max inclusive
     *
     */
    public static int randInt(int min, int max){
        //adjust the given range to start at 0
        int zeroAdjusted = max - min;
        //create seed which is a positive value between 0 and 1
        double seedVal = Math.random();
        //multiply adjusted range by the random seed to get placement
        double temp = zeroAdjusted * seedVal;
        //move range back to original position
        int randomResult = (int) Math.rint(temp) + min;
        return randomResult;

    }

    /**
     * Returns a random int between 1 and 21 (inclusive)
     *
     * see a class called math in packacge java.lang
     */
    public static int randInt() {
        //this is a local variable and will only exist in memory at runtime and does not have permanence.
        int result = 0;

        int studentCount = 22;
        double tempVar = Math.random();
        double randVal = studentCount * tempVar;
        System.out.println(Math.round(randVal));

        return result;
    }


    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
    public boolean isEven(int value){
        return value % 2 == 0;
    }
}