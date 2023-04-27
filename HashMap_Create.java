import java.util.HashMap;

class HashMap_Create {
  public static void main(String[] args) {

    // create a hashmap
    HashMap<String, Integer> languages = new HashMap<>();

    // add elements to hashmap
    languages.put("Java", 8);
    languages.put("JavaScript", 1);
    languages.put("Python", 3);
    System.out.println("HashMap: " + languages);
 // get() method to get value
 Integer value = languages.get(1);
 System.out.println("Value at index 1: " + value);
 // change element with key 2
 languages.replace("C++", 2);
 System.out.println("HashMap using replace(): " + languages);
 
    // remove element associated with key 2
    String value = languages.remove(2);
    System.out.println("Removed value: " + value);

    System.out.println("Updated HashMap: " + languages);  
}
}