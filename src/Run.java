import jackets.JacketHM;
import jackets.JacketPogo;
import pants.PantsGloriaJeans;
import pants.PantsLevis;
import shoes.ShoesNewBalance;
import shoes.ShoesNike;

public class Run {
    public static void main(String[] args) {
        JacketHM jacketHM = new JacketHM("Red","Winter");
        JacketPogo jacketPogo = new JacketPogo("White","Winter");

        PantsGloriaJeans pantsGloriaJeans = new PantsGloriaJeans("Blue","Jeans");
        PantsLevis pantsLevis = new PantsLevis("White","Jeans");

        ShoesNike shoesNike = new ShoesNike("White","Nike Air");
        ShoesNewBalance shoesNewBalance = new ShoesNewBalance("Black","365");

        Person person = new Person("Michael",jacketHM,pantsLevis,shoesNewBalance);
        Person person1 = new Person("Daniel",jacketPogo,pantsGloriaJeans,shoesNike);

        person.takingOff();
        person.puttingOn();
        System.out.println();

        person1.puttingOn();
        person1.takingOff();

    }
}
