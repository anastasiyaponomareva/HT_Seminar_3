
public class House {
    private int num_floors; //number of floors
    private int width; //width  of a floor
    private int length; //length of a floor
    private double weight; //weight of a house
    private int square; //square of a house
    final static int WALL_WEIGHT = 250; //wall weight per 1 m^2
    final static int FLOOR_WEIGHT = 150; //floor weight per 1 m^2
    final static double FLOOR_HEIGHT = 2.5; //floor height

    public House(int num_floors, int width, int length) {
        this.num_floors = num_floors;
        this.width = width;
        this.length = length;
        this.weight = getWeight();
        this.square = getSquare();
    }

    public void setNum_floors(int num_floors) {
        this.num_floors = num_floors;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWeight() {
        double all_wall_weight = ((this.length * 2.5 + this.width * 3) * FLOOR_HEIGHT) * WALL_WEIGHT;
        double one_floor_weight = this.getSquare() * FLOOR_WEIGHT;
        return all_wall_weight * this.num_floors + one_floor_weight * (this.num_floors + 1);
    }

    public int getSquare() {
        return this.width * this.length;
    }

    public void addBalloons(Balloon ballon) {
        HouseUp.total_weight -= ballon.capability * 0.001;
        ++HouseUp.quantity;
    }

    public void addBalloons(int capability) {
        HouseUp.total_weight -= capability * 0.001;
        ++HouseUp.quantity;
    }

}
