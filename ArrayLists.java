import java.util.ArrayList;

public class ArrayLists { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add(0,"naresh");
    cars.set(0,"suresh");
    System.out.println(cars);
    System.out.println(cars.get(0)); 
    System.out.println(cars.remove(0));
    // cars.clear();
    System.out.println(cars.size());
  } 
}