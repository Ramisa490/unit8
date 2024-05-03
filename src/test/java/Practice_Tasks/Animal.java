// Animal class
package Practice_Tasks;

import org.testng.annotations.Test;

public class Animal {
    int age;
    double weight ;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void EatFood() {
        System.out.println("Animal is eating food ");

    }
    public void PrintInfo() {
        System.out.println("Age : " + age);
        System.out.println("Weight : " + weight);

    }

}
