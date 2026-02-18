import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks = input.nextInt();

        if(marks >= 75 && marks <=100){
            System.out.println("Result: A");
        }
        else if(marks >=65 && marks <75){
            System.out.println("Result: B");
        }
        else if(marks >=55 && marks <65){
            System.out.println("Result: C");
        }
        else if(marks >=35 && marks <55){
            System.out.println("Result: S");
        }
        else if (marks >=0 && marks <35) {
            System.out.println("Result: F");
        }
        else{
            System.out.println("Invalid Marks");
        }

        input.close();
    }
}