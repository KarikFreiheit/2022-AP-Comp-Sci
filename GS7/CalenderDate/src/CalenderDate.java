import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class CalenderDate implements Comparable<CalenderDate> {



    public static void main(String[] args){
        ArrayList<CalenderDate> dates = new ArrayList<CalenderDate>();
        dates.add(new CalenderDate(1995, 3, 6));
        dates.add(new CalenderDate(2022, 2, 3));
        dates.add(new CalenderDate(2003, 6, 7));

        System.out.println(dates);
        Collections.sort(dates);
        System.out.println(dates);
    }


    private int year;
    private int month;
    private int day;

    public CalenderDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;

    }


    public int compareTo(CalenderDate other){
        if(year != other.year){
            return year - other.year;
        }else if(month != other.month){
            return  year - other.year;
        }else{
            return day - other.day;
        }
    }

    public int getYear() {
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

    public  String toString(){
        return month + "/" + day + "/" + year;
    }
}
