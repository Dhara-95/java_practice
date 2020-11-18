# Java Practice 

Learning Java using the [Codeacedemy 'Learn Java'](https://www.codecademy.com/learn/learn-java) course, as well as other online resources. 

## Notes

### General 

- Java Virtual Machine allows the same code to be run on different operating systems (Windows, Mac or Linux). 
- Files have a ```.java``` extention. 
- Can compile a .java file from the terminal with the command ```javac SomeFile.java``` - Compilation helps to catch an error. 
- If the file compiles successfully, this command produces an executable class: SomeFileName.class. Executable means we can run this program from the terminal with the command ```java SomeFileName```.
- Whitespaces are not essential but important when it comes to code readability. 
- Variable naming should be in camelCase.

### Syntax

HelloWorld example:
```
public class HelloWorld {
    public static void main(String[] args) {
      System.out.println("Hello World!");
    }
  }
```
- ```main()``` method within a class lists the program tasks.
- ```String[] args``` is a placeholder for information we want to pass into our program.
- ```println``` is short for “print line” and is used to print the message on the screen (in Terminal). To print to the Terminal run the command ```java HelloWorld.java```. 
- Single line comments: ```//``` ; Multi-line comments: ```/*  */```.
- Semicolons are used to mark the end of a statement, one line of code that performs a single task.
- Curly braces mark the scope of our classes and methods. There are no semicolons at the end of a curly brace.   
- When setting a variable, the datatype must be specified e.g. ```int age = 25```, ```String name = "Dhara"```. 
- ```double``` data types can hold decimals as well as bery large and very small numbers...they are more appropriate than ```int``` in some cases.
- The ```char``` data type can hold any character, like a letter, space, or punctuation mark - it must be surrouded by single qoutes.
- Just like in other OOP languages, the ```String``` data type must be surrounded by double quotes e.g. ```String languageName = "Java programming language";```.
- Similarly to Ruby & JavaScript, Java has built-in math operations (plus, minus, multiplication, division, modulo etc.).
- Java also has relational operators for numeric datatypes that make boolean comparisons e.g. <, >, >=, <= ==, !=
- To test equality with objects, a built-in method called ```.equals()``` is used. 
- string concatentation is the same as Ruby and JS: 

  ```
  String username = "Dhara Patel";
  System.out.println("Your username is: " + username);
  ```
- Instance variables/fields are called just before the constructor method within the class. Instance fields are available in scope of constructor method. 
