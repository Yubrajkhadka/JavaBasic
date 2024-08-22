//Write a program to take a string input and display its length and last character
import java.util.Scanner;
public class StringExample1 {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String s = sc.nextLine();
    System.out.println("The length of the string is "+ s.length());
    System.out.println("The last character of the string is  "+ s.substring(s.length()-1));


}
}
