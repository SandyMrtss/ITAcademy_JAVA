package n1exercici1;

import java.util.HashMap;
import java.util.Map;

public class Month implements Comparable<Month> {
    private String name;
    private int position;
    static final String[] monthListInOrder = {"gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre"};
    static Map<String, Integer> orderKey = new HashMap<>();

    {
        for (int i = 0; i < monthListInOrder.length; i++){
            orderKey.put(monthListInOrder[i], i);
        }
    }
    public Month(){}
    public Month(String name){
        this.name = name;
        this.position = orderKey.get(this.name);
    }
    public int getPosition() {
        return this.position;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public int compareTo(Month month){
        return this.position - month.position;
    }

}
