//Create a basic code 
/*import java.util.Scanner;


public class Base {
  public static void main(String[] args) {
    String name = "Manoj";
    int age = 24;
    char grade = "A";
    double salary= 245000.00;
    boolean isStudent = true;

    System.out.println(age);
    System.out.println(salary);
    System.out.println(grade);
    System.out.println(isStudent);


    //Identifiers
    int minutesPerhour = 60;


// Invalid identifiers:
//int 2ndNumber = 5;  // Cannot start with a digit
//int my var = 10;    // Cannot contain spaces
//int int = 20;       // Cannot use reserved keywords
  

//<--Constants(Use Final KeyWord)-->
final int MyNum = 15;
myNum = 20;  //Error: cannot assign a value to final variable 'myNum'

}
}
*/

//Create a class for user input 
import java.util.Scanner;

// for this practice first create a class and 
// then create a main method and then create an object of the Scanner class to take input from the user and print the data

public class Base {
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = sc.nextLine();

    System.out.println("Enter your age : ");
    int age = sc.nextInt();

    System.out.println("Enter your grade : ");
    char grade = sc.next().charAt(0);

    System.out.println("Enter your salary : ");
    double salary = sc.nextDouble();

    System.out.println("\n--- User Details ---");
    System.out.println("Name : " + name);
    System.out.println("Age : "+ age);
    System.out.println("Grade : " + grade);
    System.out.println("Salary : " + salary);

    sc.close();


    //print multi variables
    int x = 10, y=20, z=30;
    System.out.println("x + y + z = " + (x+y+z));
    

    //One value to Multiple variables
    int x, y, z;
    x = y = z = 60;
    System.out.println(x + y + z);


    //variable Scope
    int globalVar = 100; // Global Variable

    {
      int locarVar = 50; // create a local variable
      System.out.println("Global variable : " + globarVar);
      System.out.println("Local Variable : " + localVar);

    }
    // System.out.println("Global variable : " + globarVar); // Accessible
    // System.out.println("Local Variable : " + localVar); // Error: localVar is not accessible outside the block


    //Java Identifiers
    int pagesPerBook = 300; //Valid Identifier
    //int 2ndNumber = 5; // Invalid Identifier : Cannot start with a digit
    // int my var = 10; //Invalid Identifier : Cannot contain spaces
    // int int = 20; // Invalid Identifier : Cannot use reserved keywords
  }
}


