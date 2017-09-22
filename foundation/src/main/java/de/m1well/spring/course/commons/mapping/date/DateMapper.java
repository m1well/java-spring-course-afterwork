package de.m1well.spring.course.commons.mapping.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMapper {

    private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");

    /**
     * formats a java util date to a string with format "dd.MM.yyyy"
     *
     * @param date
     * @return
     */
    public static String mapDateToString(Date date) {
        return dateFormatter.format(date);
    }

    /**
     * formats a string with format "dd.MM.yyyy" to a java util date
     *
     * @param dateString
     * @return
     * @throws ParseException
     */
    public static Date mapStingToDate(String dateString) throws ParseException {
        return dateFormatter.parse(dateString);
    }

}
