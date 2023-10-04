package n1exercici2;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            lista1.add(i);
        }

        System.out.println("Llista 1:");
        for(Integer i : lista1){
            System.out.printf("%d ", i);
        }
        System.out.println();

        List<Integer> lista2 = new LinkedList<>();
        ListIterator<Integer> it = lista1.listIterator(lista1.size());
        while (it.hasPrevious()){
            lista2.add(it.previous());
        }

        System.out.println("Llista 2:");
        for(Integer i : lista2){
            System.out.printf("%d ", i);
        }
    }
}
