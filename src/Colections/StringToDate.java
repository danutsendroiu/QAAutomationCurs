package Colections;
/*
String sDate1="31/12/1998";
String sDate2 = "31-Dec-1998";
String sDate3 = "12 31, 1998";
String sDate4 = "Thu, Dec 31 1998";
String sDate5 = "Thu, Dec 31 1998 23:37:50";
String sDate6 = "31-Dec-1998 23:37:50";
 */


import Utils.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        StringToDate object = new StringToDate();
//        object.stringToDateConvertor(Utils.scanner().next());
        object.stringToDateConvertor2(Utils.scanner().next());

    }

    public void stringToDateConvertor(String date) {
//        The date format has to be: yyyy-mm-dd
        int yerar = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        System.out.println(" The year is: " + yerar + "\n " + "The month is: " + month + "\n " + "The day is: " + day);


    }

    public void stringToDateConvertor2(String date) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = format1.parse(date);
        System.out.println(date1);


    }

}
