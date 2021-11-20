package Animal_interface_Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound () {
        return "oooo";
    }
    public String howtoEat () {
        return "Eat rice";
    }
}
