import java.util.*;

public class variable {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Variable in Java:
        // Number Type:
        System.out.print("Enter a Byte value: ");
        byte bt = userInput.nextByte();
        System.out.print("Enter a Integer value: ");
        int i = userInput.nextInt();
        System.out.print("Enter a Float value: ");
        float f = userInput.nextFloat();
        System.out.print("Enter a boolean value: ");
        boolean b = userInput.nextBoolean();
        System.out.print("Enter a double int value: ");
        double d = userInput.nextDouble();
        System.out.print("Enter a long value: ");
        long l = userInput.nextLong();
        //String in java
        String s = "This is an string";
//        String intString = userInput.nextLine();
//        int conv = Integer.parseInt(intString);
        char ch = 'C';

        System.out.println("Data Type "+((Object)i).getClass().getSimpleName()+ ":" +" " + i);
        System.out.println("Data Type "+((Object)bt).getClass().getSimpleName()+ ":" +" " + bt);
        System.out.println("Data Type "+((Object)f).getClass().getSimpleName()+ ":" +" " + f);
        System.out.println("Data Type "+((Object)b).getClass().getSimpleName()+ ":" +" " + b);
        System.out.println("Data Type "+((Object)d).getClass().getSimpleName()+ ":" +" " + d);
        System.out.println("Data Type "+((Object)l).getClass().getSimpleName()+ ":" +" " + l);
        System.out.println("Data Type "+((Object)s).getClass().getSimpleName()+ ":" +" " + s);
        System.out.println("Data Type "+((Object)ch).getClass().getSimpleName()+ ":" +" " + ch);
//        System.out.println("Data Type "+((Object)conv).getClass().getSimpleName()+ ":" +" " + intString);

    }
}
