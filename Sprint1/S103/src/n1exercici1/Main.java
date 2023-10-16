package n1exercici1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Month gener = new Month("Gener");
        Month febrer = new Month("Febrer");
        Month marc = new Month("Març");
        Month abril = new Month("Abril");
        Month maig = new Month("Maig");
        Month juny = new Month("Juny");
        Month juliol = new Month("Juliol");
        Month agost = new Month ("Agost");
        Month setembre = new Month("Setembre");
        Month octubre = new Month("Octubre");
        Month novembre = new Month("Novembre");
        Month desembre = new Month("Desembre");

        ArrayList<Month> months = new ArrayList<>();
        months.add(gener);
        months.add(febrer);
        months.add(marc);
        months.add(abril);
        months.add(maig);
        months.add(juny);
        months.add(juliol);
        months.add(setembre);
        months.add(octubre);
        months.add(novembre);
        months.add(desembre);

        System.out.println("ArrayList sense agost");
        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println();

        months.add(7, agost);

        System.out.println("ArrayList amb agost");
        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println();

        months.add(gener);      //duplico para asegurarme que el HashSet no tiene duplicados
        HashSet<Month> monthsHashSet = new HashSet<>(months);

        System.out.println("Recorrem HashSet amb un for");
        for (Month month : monthsHashSet) {
            System.out.println(month.getName());
        }
        System.out.println();

        Iterator<Month> it = monthsHashSet.iterator();
        System.out.println("Recorrem HashSet amb un iterador");
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }


    }
}
