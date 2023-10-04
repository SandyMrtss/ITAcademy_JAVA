package n2exercici1;

public class Main{
    public static void main(String[] args) {
        int edat;
        edat = Entrada.llegirInt("Edat?");
        System.out.println(edat);

        char c;
        c = Entrada.llegirChar("Char?");
        System.out.println(c);

        String frase;
        frase = Entrada.llegirString("Frase?");
        System.out.println(frase);

        boolean correct;
        correct = Entrada.llegirSiNo("Correcte? s/n");
        System.out.println(correct);

    }
}