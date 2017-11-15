package com.example.ramsesdiezgalvan.actividad1android;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by ramsesdiezgalvan on 13/11/17.
 */

public class DataHolder {

    static public DataHolder instance = new DataHolder();



    public String name;
    public String email;
    public String phone;
    public String add;
    public int yy;
    public int mm;
    public int dd;
    public Calendar cal;

    public DataHolder() {
        name = "";
        email = "";
        phone = "";
        add = "";
        cal = Calendar.getInstance();
        yy = cal.get(Calendar.YEAR);;
        mm = cal.get(Calendar.MONTH);
        dd = cal.get(Calendar.DAY_OF_MONTH);
    }


}
