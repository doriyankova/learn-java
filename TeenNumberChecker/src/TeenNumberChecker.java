
public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {

        if( firstNumber > 12 && firstNumber < 20 ) {
            return true;
        }
        if ( secondNumber > 12 && secondNumber < 20 ) {
            return true;
        }
        if ( thirdNumber > 12 && secondNumber < 20 ) {
            return true;
        }else {
            return false;
        }

    }

    public static boolean isTeen(int fourthNumber) {

        if (fourthNumber > 12 && fourthNumber < 20) {
            return true;
        } else {
            return false;
        }
    }

}

public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {

        if (isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber)){
            return true;

        } else {
            return false;


        }

    }

    public static boolean isTeen(int fourthNumber) {

        if (fourthNumber > 12 && fourthNumber < 20) {
            return true;
        } else {
            return false;
        }
    }

}




