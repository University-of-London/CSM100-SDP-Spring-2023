package oop;

public class Dog extends Mammal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void speak() {
    System.out.println("Woof, woof!");
  }

  public void wagTail() {
    System.out.println("(wags tail)");
  }
}
