import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        double number = userInput.nextDouble();
        if(number > 18){
            System.out.println("you are mature");
        } else if (number < 5 ) {
            System.out.println("Hey baby...!");
        } else{
            System.out.println("You are not mature");
        }
    }
}
