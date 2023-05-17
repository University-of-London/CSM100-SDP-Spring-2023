package improvements.trywithresources;

class Resource implements AutoCloseable {
  public Resource() {
    System.out.println("created...");
  }

  public void op1() {
    System.out.println("op1...");
  }

  @Override
  public void close() {
    System.out.println("cleanup...");
  }
}

class Sample {
  // Resource may be dependency injected
  public static void use(Resource resource) {
    System.out.println("entering use...");

    // don't have to create resource in try anymore to use try-with-resource
    try (resource) {
      resource.op1();
    } // close called...

    System.out.println("better not to use here the " + resource);
    // resource = new Resource(); //ERROR, resource should be final or effectively
    // final
  }

  public static void main(String[] args) {
    use(new Resource());
  }
}
