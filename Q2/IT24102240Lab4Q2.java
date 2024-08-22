import java.util.Scanner;

public class IT24102240Lab4Q2 {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    double examMark,labMark,examPer,labPer,finalMark;
    
    System.out.print("Please enter the exam mark (out of 100): ");
    examMark = userInput.nextDouble();

    if(examMark<0 || examMark>100){
        System.out.println("Invalid input for exam mark. Terminating program");
        return;
    }

    System.out.print("Please enter the lab mark (out of 100): ");
    labMark = userInput.nextDouble();

    if(labMark <0 || labMark >100){
        System.out.println("Invalid input for lab mark. Terminating program.");
        return;
    }

    System.out.print("Please enter the percentage given for the exam: ");
    examPer = userInput.nextDouble();
    System.out.print("Please enter the percentage given for the lab submission: ");
    labPer = userInput.nextDouble();

    if(examPer + labPer !=100){
    System.out.println("Thew percentage must add up to 100. Terminating program");
    return;

    }

    finalMark = ((examMark * examPer/100) + (labMark * labPer/100));

    System.out.println("Final Exam Mark: " + finalMark);

    userInput.close();
    
    }
}
