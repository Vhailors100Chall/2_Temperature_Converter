import java.util.Scanner;

/**
 * Created by Dominik on 28.12.2016.
 */
public class TemperatureConverter {

    public static void main(String[] args){

        System.out.println("If you want convert C to F type c, if F to C type f");
        Scanner scan1=new Scanner(System.in);
        String type=scan1.nextLine();

        if(type.equals("c")){
            System.out.println("Type temperature");
            Scanner scan = new Scanner(System.in);
            int value = scan.nextInt();
            value=value*9/5+32;
            System.out.println(value);
        }

        else if(type.equals("f")) {
            System.out.println("Type temperature");
            Scanner scan = new Scanner(System.in);
            int value = scan.nextInt();
            value=(value-32)*5/9;
            System.out.println(value);
        }
        else System.out.println("Type properly value");


    }
}