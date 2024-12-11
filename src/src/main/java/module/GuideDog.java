package module;

public class GuideDog extends Dog{
    protected String certified;
    protected int smell;

    public GuideDog(){}

    public GuideDog(String name, int age, String breed, int smell, String certified){
        super(name, age, breed);
        this.certified = certified;
        this.smell = smell;
    }

    public void setCertified(String certified){
        this.certified = certified;
    }

    public void setSmell(int smell){
        this.smell = smell;
    }

    public int getSmell(){
        return smell;
    }

    public String getCertified(){
        return certified;
    }


    public void assistOwner(){
        System.out.println("Сейчас я тебе помогу найти нужную вещь");
    }

    @Override
    public void makeSound(){
        System.out.println("Гав-гав!");
    }

    public void smellFight(int distance){
        if (distance <= smell){
            System.out.println("Я могу учуять запах");
        }
        else {
            System.out.println("Объект находится слишком далеко, я не могу учуять запах");
        }
    }
}