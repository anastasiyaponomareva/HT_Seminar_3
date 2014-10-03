/**
 * Ponomareva Anastasia
 * 201 SE-1
 * 26.09.2014
 */
public class HouseUp {
    public static int quantity = 0; //number of balloons needed to lift the house
    public static double total_weight = 0; //how much is left to make house lift

    public static void main(String[] args) {
        //creating a house to lift
        House myHouse = new House(new Integer(args[0]),
                new Integer(args[1]), new Integer(args[2]));
        System.out.println("lifting up the house using instances of \"Balloon\":");
        total_weight = myHouse.getWeight();
        long time1 = System.currentTimeMillis(); //time measurement
        //lifting the house up with Balloon

        do {
            myHouse.addBalloons(new Balloon());

        } while (total_weight >= 0);

        System.out.println("quantity=" + quantity);
        long time2 = System.currentTimeMillis();
        System.out.println("time=" + (time2 - time1));

        //lifting house with primitive
        System.out.println("lifting up the house using primitives:");
        //setting correct data for the experiment
        total_weight = myHouse.getWeight();
        quantity = 0;

        time1 = System.currentTimeMillis(); //time measurement
        do {
            myHouse.addBalloons(4);

        } while (total_weight >= 0);
        System.out.println("quantity=" + quantity);
        time2 = System.currentTimeMillis(); //time measurement
        System.out.println("time=" + (time2 - time1));
        /**
         * Conclusion:
         * Resolving the task using primitive type works faster,
         * as no time is to be spent on creating instance.
         * NB: if class Balloons contains string fields and uses
         * random in initializing, work time of the process increases sharply.
         */
    }
}
