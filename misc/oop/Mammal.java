package oop;

public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
  }

  @Override
  public void speak() {
    System.out.println("Hello!");
  }
}