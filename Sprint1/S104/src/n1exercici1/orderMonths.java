package n1exercici1;

import java.util.*;

public class orderMonths{
    static class compareMonths implements Comparator<Month>{
        @Override
        public int compare(Month month1, Month month2) {
            return month1.compareTo(month2);
        }
    }

    public static List<String> getList()
    {
        SortedSet<Month> months = new TreeSet<>(new compareMonths());
        String[] unorderedMonths = {"abril", "gener", "desembre", "juny", "juny", "novembre", "febrer", "setembre", "juliol", "març", "octubre", "maig", "agost"};
        for (String month : unorderedMonths) {
            months.add(new Month(month));
        }
        List<String> orderedList = new ArrayList<>();
        for (Month month : months) {
            orderedList.add(month.getName());
        }
        return orderedList;
    }
}
