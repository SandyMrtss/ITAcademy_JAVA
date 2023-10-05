package n1exercici1;

import java.util.HashMap;

public class MonthWithOrder implements Comparable<String> {
    private final String name;
    private final int position;


    public MonthWithOrder(String name, int position){
        this.name = name;
        this.position = position;
    }

    static int getMonthPosition(String name, HashMap<String, int> orderKey) {
        return orderKey.get(name);
    }

    static HashMap<String, int> mapMonthValue(String[] monthInOrderList){
        HashMap<String, int> orderKey = new HashMap<String, int>();
        for (int i = 0; i < monthInOrderList.length; i++){
            orderKey.put(monthInOrderList[i],i );
        }
        return orderKey;
    }

    @Override
    public int compareTo(String month){
        HashMap<String, int> orderKey = mapMonthValue()
       // int position = getMonthPosition(month,);
        return this.position > month.position;
    }

}
