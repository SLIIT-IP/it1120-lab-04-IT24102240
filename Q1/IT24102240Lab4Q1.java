
import java.util.Scanner;

public class IT24102240Lab4Q1{
public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter a amount: ");
    double num = userInput.nextDouble();

    if(num > 0){
        System.out.println("The number is Positive");

    } else if (num <0){
        System.out.println("The number is Negative");

    } else if(num == 0){
        System.out.println("The number is Zero");

    }
    userInput.close();
}
}