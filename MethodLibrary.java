//Tito Rivera trivera26@toromail.csudh.edu

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class MethodLibrary {

    public static void main(String[] args)throws Exception{

        MyDate newDate = new MyDate("10/10/2010");

        System.out.println(newDate);

    }

    //Takes an array of integers and finds the smallest number in array.
    public static int smallest(int[] numbers){
        final int MAX_VALUE=2147483646;
        int newMax = MAX_VALUE;
        for(int x=0; x< numbers.length;x++){
            if (numbers[x]<newMax){
                newMax = numbers[x];
            }
        }
        return newMax;
    }

    //Takes a string and searches an array of strings to see if there are any matches.
    //Prints out index of match, if not prints -1.
    public static int search(String[] stringArray, String searchString){
        int indexNumbers = -1;
        for(int x=0; x< stringArray.length;x++){

            if (stringArray[x].equalsIgnoreCase(searchString)){
                indexNumbers = x;
            }
        }
        return indexNumbers;
    }

    //Shifts position of char by amount n characters using ASCII table.
    public static char shiftChar(char c, int n){
        char newC = c;
        newC = (char)(newC+n);
        return newC;
    }

    //Shifts only uppercase letters and does not go past Z. Will circle back around.
    public static char circularShift(char c, int n){
        char newC = c;
        if(newC>64&&newC<91){
            newC = (char)(newC+n);
            while(newC > 90){
                newC = (char)(newC-26);
            }
        }
        return newC;
    }

    //Reads the contents of a file and returns it as a string.
    public static String readFile(String fileName){
        File newFile = new File(fileName);
        String fileDone = "";
        try{
            Scanner reader = new Scanner(newFile);
            while(reader.hasNext()){
                fileDone = fileDone + reader.nextLine();
            }
        } catch(FileNotFoundException fne){
            System.out.println(fne.getMessage());
        }
        return fileDone;
    }

    //Shifts each individual letter of a string to the amount n input.
    public static String shiftString(String input, int n) {
        String newS = input;
        int newI = n;
        char[] newArray = newS.toCharArray();
        for (int x = 0; x<newS.length();x++){
            if(newArray[x]>64&&newArray[x]<91){

                newArray[x] = (char)(newArray[x] + newI);
                while(newArray[x]>90){
                    newArray[x] = (char)(newArray[x]-26);
                }
            }
        }
        String newString = String.valueOf(newArray);

        return newString;
    }

    //Takes two dates as input and returns the number of days that have passed between
    //the two days.
    public static long daysElapsed(Date from, Date to){

        long ms = from.getTime()-to.getTime();
        ms = ms/86400000;

        long value = ms;

        return value;
    }

    public static Date createDate(String date) throws ParseException{ //1 point

        String newDate = date;

        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yy");

        Date value = dt.parse(newDate);

        return value;
    }

    public static String dayOfWeek(String date)throws ParseException{ //1 point

            Date newDate = createDate(date);

            SimpleDateFormat dt = new SimpleDateFormat("E");

            String value = dt.format(newDate);

        return value;
    }

}