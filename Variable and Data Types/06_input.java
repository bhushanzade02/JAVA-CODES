import java.util.*;


public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // input syntax for a single word 
        String input=sc.next();
        System.out.println(input);

    // input syntax for a line multiple word
        String name=sc.nextLine();
        System.out.println(name); 
        
        // input syntax for a intger
        int num =sc.nextInt();
        System.out.println(num);
        
        // input syntax for a Float values
        float price=sc.nextFloat();
        System.out.println(price);

        // input syntax for a byte
        byte bhus=sc.nextByte();
        System.out.println(bhus);

        // input syntax for a boolean(true or false)
        boolean sanj=sc.nextBoolean();
        System.out.println(sanj);
        
        // input syntax for a long
        long pun=sc.nextLong();
        System.out.println(pun);
    }
}