import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        /* This code is an according to the course formet of
        w3school
         */
        System.out.print("Enter your name: ");
        // UserInput
        Scanner userinput = new Scanner(System.in);
        String name = userinput.nextLine();
        String userName = "Hello, ";
        System.out.print("Enter your Age: ");
        int age = userinput.nextInt();
        System.out.println("Welcome to Bangladesh Road Transport Authority");
        //String concatenation
        System.out.println(userName + name );
        System.out.println("Your age is, "+ age);
        String status = "Driving Status:";
        System.out.println(status);
        //if-else
        if(age>=18){
            // Nasted if else
            if (age<50) {
                System.out.println("You are eligible for driving license");
            }
            else{
                System.out.println("Sorry to say but, you can not drive in this age");
            }
        }else {
            System.out.println("Sorry, You are underage to have a driving licence yet...!");
        }
        System.out.println("Enter a number To print serial");
        int number = userinput.nextInt();
        do{
            number = number+number;
            System.out.println(number);
        }while (number < 5);
    }
}
