public class MethodOverriding {
    public static void main(String[] args)
    {
        Animal animal=new Animal();
        Cat cat=new Cat();
        Dog dog=new Dog();
        animal.sound();
        cat.sound();
        dog.sound();
    }
}

class Animal
{
    String category="Animal";
    public void sound()
    {
        System.out.println(category+" makes sound");
    }

}
class Cat extends Animal
{
    String animalName="Cat";
    @Override
    public void sound()
    {
        System .out.println("The "+animalName+" says Meow meow..");
    }
}
class Dog extends Animal
{
    String animalName="Dog";
    @Override
    public void sound()
    {
        System .out.println("The "+animalName+" says Wow wow..");
    }
}