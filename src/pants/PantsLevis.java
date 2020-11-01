package pants;

public class PantsLevis implements IPants {
    private String colour;
    private String type;

    public PantsLevis(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public PantsLevis() {
    }

    @Override
    public void putOn() {
        System.out.println("Штаны Levis одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны Levis сняты");

    }
}
