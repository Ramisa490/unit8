package Practice_Tasks;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
public class AnimalsFilter extends Animal
{List<String> names = Arrays.asList("Monkey", "Snake", "Tiger", "Birds");
    public void FilteredAnimal()
    {
        List<String> sortedAnimal = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedAnimal);
        List<String>sortByLength = names.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(sortByLength);
    }
    List<String> food;
    public AnimalsFilter(int age, double weight,List<String> food)
        {
            super(age, weight);
            this.food=food;
        }
     public void findByFood() {
        Map<String, Animal> foodList = new HashMap<>();
        foodList.put("Monkey", new AnimalsFilter(23,30.8,List.of("Banana")));
        foodList.put("Lion", new AnimalsFilter(20,39.8,List.of("Meats")));
        foodList.put("Tiger", new AnimalsFilter(17,44.8,List.of("Meats")));
        foodList.put("Birds", new AnimalsFilter(3,10,List.of("Insects")));
        List<Animal> findFood = foodList.values().stream().filter(animal->
        {
                List<String>foods = (List<String>) ((AnimalsFilter) animal).food;
                return  foods.contains("Meats");

        }).collect(Collectors.toList());
        System.out.println(findFood);
    }

    @Override
    public String toString() {
        return "[Age=" + age + ", Weight=" + weight + ", Foods=" + food + "]";
    }



    public static List<Animal> FilterByAge(List<Animal> animals, int minAge)
    {
        return  animals.stream().filter(animal -> animal.age >minAge).collect(Collectors.toList());

    }

}
