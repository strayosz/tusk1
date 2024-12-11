import module.Cat;
import module.Dog;
import module.GuardDog;
import module.Bird;
import module.GuideDog;
import module.Pet;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("barsik", 10, "Black");
        Dog sharik = new Dog("sharik", 15, "ovcharka");
        Pet something = new Pet("Kendra", 18);
        something.makeSound();
        barsik.makeSound();
        sharik.makeSound();
        GuardDog bobik = new GuardDog("bobik", 9, "husky", 100);
        Bird dudu = new Bird("lulu", 2, 9);
        System.out.println(dudu.getName());
        bobik.powerFigth(6);
        System.out.println(bobik.getTrainingLevel());
        bobik.upTrainingLevel(10);
        GuideDog persik = new GuideDog("persik", 10, "shpiz", 10, "middle");
        persik.smellFight(100);
        persik.commands("Сидеть");
    }
}