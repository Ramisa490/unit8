package Practice_Tasks;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{

    @Test
    public void test()
    {
        //Monkey Donkey Class
        Animal monkey = new Monkey(23,30,"Banana");
        Animal donkey = new Donkey(24,40.4,"Donkey");
        donkey.PrintInfo();
        monkey.EatFood();

        //Zoo class

        List<Animal> AnimalZoo = new ArrayList<>();
        AnimalZoo.add(new Monkey(23,30,"Banana"));
        AnimalZoo.add(new Donkey(24,40.4,"Hey"));

        Zoo zoo = new Zoo(24, 30.8, "New York", AnimalZoo);
        zoo.PrintAnimals();
        zoo.FeedAnimals();


        //AnimalsFilter

        Animal filteredAnimal = new AnimalsFilter(37,89.8,List.of("Banana","Meat","Meat","Insects"));
        AnimalsFilter af =(AnimalsFilter) filteredAnimal;
        af.FilteredAnimal();
        af.findByFood();

       List<Animal> animals = Arrays.asList(
                new AnimalsFilter(5, 20.5, List.of("Grass")),
                new AnimalsFilter(10, 35.2, List.of("Carrots")),
                new AnimalsFilter(15, 40.0, List.of("Fish"))
        );

        List<Animal> filteredAnimals = AnimalsFilter.FilterByAge(animals, 10);
        System.out.println(filteredAnimals);

        //Polymorphism

        // Create list of animals
        List<Animal> zooAnimals = new ArrayList<>();
        zooAnimals.add(new Animal(25, 70));
        zooAnimals.add(new Animal(3, 4.55));
        zooAnimals.add(new Monkey(7, 39.5, "Banana"));
        zooAnimals.add(new Donkey(12, 69, "Donny"));
        zooAnimals.add(new Monkey(18, 75, "Bamboo"));
        zooAnimals.add(new Donkey(2, 32.2, "Little"));

        // Create Zoo instance with city "New York" and pass the list of animals
        Zoo newYorkZoo = new Zoo( 0,0,"New York",zooAnimals);


        newYorkZoo.FeedAnimals();
        newYorkZoo.PrintAnimals();

        List<Animal> filtered = AnimalsFilter.FilterByAge(zooAnimals, 10);
        Zoo grownAnimal = new Zoo(0,0,"City of grown up animals",filtered);
        grownAnimal.PrintAnimals();

        //Lastly

        List<Zoo>zoos = new ArrayList<>();
        zoos.add(zoo);
        zoos.add(grownAnimal);

        List<Zoo> grownUPZoos = zoos.stream().filter(n->n.city.contains("City of grown up animals")).collect(Collectors.toList());
        grownUPZoos.forEach(Zoo::PrintAnimals);



    }


}
