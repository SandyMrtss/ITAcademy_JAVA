package n1exercici2;

public class GenericMethods{
    public static <T> void printArguments(T a, T b, T c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
