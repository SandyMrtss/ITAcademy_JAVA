package n1exercici2;
public class CalculoDni {

    private static char[] letterKey = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public static char calcLetter(int dni) {
        return letterKey[dni % 23];
    }
}
