import module.Cat;
import module.Dog;
import module.GuardDog;
import module.Bird;
import module.GuideDog;

import java.security.Guard;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("barsik", 10, "Black");
        Dog sharik = new Dog("sharik", 10, "ovcharka");
        barsik.makeSound();
        sharik.makeSound();
        GuardDog artem = new GuardDog("name", 10, "poroda", 100);
        Bird dudu = new Bird("lulu", 2, 9);
        System.out.println(dudu.getName());
        artem.powerFigth(6);
        System.out.println(artem.getTrainingLevel());
        artem.upTrainingLevel(10);
        GuideDog alexandra = new GuideDog("name", 10, "poroda", 10, "sldjksklg");
        alexandra.smellFight(100);
        alexandra.commands("asjfhajshf");
    }
}