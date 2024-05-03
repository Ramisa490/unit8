// Monkey class
package Practice_Tasks;

public class Monkey extends Animal {

    String FoodType;

    public Monkey(int age, double weight, String FoodType) {
        super(age, weight);
        this.FoodType = FoodType;
    }

    @Override
    public void EatFood()
    {
        System.out.println("This monkey loves " + FoodType);

    }

}
