import java.util.Scanner;
import java.util.*;

public class Commandline {
    public static void main(String k[]) {
        try {
            int a, b, c;
            a = Integer.parseInt(k[0]);
            b = Integer.parseInt(k[1]);
            System.out.println(a);
            System.out.println(b);

        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("End Of The Program");
    }

}
