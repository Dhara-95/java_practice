# Java Practice 

Learning Java using the [Codeacedemy 'Learn Java'](https://www.codecademy.com/learn/learn-java) course, as well as other online resources. 

## Notes

### General 

- Java Virtual Machine allows the same code to be run on different operating systems (Windows, Mac or Linux). 
- Files have a ```.java``` extention. 
- Can compile a .java file from the terminal with the command ```javac SomeFile.java``` - Compilation helps to catch an error. 
- If the file compiles successfully, this command produces an executable class: FileName.class. Executable means we can run this program from the terminal with the command ```java SomeClassName```.

We run the executable with the command:

java Whales

javac Whales.java

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
