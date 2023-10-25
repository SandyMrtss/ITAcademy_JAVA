package n2exercici3;

public class MyMathCalculator{
    @FunctionalInterface
    public interface Operacio{
        float operacio(int a, int b);
    }
    public float makeOperacio(int a, int b, Operacio op){
        return op.operacio(a, b);
    }
    public static void main(String[] args) {
        MyMathCalculator calculator = new MyMathCalculator();
        Operacio sum = (a, b) -> (float) (a + b);
        Operacio substract = (a, b) -> (float) (a - b);
        Operacio multiply = (a, b) -> (float) (a * b);
        Operacio divide = (a, b) -> ((float)a/(float) b);

        int a = 1;
        int b = 2;

        System.out.println(calculator.makeOperacio(a,b,sum));
        System.out.println(calculator.makeOperacio(a,b,substract));
        System.out.println(calculator.makeOperacio(a,b,multiply));
        System.out.println(calculator.makeOperacio(a,b,divide));

    }
}

