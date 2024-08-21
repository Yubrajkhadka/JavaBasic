import java.util.Scanner;
public class IF_Example {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Marks: ");
        int marks = sc.nextInt();
        if (marks >90 && marks <= 100){
            System.out.println("You got Grade A+");
        }
        if (marks > 80 && marks <= 90){
            System.out.println("You got Grade A");
        }
        if (marks >70 && marks <=80){
            System.out.println("Youu got a Grade B+");
        }
        if (marks > 60 && marks <= 70){
            System.out.println("You got a Grade C+");
        }
        if(marks >50 && marks <=60) {
            System.out.println("You got a Grade D+");
        }
        if(marks >40 && marks <=50){
            System.out.println("You got a Grade D");
        }
        if(marks >= 0  && marks <40){
            System.out.println("You Fail In the exam");
        }
        }
    }

