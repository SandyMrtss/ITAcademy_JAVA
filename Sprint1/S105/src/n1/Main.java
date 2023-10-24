package n1;

import n1.n1exercici1.*;
import n1.n1exercici3.*;
import n1.n1exercici4.WriteFileInConsole;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;


public class Main {
    public static void main(String[] args) {
        if (args.length > 1){
            String action = args[0];
            String dir = args[1];
            Path dirPath = Paths.get(dir);
            switch(action){
                case "listDirectory":
                    MyFileVisitor.listDirectory(dirPath);
                    break;
                case "listTreeDir":
                    try{
                        MyFileVisitor printf = new MyFileVisitor();
                        Files.walkFileTree(dirPath, printf);
                    }
                    catch (IOException ex){
                        ex.printStackTrace();
                    }
                    break;
                case "writeTreeDir":
                    WriteTreeDir.writeTreeTxt(dirPath);
                    break;
                case "writeFileInConsole":
                    WriteFileInConsole.writeInConsole(dir);
                    break;
                default:
                    System.out.println("Please input valid arguments");
                    break;
            }
        }
        else{
            System.out.println("Please write the desired action followed by the directory's path");
        }
    }
}
