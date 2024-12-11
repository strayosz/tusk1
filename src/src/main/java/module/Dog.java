package module;

public class Dog extends Pet {
    protected String breed;

    public Dog(){}

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void commands(String command){
        System.out.println("Я не знаю такой команды, научите меня)");
    }

    @Override
    public void makeSound(){
        System.out.println("Гав-гав!");
    }
}