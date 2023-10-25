package n2exercici2;

import java.util.*;

public class Main {
    static String intParityString(List<Integer> list){
        StringBuilder stringBuilder = new StringBuilder();
        list
                .forEach(n -> {
                    if(n%2==0){
                        stringBuilder.append("e");
                    }
                    else{
                        stringBuilder.append("o");
                    }
                    stringBuilder.append(n).append(",");
                });
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 299, 300, 2345, 3290);
        System.out.println(intParityString(integerList));

    }
}
