package Zad4;

public abstract class Animal{
    abstract public void makeSound();

    public void printInfo(){
        System.out.println("I am an animal :)");
    }
}


class Lion extends Animal{
    @Override
    public void makeSound() {
        System.out.println("RAWRRRRRRRRR");
    }
}


class Elephant extends Animal{
    @Override
    public void makeSound() {
        System.out.println("TRUUUUUUUUU");
    }
}

class Monkey extends Animal{
    @Override
    public void makeSound() {
        System.out.println("UAUAUAUA");
    }
}