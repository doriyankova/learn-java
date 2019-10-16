public class Smetka {

    public static void test( int amount, int numberOfPeople) {

        System.out.println("Vseki triabva da plati po: "+ dial(amount, numberOfPeople));
        System.out.println("Bakshisha e: " + bakshish(amount, numberOfPeople));
    }

    public static int dial(int amount, int numberOfPeople) {

        int a = amount / numberOfPeople;

        return a + 1;

    }

    public static int bakshish(int amount, int numberOfPeople) {

        return (dial(amount, numberOfPeople) * numberOfPeople) - amount;


    }
}


