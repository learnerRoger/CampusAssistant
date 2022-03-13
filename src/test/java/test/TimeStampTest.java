package test;

import org.junit.Test;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampTest {

    @Test
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String strBeginDate = dateFormat.format(date.getTime());
        System.out.println(Timestamp.valueOf(strBeginDate).getClass().toString());
    }
}
