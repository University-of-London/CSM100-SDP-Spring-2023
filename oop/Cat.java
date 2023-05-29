package oop;

public class Cat extends Mammal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void speak() {
    System.out.println("Meow!");
  }
}

