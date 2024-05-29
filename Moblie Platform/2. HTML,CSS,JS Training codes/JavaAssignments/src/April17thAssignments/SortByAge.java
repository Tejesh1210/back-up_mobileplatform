package April17thAssignments;
import java.util.*;
class Person {
    private String name;
    private int age;
  
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  
    @Override
    public String toString() {
      return "Person [name=" + name + ", age=" + age + "]";
    }
  }
  
  public class SortByAge {
    public static void main(String[] args) {
      List<Person> p = new ArrayList<>();
      p.add(new Person("Manish", 80));
      p.add(new Person("suresh", 35));
      p.add(new Person("Chandresh", 55));
  
      
      p.sort((p1, p2) -> p1.getAge() - p2.getAge());
  
      System.out.println("p sorted by age:");
      for (Person person : p) {
        System.out.println(person);
      }
    }
  }
