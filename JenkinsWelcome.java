public class JenkinsWelcome {
  public static void main(String[] args) {

    System.out.println("Today's date is: ");

    String name="my_name";
    String course="my_course";
    int cohort = 2;

    printName(name);
    printClass(course, cohort);
  }

  private static void printClass(String course, int cohort) {
    System.out.println("Welcome to " + course + " training");
    System.out.println("Cohort: " + cohort);
  }

  public static void printName(String name) {
    System.out.println("My name is " + name);
  }
}
