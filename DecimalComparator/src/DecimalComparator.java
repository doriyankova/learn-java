public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000)) {
            return true;
        } else {
            return false;


//            (int)(3.17561313131221313) = 3175.6131313131313131 (int)-> 3175
//            (int)3.1751 = 3175.1 -> 3175;




        }


    }
}
