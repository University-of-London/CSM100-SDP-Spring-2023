package algorithms;

public class GtStudent {

  private String name;
  private Major major;

  public GtStudent(String aname, Major amajor) {
    name = aname;
    major = amajor;
  }

  public String getName() {
    return name;
  }

  public Major getMajor() {
    return major;
  }

  public String toString() {
    return name + " (" + major + ")";
  }
}
