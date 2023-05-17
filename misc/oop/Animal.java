package oop;

abstract class Animal implements Named {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  public abstract void speak();
}