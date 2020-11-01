package shoes;

public class ShoesNewBalance implements IShoes {
    private String colour;
    private String type;

    public ShoesNewBalance(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public ShoesNewBalance() {
    }

    @Override
    public void putOn() {
        System.out.println("Кроссовки New Balance одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Кроссовки New Balance сняты");

    }
}
