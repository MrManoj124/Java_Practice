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
    System.out.println("Enter your age : ");
    System.out.println("Enter your grade : ");
    System.out.println("Enter your salary : ");

    String name = sc.nextLine();
    int age = sc.nextInt();

  }
}


