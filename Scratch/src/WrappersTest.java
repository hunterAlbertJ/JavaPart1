class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "23";
        int age = Integer.parseInt(ageInput); //returns int 55 from "55"
        Integer ageInteger = Integer.valueOf((ageInput)); // returns Integer(55) from "55"

        String populationInput = "7753000000";
        long population = Long.parseLong(populationInput); // returns long from string

        Long populationLong = Long.valueOf(populationInput); //returns Long object from string

        String debtInput = "31000000000000";
        double debt = Double.parseDouble(debtInput); //returns double from string
        Double debDouble = Double.valueOf(debtInput);// returns Double from string

        String shoesInput = "false";
        boolean wearsShoes = Boolean.parseBoolean(shoesInput);
        Boolean wearsShoesBoolean = Boolean.valueOf(shoesInput);

        System.out.println(age);
        System.out.println(ageInteger);



    }
}