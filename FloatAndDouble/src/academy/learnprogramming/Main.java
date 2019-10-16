package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("myIntValue= "+ myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        System.out.println(myFloatValue);

        double numberOfPounds = 6;
        double convertedKilograms = numberOfPounds * 0.45359237;
        System.out.println("convertedKilograms=" + convertedKilograms);


        double poundToKilo = 0.45359237;
        double myPounds = 10;
        double myKilos = myPounds * poundToKilo;
        System.out.println(myKilos);








    }
                }
