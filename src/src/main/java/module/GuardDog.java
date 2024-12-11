package module;

public class GuardDog extends Dog{
    protected int trainingLevel;

    public GuardDog(){}

    public GuardDog(String name, int age, String breed, int trainingLevel){
        super(name, age, breed);
        this.trainingLevel = trainingLevel;
    }

    public void setTrainingLevel(int trainingLevel){
        this.trainingLevel = trainingLevel;
    }

    public int getTrainingLevel(){
        return trainingLevel;
    }

    public void guardArea(){
        System.out.println( "Я сейчас буду охранять территорию");
    }

    @Override
    public void makeSound(){
        System.out.println("Гав-гав!");
    }

    public void upTrainingLevel(int up){
        trainingLevel += up;
        System.out.println(trainingLevel);
    }

    public void powerFigth(int powerThief){
        if (powerThief <= trainingLevel){
            System.out.println("Я могу прогнать вора");
        }
        else {
            System.out.println("Я не могу прогнать вора");
        }
    }
}