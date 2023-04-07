package helloWorld;
import java.util.Scanner;
public class helloWorld {
	
	
	
public static void  main (String [] args) 
{	
	//User input
    Scanner scan = new Scanner(System.in);
    
    //Error checking when the number isnt an integer 
    System.out.println("Please enter a number: ");
    String  x =scan.next();
try{
    //Converting the String into an integer 
    //Call the method
    math(Integer.parseInt(x));
     
}catch (NumberFormatException e)
{   
	//I want to make this into a loop ???????????
    System.out.println("Number entered isnt a Integer.Try again: ");
    x =scan.next();
    math(Integer.parseInt(x));
}
  
}
	
	
public static void math(int x)
{  //lets check if number can be divided into 2
    if(x % 2== 0)
    System.out.println("Number is even");
    else
        System.out.println("Number is odd");
}}


