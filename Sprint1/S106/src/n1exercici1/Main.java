package n1exercici1;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 7;
        NoGenericMethods n = new NoGenericMethods(x, y, z);
        NoGenericMethods m = new NoGenericMethods(z, x, y);
        NoGenericMethods o = new NoGenericMethods(y, z, x);
    }
}
