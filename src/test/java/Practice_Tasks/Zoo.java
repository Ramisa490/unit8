package Practice_Tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo extends Animal {
    String city;
    List<Animal> AnimalType; // Change from List<String> to List<Animal>

    public Zoo(int age, double weight, String city, List<Animal> Animal) {
        super(age, weight);
        this.city = city;
        this.AnimalType = Animal;
    }

    public void PrintAnimals() {
        System.out.println("In " + GetCity(city) + " zoo we have animals:");

        for (Animal animalType : AnimalType) {
            animalType.PrintInfo();
        }
    }

    public void FeedAnimals() {
        System.out.println("Let's feed animals in " + GetCity(city) + " Zoo!");
        int index = 0;
        while (index < AnimalType.size()) {
            Animal animal = AnimalType.get(index);
            System.out.println("Feeding " + animal.getClass().getSimpleName() + ":");
            animal.EatFood();

          /*  if (animal instanceof Monkey) {
                Monkey monkey = (Monkey) animal;
                monkey.EatFood("Banana");
            } else if (animal instanceof Donkey) {
                Donkey donkey = (Donkey) animal;
                donkey.EatFood("Hay");
            } else {
                animal.EatFood("Unknown");
            }*/

            index++;
        }
    }



    public String GetCity(String city) {
        return city;
    }
}
