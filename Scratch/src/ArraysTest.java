import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 60;
        ages[1] = 55;
        ages[2] = 23;
        ages[3] = 19;
        System.out.println(ages); //garbage information

        for(int age : ages){ //for each loop that allows you to see everything in the array
            System.out.println(age);
        }
        System.out.println(Arrays.toString(ages)); //better way of using arrays object that will return in brackets and sperated by commas

        double[] temps = {72.3, 65.5, 80.0, 93.3, 63.7};
        System.out.println(Arrays.toString(temps));

        String[] sports = {"cricket", "pickle ball", "baseball", "soccer", "duck racing" };
        System.out.println(Arrays.toString(sports ));

        double sum = 0.0;
        for (double temp : temps){
            sum += temp;
        }
        double avg = sum / temps.length;
        System.out.printf("the average temp is %.1f", avg);
    }
}