
public class Balloon {
    final static int STANDART_CAPABILITY = 4; //capability in grams
    int capability; //may be you created a special kind of balloons?
    private String color; //my balloon lift should be not only effective but  bright!
    final static String[] RANDOM_COLOR_CHOICE = new String[]
            {"Venetian Red", "Prussian Blue", "Shamrock",
                    "Dandelion", "Tan", "Cadmium Red", "Dioxazine Purple",
                    "Saffron", "Titanium White", "Carbon Black"};
    public static java.util.Random random = new java.util.Random();

    public Balloon() {
        this.color = RANDOM_COLOR_CHOICE[random.nextInt(RANDOM_COLOR_CHOICE.length)];
        this.capability = STANDART_CAPABILITY;
    }

    public Balloon(int capability) {
        this.color = RANDOM_COLOR_CHOICE[random.nextInt(RANDOM_COLOR_CHOICE.length)];
        this.capability = capability;
    }

    public void setColor(String color) {
        //user can prefer balloons of other colors
        this.color = color;
    }

    public void setCapability(int capability) {
        //user can prefer another kind of balloons
        this.capability = capability;
    }
}
