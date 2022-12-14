/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length == 3) {
            String convBrand = args[0];
//        System.out.println(convBrand.getClass());
            int convVolume = Integer.parseInt(args[1]);
//        System.out.println(convVolume);
            DisplayType convDisplay = DisplayType.valueOf(args[2]);
//        System.out.println(convDisplay.getClass());
            Television userTele = new Television(convBrand, convVolume, convDisplay);
            System.out.println(userTele.toString());
        } else if (args.length == 2){
            String convBrand = args[0];
//        System.out.println(convBrand.getClass());
            int convVolume = Integer.parseInt(args[1]);
//        System.out.println(convVolume);
            Television userTele = new Television(convBrand, convVolume);


        } else if(args.length == 1){
            String convBrand = args[0];
//        System.out.println(convVolume);
            Television userTele = new Television(convBrand);
        } else {
            System.out.println("Usage: java <Brand> <Volume> <DisplayType>");
            return;
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        //step 1

        //convert each argument to proper types
        //brand needs to be string, already is
        //args[0]volume needs to be an int and is a string Integer.parseInt()
        //args[1]display needs to be display type. need to convert DisplayType.valueOf()
        //args[2]arguments are args at the given index in the array passed in

        //Step 2
        //create new Television object with converted values

        //Step 3 print the television object and congratulate the customer on their order






    }
}