package staticexample;

public class MyClass {
    public void myMethod() {}

    public static void main(String[] args) { // class level
        MyClass.myOtherMethod(); // class level
        new MyClass().myMethod(); // instance level
    }

    public static void myOtherMethod() {}
}
