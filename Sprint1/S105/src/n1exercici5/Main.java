package n1exercici5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Friend friend = new Friend("Pepe", "Diaz", 23);
        String fileName = "friend.ser";
        try{
            MySeriazilator.serialize(friend, fileName);
        }
        catch (IOException  ex){
            ex.printStackTrace();
        }
        Friend newFriend = null;
        try{
            newFriend = (Friend) MySeriazilator.deserialize(fileName);
        }
        catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println(friend);
        System.out.println(newFriend);
    }
}
