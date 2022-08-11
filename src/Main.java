import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Recall r = new Recall();
        r.sakib();
        //        array in java
        Scanner userInput1 = new Scanner(System.in);
        System.out.print("Enter the item number for search: ");
        int search = userInput1.nextInt();
        int[] neamoth = {10,20,30,40,50};
        System.out.println(neamoth[search]);

    }
}