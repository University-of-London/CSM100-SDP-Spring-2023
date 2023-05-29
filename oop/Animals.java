package oop;

public class Animals {

  public static void main(String[] args) {
    // Won't compile because it's abstract
    // Animal a = new Animal();
    Mammal fido = new Dog("Chloe");
    fido.speak();
    Dog fido2 = (Dog) fido; // Won't compile: Java won't implicitly downcast
    fido.speak();

    Mammal mittens = new Cat("Fiona"); // Safe
    Mammal sparky = new Mammal("Bailey");
    // Compiles, but will cause a ClassCastException at run-time,
    Dog huh = (Dog) sparky;
    // // so we won't even get here.
    // huh.wagTail();
  }

}
