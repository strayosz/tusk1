package module;

public class Bird extends Pet{
    protected int wingSpan;

    public Bird(){}

    public Bird(String name, int age, int wingSpan){
        super(name, age);
        this.wingSpan = wingSpan;
    }

    public void setWingSpan(){
        this.wingSpan = wingSpan;
    }

    public int getWingSpan(){
        return wingSpan;
    }

    public void fly(){
        System.out.println("Я сейчас полечу");
    }

    @Override
    public void makeSound(){
        System.out.println("Кар-кар!");
    }
}