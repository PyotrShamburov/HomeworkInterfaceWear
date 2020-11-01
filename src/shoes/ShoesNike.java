package shoes;

public class ShoesNike implements IShoes{
    private String colour;
    private String type;

    public ShoesNike (String colour,String type){
        this.colour = colour;
        this.type = type;
    }
    public ShoesNike(){
    }

    @Override
    public void putOn() {
        System.out.println("Кроссовки Nike одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Кроссовки Nike сняты");
    }
}
