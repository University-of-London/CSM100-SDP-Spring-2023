package prototype;

public class TestCloning {

    public static void main(String[] args) {

        // Handles routing makeCopy method calls to the
        // right subclasses of Animal

        final CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance

        final Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own
        // memory location

        final Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        // These are exact copies of each other

        System.out.println(sally);

        System.out.println(clonedSheep);

        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));

        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }

}