//Tito Rivera trivera26@toromail.csudh.edu

import java.util.*;
import java.io.*;
import java.lang.reflect.Method;

public class MyFileReader {

    private String fileName;
    private String newFileRead;

    public MyFileReader(String fileName){

        newFileRead = MethodLibrary.readFile(fileName);

        File newFile = new File(fileName);

        try{
        Scanner reader = new Scanner(newFile);
        }
        catch(FileNotFoundException fne){
            System.out.println(fne.getMessage());
        }

    }

    public String readEntireText(boolean uppercase){

        String newUpperFile = newFileRead; 

        if (uppercase == true){
            System.out.println("Hello");
            newUpperFile = newFileRead.toUpperCase();
        }

        return newUpperFile;

    }

    public String[] read(){

        String newArray[] = newFileRead.split("\r?\n|\r");

        return newArray;

    }

    public String toString(){

        return newFileRead;

    }

    public String encrypt(int n){

        String oldEncrypt = newFileRead.toUpperCase();

        String newEncrypt = MethodLibrary.shiftString(oldEncrypt, n);

        return newEncrypt;

    }

}