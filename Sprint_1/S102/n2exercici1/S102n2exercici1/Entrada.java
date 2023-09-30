package S102n2exercici1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    static Scanner in = new Scanner(System.in);

    public static byte llegirByte(String missatge){
        while (true){
            System.out.println(missatge);
            byte b;
            try {
                b = in.nextByte();
                in.nextLine();
                return b;
            }
            catch(InputMismatchException ex) {
                System.out.println("Error de format");
                in.nextLine();
            }
        }
    }
    public static int llegirInt(String missatge){
        while (true){
            System.out.println(missatge);
            int i;
            try {
                i = in.nextInt();
                in.nextLine();
                return i;
            }
            catch(InputMismatchException ex) {
                System.out.println("Error de format");
                in.nextLine();
            }
        }

    }
    public static float llegirFloat(String missatge){
        while (true){
            System.out.println(missatge);
            float f;
            try {
                f = in.nextFloat();
                in.nextLine();
                return f;
            }
            catch(InputMismatchException ex) {
                System.out.println("Error de format");
                in.nextLine();
            }
        }

    }
    public static double llegirDouble(String missatge){
        while (true){
            System.out.println(missatge);
            double d;
            try {
                d = in.nextDouble();
                in.nextLine();
                return d;
            }
            catch(InputMismatchException ex) {
                System.out.println("Error de format");
                in.nextLine();
            }
        }
    }
    public static char llegirChar(String missatge){
        while (true){
            System.out.println(missatge);
            String s;
            char c;
            try {
                s = in.nextLine();
                c = s.charAt(0);
                return c;
            }
            catch(Exception ex) {
                System.out.println("Error de format");
                in.nextLine();
            }
        }
    }
    public static String llegirString(String missatge){
        while (true){
            System.out.println(missatge);
            String s;
            try {
                s = in.nextLine();
                return s;
            }
            catch(Exception ex) {
                System.out.println("Error de format");
                in.nextLine();
            }
        }
    }
    public static boolean llegirSiNo(String missatge){
        while (true){
            System.out.println(missatge);
            String s;
            try {
                s = in.nextLine();
                if (s.charAt(0) == 's') {
                    return true;
                }
                else if (s.charAt(0) == 'n') {
                    return false;
                }
                throw new Exception();
            }
            catch(Exception ex) {
                System.out.println("Error de format");
                in.nextLine();
            }
        }
    }
}
