package homework.educationCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static String toSimpleDate(Date date) {
        return sdf.format(date);
    }

    public static Date toDate(String date) throws ParseException {
        return sdf.parse(date);
    }
}
