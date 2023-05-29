package access;

public class Base {
    private int field;

    protected int getField(){
        return field;
    }

    protected void setField(int field){
        this.field = field;
    }
}

class SubType extends Base {
    public void meth(){
        setField(getField() * 2); // because of inheritance
    }
}

class AnotherClass {
    Base b = new Base();

    void myMethod(){
        b.getField(); // because it is in the same package
    }
}

interface MyInterface {
    int getField();
    // protected void setField(int field);
}