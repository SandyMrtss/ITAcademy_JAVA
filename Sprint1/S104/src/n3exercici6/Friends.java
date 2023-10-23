package n3exercici6;

import java.util.*;

public class Friends {
    private String[] childhoodFriends;

    {
        this.childhoodFriends = new String[]{"Pepito", "Juanito", "Menganito" };
    }
    public boolean isChilhoodFriend(String name) throws ArrayIndexOutOfBoundsException{
        boolean found = false;
        for(int i = 0; i <= childhoodFriends.length; ++i){
            if(childhoodFriends[i].equals(name)){
                return true;
            }
        }
        return found;
    }
}
