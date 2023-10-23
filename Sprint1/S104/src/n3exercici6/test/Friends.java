package n3exercici6.test;

import java.util.*;

public class Friends {
    private List<String> childhoodFriends = new ArrayList<>();

    {
        childhoodFriends.add("Pepito");
        childhoodFriends.add("Juanito");
        childhoodFriends.add("Menganito");
    }

    public boolean isChilhoodFriend(String name) throws ArrayIndexOutOfBoundsException{
        boolean found = false;
        int i = 0;
        while (!found){
            if(childhoodFriends.get(i).equals(name)){
                return true;
            }
        }
        return found;
    }
}
