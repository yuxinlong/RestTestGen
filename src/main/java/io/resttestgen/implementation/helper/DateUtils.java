package io.resttestgen.implementation.helper;

import io.resttestgen.core.Environment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class DateUtils {
    private static String dateFormate = "yyyy-MM-dd HH:mm:ss";

    static {
        loadDefaultFormat();
    }

    private static void loadDefaultFormat() {
        Map<String, Object> apiParamMap = Environment.getInstance().getDictionaryMap();
        Map<String, Object> partitionParam = (Map<String, Object>) apiParamMap.get("partition");
        String dateFormate = (String) partitionParam.getOrDefault("rangeFormate", null);
        DateUtils.dateFormate = Objects.requireNonNullElse(dateFormate, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date getDefaultStartDateStr() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -1);

        return calendar.getTime();
    }

    public static Date getDefaultEndDateStr() {
        Calendar calendar = Calendar.getInstance();

        return calendar.getTime();
    }

    public static String getDateFormateStr(Date date) {

        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormate);

        return dateFormat.format(date);
    }

    public static Date getDateBetweenStartAndEndDate(Date startDate, Date endDate) {
        if (startDate == null || endDate == null || startDate.after(endDate)) {
            throw new IllegalArgumentException("Invalid date range");
        }

        long startMillis = startDate.getTime();
        long endMillis = endDate.getTime();

        long randomMillis = startMillis + (long) (Math.random() * (endMillis - startMillis));

        return new Date(randomMillis);
    }
    public static Date StrToDate(String dateString){

        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormate);

        try {

            return dateFormat.parse(dateString);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
