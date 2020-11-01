package pants;

public class PantsGloriaJeans implements IPants {
    private String colour;
    private String type;

    public PantsGloriaJeans(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public PantsGloriaJeans() {
    }

    @Override
    public void putOn() {
        System.out.println("Штаны Gloria Jeans одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны Gloria Jeans сняты");
    }
}
