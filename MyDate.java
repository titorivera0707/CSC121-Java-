//Tito Rivera trivera26@toromail.csudh.edu

import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.Math;

public class MyDate {

    private long ms;
    private long s;
    private int m;
    private int h;
    private int d;
    private int w;
    private int months;
    private int y;
    private String rawDate;
    
    public MyDate(String date) throws Exception {

        String newDate = date;
        
        Date today = new Date();

        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        Date dt = df.parse(newDate);

        long newMS = (today.getTime() - dt.getTime());

        ms = (Math.abs(newMS));
        s = ms/1000;
        m = (int)s/60;
        h = m/60;
        d = h/24;
        w = d/7;
        months = w/30;
        y = months/12;

        rawDate = df.format(dt);

    }

    public String toString(){
        return "Since " +rawDate+" there have been:\n\n"+"-  "+ms+" milliseconds\n"+"-  "+s+" seconds\n"+"-  "+m+" minutes\n"+"-  "+h+" hours\n"+"-  "+d+" days\n"+"-  "+w+" weeks\n"+"-  "+months+" months\n"+"-  "+y+" years";

    }

}