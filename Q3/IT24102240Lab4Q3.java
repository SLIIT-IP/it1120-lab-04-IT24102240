
import java.util.Scanner;

public class IT24102240Lab4Q3 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a amount: ");

        double num = userInput.nextDouble();

        String ternary = (num > 0) ? "The number is Positive"
                : (num < 0) ? "The number is Negative"
                        : "The number is Zero";

        System.out.println(ternary);

        userInput.close();
    }
}
