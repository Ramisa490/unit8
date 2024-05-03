// Donkey class
package Practice_Tasks;

import org.testng.annotations.Test;

public class Donkey extends Animal {

    String Name;

    public Donkey(int age, double weight, String Name) {
        super(age, weight);
        this.Name = Name;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Donkey with name " + Name + ": age " + age + ", weight " + weight);

    }
    @Override
    public void EatFood() {
        System.out.println("Donkey is eating hay");
    }



}
