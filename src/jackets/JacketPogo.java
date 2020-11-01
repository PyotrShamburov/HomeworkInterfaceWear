package jackets;

public class JacketPogo implements IJacket{
    private String colour;
    private String season;

    public JacketPogo(String colour, String season) {
        this.colour = colour;
        this.season = season;
    }

    public JacketPogo() {
    }

    @Override
    public void putOn() {
        System.out.println("Куртка Pogo одета!");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка Pogo снята!");
    }
}
