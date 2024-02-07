package collections;

public class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("name can't be null or empty");
        }
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }

    public boolean equals(Object other) {
        if (null == other) return false;
        if (this == other) return true;
        if (!(other instanceof Person that)) return false;
        return this.name.equals(that.name);
    }

    public int hashCode() {
        return name.charAt(0) - 'A';
    }
}
