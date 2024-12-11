package module;

public class Cat extends Pet{
    protected String furColor;

    public Cat(){}

    public Cat(String name, int age, String furColor){
        super(name, age);
        this.furColor = furColor;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }

    public String getFurColor(){
        return furColor;
    }

    public void scratch(){
        System.out.println("Я тебя сейчас поцарапаю");
    }

    public void makeSound(){
        System.out.println("Мяу-мяу!");
    }
}