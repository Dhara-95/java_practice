 public class HelloWorld {
    public static void main(String[] args) {
      System.out.println("Hello World");
      System.out.println("Hello Dhara");
      System.out.println("I love programming");
  }
}

  // Single line comment 

  /* 
  Multi-line
  comment
  */

  /* 
  Defining variables: 

  public class VariableExample {
	  public static void main(String[] args) {
      String name = "Dhara Patel";
      int yearBorn = 1995;
      double examScore = 80.5;

      System.out.prntln(name);  -> This will print out Dhara Patel
      System.out.prntln(yearBorn);  -> This will print out 1995
      System.out.println(examScore);  -> This will print out 80.5
  }
}
  */

  /*
  Boolean values:

  public class Booleans {
    public static void main(String[] args) {    
      boolean intsCanHoldDecimals = false; 
      System.out.println(intsCanHoldDecimals);  -> This will print out false 
    }
  }

 */ 

 /*
  Character data type:
  
  public class Char {
	  public static void main(String[] args) {   
      char expectedGrade = 'A';
      System.out.println(expectedGrade);
	}
}

*/

/*
  Numerical operations:
  
  public class NumericalOperations {
	  public static void main(String[] args) {   
		  int zebrasInZoo = 8;
      int giraffesInZoo = 4;
    
      int animalsInZoo = zebrasInZoo + giraffesInZoo;
      int numZebrasAfterTrade = zebrasInZoo - 2;
      
      System.out.println(animalsInZoo);
      System.out.println(numZebrasAfterTrade);
	}
	}
}

*/

/*
  String Equality operator:

  public class Song {
    public static void main(String[] args){
      String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
      String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

      System.out.println(line1.equals(line2));
      System.out.println(line2.equals(line3));
    }       
  }

*/

/*
  String Concatenation:

  public class Zoo {
  	public static void main(String[] args){
      int animals = 12;
      String species = "zebra";
      
      String zooDescription = "Our zoo has " + animals + " " + species + "s!";

      System.out.println(zooDescription);
    }       
  }

*/

/*
Classes:

public class Car {
// scope of Car class starts after curly brace
 
  public static void main(String[] args) {
    // scope of main() starts after curly brace
 
    // program tasks
 
  }
  // scope of main() ends after curly brace
 
}
// scope of Car class ends after curly brace

Constructor: 

public class Car {
  public Car() {
  //constructor method starts after curly brace
 
    //instructions for creating a Car instance
 
  }
  //constructor method ends after curly brace
 
  public static void main(String[] args) {
 
    // program tasks

  
    // invoke a constructor using 'new', the name, and parentheses: new Car()
    
    Car Mercedes = new Car();
 
  }
}

Constructor Example:

public class Store {
  // declare instance fields here!
  
  
  // constructor method
  public Store() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    
    Store lemonadeStand = new Store();
    
    System.out.println(lemonadeStand);
  }
}

1. Running the program invokes main()
2. We create an instance so we move from main() to Store()
3. The code inside Store() runs
4. When Store() finishes execution, we return to main()
*/