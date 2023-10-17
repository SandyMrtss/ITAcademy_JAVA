package n2exercici2;

import java.util.ArrayList;

public class GenericMethodsModifiedAgain {
    public static <T> void printArguments(ArrayList<T> myList) {
        for (T element : myList){
            System.out.println(element);
        }
    }
}
