package n2exercici1;

public class GenericMethodsModified {
    public static <T> void printArguments(T a, T b, int age) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(age);
    }
}
