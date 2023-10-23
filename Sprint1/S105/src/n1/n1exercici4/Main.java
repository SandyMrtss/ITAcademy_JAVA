package n1.n1exercici4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's the file name?");
        String fileName = in.nextLine();
        WriteFIleInConsole.writeInConsole(fileName);
        in.close();
    }
}
