package oop;

public interface Destiny {

  default String getName() {
    return "Child";
  }

  default String say() {
    return "my " + getName();
  }
}
