package jackets;

public class JacketHM implements IJacket{
    private String colour;
    private String season;

    public JacketHM(String colour, String season) {
        this.colour = colour;
        this.season = season;
    }

    public JacketHM() {
    }

    @Override
    public void putOn() {
        System.out.println("Куртка H&M одета!");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка H&M снята!");
    }
}
